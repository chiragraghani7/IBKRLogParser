import java.util.concurrent.*;
import java.util.*;

class IR{
	static ArrayList<Message> arr = new ArrayList<Message>(){
		{
			add(new Message(1,"Obj1",1));
			add(new Message(2,"Obj2",1));
			add(new Message(3,"Obj3",1));
			add(new Message(4,"Obj4",1));
			add(new Message(5,"Obj5",1));
		}
	};
	public static void insert(Message m,ArrayBlockingQueue<Message> q){
		 q.offer(m);
	}	
}