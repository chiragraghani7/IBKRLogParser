import java.util.concurrent.*;

import java.util.*;
class Resources{
    

    static int capacity = IR.arr.size();

    
    static ArrayBlockingQueue<Message> q1 = new ArrayBlockingQueue<Message>(capacity);   
    static ArrayBlockingQueue<Message> q2 = new ArrayBlockingQueue<Message>(capacity);   
    static ArrayBlockingQueue<Message> q3 = new ArrayBlockingQueue<Message>(capacity);   
    static ArrayBlockingQueue<Message> q4 = new ArrayBlockingQueue<Message>(capacity);   
    static ArrayBlockingQueue<Message> q5 = new ArrayBlockingQueue<Message>(capacity);

    static LinkedBlockingQueue<String> fileBuffer = new LinkedBlockingQueue<String>();

    static int count = getResources().size();
 

    public static ArrayList<ArrayBlockingQueue<Message>> getResources(){

        
    
        
        ArrayList<ArrayBlockingQueue<Message>> finalArr = new ArrayList<>();
        finalArr.add(q1);
        finalArr.add(q2);
        finalArr.add(q3);
        finalArr.add(q4);
        finalArr.add(q5);

        return finalArr;
    }

}