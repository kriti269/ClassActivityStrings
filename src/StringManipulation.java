import java.util.*;

public class StringManipulation {

    public static void main(String[] args){
        String inputString = "hello hello how Are you HELLO are there happy test you";
        HashMap wordCount = new HashMap<String, Integer>();
        ArrayList<String> inputStringList = new ArrayList(Arrays.asList(inputString.split(" ")));
        for(String word:inputStringList){
            int count = wordCount.get(word.toLowerCase())==null?0:(int)wordCount.get(word.toLowerCase());
            wordCount.put(word.toLowerCase(),++count);
        }
        Iterator mapIterator = wordCount.entrySet().iterator();
        while(mapIterator.hasNext()){
            Map.Entry entry = (Map.Entry) mapIterator.next();
            System.out.print(entry.getKey() + "-->" + entry.getValue());
            if(mapIterator.hasNext()) System.out.println(", ");
        }
    }
}
