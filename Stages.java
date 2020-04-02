
import java.util.function.Function;
import java.util.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
class Stages{
    
     static final ArrayList<Function<Message,String>> functionsArr = new ArrayList<>();
     private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
     //method 1
    // public static ArrayList<Function<Message,String>> getStages(){

        
    //     Function<Message,String> f1 = m->  sdf.format(new Timestamp(System.currentTimeMillis())) +" " +m.name+" is in stage1";
    //     Function<Message,String> f2 = m->  sdf.format(new Timestamp(System.currentTimeMillis())) +" " + m.name+" is in stage2";
    //     Function<Message,String> f3 = m->  sdf.format(new Timestamp(System.currentTimeMillis())) +" " + m.name+" is in stage3";
    //     Function<Message,String> f4 = m->  sdf.format(new Timestamp(System.currentTimeMillis())) +" " + m.name+" is in stage4";
    //     Function<Message,String> f5 = m->  sdf.format(new Timestamp(System.currentTimeMillis())) +" " + m.name+" is in final stage 5";

         
    //     functionsArr.add(f1);
    //     functionsArr.add(f2);
    //     functionsArr.add(f3);
    //     functionsArr.add(f4);
    //     functionsArr.add(f5);

    //     return new ArrayList<Function<Message,String>>(functionsArr);
    // }
        //use jsonObject to append jsonString in message now Im just printing
    public String stage1(Message m){
        String result="";
        result+=sdf.format(new Timestamp(System.currentTimeMillis())) +" "+"DEBUG"+" "+"msgID:"+m.msgID+" "+"stageName:stage1"+" msg:"+m.name+" is in stage1"+" json:{\"msgID\":"+"\""+m.msgID+"\""+","+"\"status\":\"successful\""+"}";
        return result;
    }
    public String stage2(Message m){
        String result="";
        result+=sdf.format(new Timestamp(System.currentTimeMillis())) +" "+"DEBUG"+" "+"msgID:"+m.msgID+" "+"stageName:stage2"+" msg:"+m.name+" is in stage2"+" json:{\"msgID\":"+"\""+m.msgID+"\""+","+"\"status\":\"successful\""+"}";
        return result;
    }
    public String stage3(Message m){
        String result="";
        result+=sdf.format(new Timestamp(System.currentTimeMillis())) +" "+"DEBUG"+" "+"msgID:"+m.msgID+" "+"stageName:stage3"+" msg:"+m.name+" is in stage3"+" json:{\"msgID\":"+"\""+m.msgID+"\""+","+"\"status\":\"successful\""+"}";
        return result;
    }
    public String stage4(Message m){
        String result="";
        result+=sdf.format(new Timestamp(System.currentTimeMillis())) +" "+"DEBUG"+" "+"msgID:"+m.msgID+" "+"stageName:stage4"+" msg:"+m.name+" is in stage4"+" json:{\"msgID\":"+"\""+m.msgID+"\""+","+"\"status\":\"successful\""+"}";
        return result;
    }
    public String stage5(Message m){
        String result="";
        result+=sdf.format(new Timestamp(System.currentTimeMillis())) +" "+"DEBUG"+" "+"msgID:"+m.msgID+" "+"stageName:stage5"+" msg:"+m.name+" is in stage5"+" json:{\"msgID\":"+"\""+m.msgID+"\""+","+"\"status\":\"successful\""+"}";
        return result;
    }

}