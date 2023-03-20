package OCP.chapter.three.collection;

import java.util.Map;
import java.util.HashMap;

public class UseHashMapMethods {

    public static void main( String[] args ) {

        Map<String, String> map = new HashMap<>();
        map.put("koala", "Bamboo");
        map.put("lion", "meat");
        map.put("giraffe","leaf");
        System.out.println(map.get("koala"));
        for(String key : map.keySet()) {
            System.out.println(key + ",");
        }

    }
}
