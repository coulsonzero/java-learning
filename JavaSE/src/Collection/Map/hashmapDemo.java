package Collection.Map;

import java.util.HashMap;

/**
 * HashMap Api:
 * new HashMap<T, T>()
 * 增：put(k, v)
 * 删：remove(k), clear()
 * 查：size(), get(k)
 * 判断boolean：containsKey(k), containsValue(v)
 */

public class hashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(map.size());
        map.put(1, 2);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue(3));
        System.out.println(map.get(1));
//        map.remove(1);
        map.clear();
        map.put(0, 2);
        map.put(1, 3);
        map.put(2, 5);
        map.put(3, 7);
//        map.put(3, 8);
//        System.out.println(map);
        for (int k = 0; k < map.size(); k++) {
            System.out.printf("key: %d, value: %d \n", k, map.get(k));
        }
    }
}
