import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Variable {
    private int depth=-1;
    private final List<LinkedHashMap<String,String>> hashMap = new LinkedList<>();
    private final LinkedHashMap<String,String> totalHashMap =new LinkedHashMap<>();
    void increment(){
        depth++;
        hashMap.add(new LinkedHashMap<>());
    }
    void decrement(){
        depth--;
        for(String s: hashMap.get(depth+1).keySet())
            totalHashMap.remove(s);
        hashMap.remove(depth+1).clear();
    }

    public void put(String key, String value) {
        hashMap.get(depth).put(key,value);
        totalHashMap.put(key,value);
    }
    public String get(String key) {
        return totalHashMap.get(key);
    }
}
