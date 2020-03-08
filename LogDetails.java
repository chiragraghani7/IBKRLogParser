import java.util.*;
class LogDetails{
    int stageCount;
    HashMap<String,String> logDetailMap;
    LogDetails(HashMap<String,String> hm){
        this.logDetailMap = hm;
        this.stageCount = 0;
    }
    

    public void increment(HashMap<String,String> hm){
        this.logDetailMap = hm;
       
        if(logDetailMap.get("json").indexOf("status")!=-1){
            String splitArray[] = logDetailMap.get("json").split(":");
            if(!splitArray[1].replace("\"", "").startsWith("un")){
                this.stageCount++;
            }
            
        }

    }

    public String toString(){
        return "Stage Count:"+this.stageCount;
    }

}