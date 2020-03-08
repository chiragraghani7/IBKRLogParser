import java.util.*;
import java.io.*;

class StringMatcher{
    public static void main(final String args[]) throws IOException {
        final HashMap<String, LogDetails> resultMap = new HashMap<>();
        HashMap<String, String> logMaps;
        final File file = new File("C:\\Users\\Chirag_Raghani\\IB-Java\\demoLog.txt");

        final BufferedReader br = new BufferedReader(new FileReader(file));
        String msgID;

        String st;
        while ((st = br.readLine()) != null) {
            logMaps = RegexUtil.getLogDetailsMap(st);
            msgID = logMaps.get("msgID");
            if (!resultMap.containsKey(msgID)) {
                resultMap.put(msgID, new LogDetails(logMaps));
            } else {
                final LogDetails obj = resultMap.get(msgID);
                obj.increment(logMaps);
            }

        }

        System.out.println(resultMap);
;    }
}