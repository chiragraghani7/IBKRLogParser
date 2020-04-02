import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;

class WriterThread extends Thread{
    BufferedWriter bw;
    WriterThread(BufferedWriter bw){
        this.bw=bw;
    }

    public void run(){
        
        try{
            // int capacity = Resources.fileBuffer.remainingCapacity();
            while(Resources.count > 0){ 
                
                  String s =  Resources.fileBuffer.take();
                  //System.out.println("from writer thread : "+s);
                  bw.write(s);
                  bw.newLine();
                  //System.out.println("remaining capacity"+Resources.fileBuffer.remainingCapacity());
                    
              }
                
            }
             
          catch (Exception e) { 
              e.printStackTrace(); 
          }
          finally{
              try{
                  bw.close();
              }catch(IOException e){
                  e.printStackTrace();
              }
          }
          
            
    }
}