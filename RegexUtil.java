import java.util.*;
import java.util.regex.*;
class RegexUtil{
    final static String regex = "(\\S+)\\s+(\\S+)\\s+msgID:(\\d+)\\s+stageName:(\\S+)\\s+msg:(.*)json:(\\S+)";
    final static Pattern p = Pattern.compile(regex);
    static ArrayList<String> variables = new ArrayList<String>() { 
        { 
            add("data&time");
            add("logLevel");
            add("msgID");
            add("stageName");
            add("msg");
            add("json"); 
        } 
    };
     static Matcher matcher = null;
    public static HashMap<String,String> getLogDetailsMap(String log){
        
        matcher = p.matcher(log);
        Map<String,String> logDetailsMap = new HashMap<>(); 
        while(matcher.find()){
            for(int i=1;i<=matcher.groupCount();i++){
                logDetailsMap.put(variables.get(i-1),matcher.group(i));
            }
            
        }
        return new HashMap<>(logDetailsMap);
    }
}