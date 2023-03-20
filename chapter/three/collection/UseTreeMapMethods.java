package OCP.chapter.three.collection;

import java.util.Map;
import java.util.TreeMap;

public class UseTreeMapMethods {

    public static void main( String[] args ) {

        Map<String, String> map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");
        System.out.println(food);
        for(String key : map.keySet()) {
            System.out.println(key + ",");
        }

    }
}
