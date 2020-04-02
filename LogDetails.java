import java.util.*;
class LogDetails{
    int stageCount;
    HashMap<String,String> logDetailMap;
    LogDetails(HashMap<String,String> hm){
        this.logDetailMap = hm;
        this.stageCount = 1;
    }
    

    public void increment(HashMap<String,String> hm){
        this.logDetailMap = hm;
       
        if(logDetailMap.get("json").indexOf("status")!=-1){
            String splitArray[] = logDetailMap.get("json").split("\"status\":");
            if(!splitArray[1].replace("\"", "").startsWith("un")){
                //System.out.println(splitArray[1].replace("\"", ""));
                this.stageCount++;
            }
            // for (String string : splitArray) {
            //     if(string.replace("\"","").startsWith("un")){

            //     }
            // }
            
        }

    }

    public String toString(){
        return "Stage Count:"+this.stageCount;
    }

}