import java.util.concurrent.*;
import java.util.function.Function;
import java.util.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;  

class ExecuteFunction  extends Thread {
    ArrayBlockingQueue<Message> queue;
    ArrayBlockingQueue<Message> nextQueue;
    ArrayList<String> stageNames;
    int capacity;
    Stages s;
    
    ExecuteFunction(ArrayBlockingQueue<Message> queue,ArrayBlockingQueue<Message> nextQueue,Stages s,ArrayList<String> stageNames,int capacity){
      this.queue = queue;
      this.nextQueue = nextQueue;
      this.s = s;
      this.stageNames = stageNames;
      this.capacity = capacity;
      
     
    }
    public void run(){
        
          try{
              int count = capacity; 
              String write=""; 
              while(count-- >0){ 
                  
                    Message m =  queue.take();
                    int stageNumber = m.stageNumber;
                  Object output = s.getClass().getMethod(stageNames.get(stageNumber-1), Message.class).invoke(s,m);
                  write = (String)output;
                  //synchronized(this){
                  System.out.print(write+"\n");
                  Resources.fileBuffer.put(write);
                 // System.out.println("Im queue: "+Resources.fileBuffer);
                  
                    //System.out.println(Stages.getStages().get(stageNumber-1).apply(m));
                    m.stageNumber++;
                    if(nextQueue!=null){
                        IR.insert(m,nextQueue);
                    }
                      
                }
                  
              }
               
            catch (Exception e) { 
                e.printStackTrace(); 
            }
            finally{
              Resources.count--;
            }
            
              
      }
     
  }
  