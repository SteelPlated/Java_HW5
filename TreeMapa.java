import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;
public class TreeMapa {
public static void main(String[] args) {
    String str = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
    Map<Integer, ArrayList<String>> counter = new TreeMap<>();
    String[] wordList = str.split(" ");
        for(int i = 0; i < wordList.length; i++) {
            String s = wordList[i];
            Integer key = s.length();
                if(counter.containsKey(key)) {
                    counter.get(key).add(s);
                }
            else {
                ArrayList<String> al = new ArrayList<String>();
                al.add(s);
                counter.put(key, al);
            }
        }
        for(Integer key : counter.keySet()) {
        System.out.printf("%s [%s] ", key, String.join(", ", counter.get(key)));
        }
    }
}