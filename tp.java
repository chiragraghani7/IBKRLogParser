import java.util.function.Function;
import java.util.*;

public class tp{
    public static void main(String args[]){
        
 
            Function <Integer, String> inc = e -> e+"hello";
            doSum(5, inc);
     
        }
     
        public static void doSum(int value, Function <Integer, String> func) {
            System.out.println(func.apply(value));
        }
    
}

// class ReadThread implements Runnable{
// 	ArrayBlockingQueue<Message> q1;
// 	ArrayBlockingQueue<Message> q2;
// 	ArrayBlockingQueue<Message> q3;
// 	ArrayBlockingQueue<Message> q4;
// 	ArrayBlockingQueue<Message> q5;
// 	IR ir;
//   int capacity;
// 	ReadThread(ArrayBlockingQueue<Message> q1,ArrayBlockingQueue<Message> q2,ArrayBlockingQueue<Message> q3,ArrayBlockingQueue<Message> q4,ArrayBlockingQueue<Message> q5,
//     IR ir,int capacity){
// 		this.q1 = q1;
// 		this.q2 = q2;
// 		this.q3 = q3;
// 		this.q4 = q4;
// 		this.q5 = q5;
// 		this.ir = ir;
//     this.capacity = capacity;
// 	}
// 	public void run(){
// 		 Thread t1 = new Thread(new Runnable() { 
//             @Override
//             public void run() 
//             {   
//                 try {
//                 int count = capacity;  
//                 while(count-- >0){ 
//                			synchronized(this){
//                       Message m =  q1.take();
//                       m.f1(m);
//                       m.stageNumber++;
//                       ir.insert(m,q2);
//                       //count--;
//                     }
//                   }
                   	
//                 } 
//                 catch (InterruptedException e) { 
//                     e.printStackTrace(); 
//                 } 
//             } 
//         });
// 		 Thread t2 = new Thread(new Runnable() { 
//             @Override
//             public void run() 
//             { 
//                 try {
//                 synchronized(this){ 
//                   int count = capacity;  
//                 while(count-- >0){ 
//                    			Message m =  q2.take();
//                    			//System.out.println(m.name + " " + count);
//                         m.f2(m);
//                    			m.stageNumber++;
//                    			ir.insert(m,q3);
                        
//                       }}
//                   } 
//                 catch (InterruptedException e) { 
//                     e.printStackTrace(); 
//                 } 
//             } 
//         });
// 		 Thread t3 = new Thread(new Runnable() { 
//             @Override
//             public void run() 
//             { 
//                 try { 
//                   synchronized(this){
//                 	int count = capacity;  
//                 while(count-- >0){ 
//                    			Message m =  q3.take();
//                    			//System.out.println(m.name +  " " + count);
//                         m.f3(m);
//                    			m.stageNumber++;
//                    			ir.insert(m,q4);
                        
//                       }
// }
                   		

//                 } 
//                 catch (InterruptedException e) { 
//                     e.printStackTrace(); 
//                 } 
//             } 
//         });
// 		 Thread t4 = new Thread(new Runnable() { 
//             @Override
//             public void run() 
//             { 
//                 try { 
//                   synchronized(this){
//                   int count = capacity;  
//                 while(count-- >0){ 
//                    			Message m =  q4.take();
//                    			//System.out.println(m.name +  " " + count);
//                         m.f4(m);
//                    			m.stageNumber++;
//                    			ir.insert(m,q5);
                        
//                       }
// }
                   		
//                 } 
//                 catch (InterruptedException e) { 
//                     e.printStackTrace(); 
//                 } 
//             } 
//         });
// 		 Thread t5 = new Thread(new Runnable() { 
//             @Override
//             public void run() 
//             { 
//                 try { 
//                   synchronized(this){
//                   int count = capacity;  
//                 while(count-- >0){ 
//                    			Message m =  q5.take();                      
//                    			//System.out.println(m.name +  " " + count);
//                         m.f5(m);
//                    			m.stageNumber++;
//                         System.out.println("In last stage "+m.name);
//                         }      
//                         }          
//                    		                  } 
//                 catch (InterruptedException e) { 
//                     e.printStackTrace(); 
//                 } 
//             } 
//         });
//      t1.start();
//      t2.start();
//      t3.start();
//      t4.start();
//      t5.start();
// 	}
// }

// 	 public void f1(Message m){
//     synchronized(this){
// 		  System.out.println(m.name+ " is in stage 1");
//     }		
// 	}
// 	public void f2(Message m){
//     synchronized(this){
// 		System.out.println(m.name+ " is in stage 2");
//   }
		
// 	}
// 	public void f3(Message m){
//     synchronized(this){
// 		System.out.println(m.name+ " is in stage 3");
//   }
		
// 	}
// 	public void f4(Message m){
//     synchronized(this){
//     System.out.println(m.name+ " is in stage 4");
//     }		
//   }
//   public void f5(Message m){
//     synchronized(this){
//     System.out.println(m.name+ " is in stage 5");
//     }		
//   }
