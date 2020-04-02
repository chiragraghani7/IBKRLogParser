import java.util.concurrent.*;

import java.util.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.FileWriter;  
import java.io.*;


public class LogDemo {

    
    public static void main(String[] args) throws Exception{
    	
        
        int capacity = IR.arr.size();
        Resources obj = new Resources();
        ArrayList<ArrayBlockingQueue<Message>> finalArr = obj.getResources();
        Stages s = new Stages();
        ArrayList<String> stageNames = new ArrayList<String>(){
            {
                add("stage1");
                add("stage2");
                add("stage3");
                add("stage4");
                add("stage5");
            }

        };
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Chirag_Raghani\\IB-Java\\LogAnalyzer\\demoLog.txt",false));


        new WriterThread(bw).start();

       
      
            //doubt can send single object s and can send new object for each stage to be called by this obj
        for(int i=0;i<finalArr.size();i++){
            
            if(i+1!=finalArr.size()){
            new ExecuteFunction(finalArr.get(i),finalArr.get(i+1),new Stages(),stageNames,capacity).start();
            }else{
                new ExecuteFunction(finalArr.get(i),null,new Stages(),stageNames,capacity).start();  
            }
            
        }
        

  		for (Message message : IR.arr) {
  			IR.insert(message,Resources.q1);
          }
         
          
    }
}


