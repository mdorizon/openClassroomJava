import java.util.HashMap;
import java.util.Map;

public class map {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Jean", 34);
        map.put("Anais", 25);

        map.put("Jean", 89);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            printEntry(entry);
        }
    }

    // Affiche une entrée d'un dictionnaire
    static void printEntry(Map.Entry entry){
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}