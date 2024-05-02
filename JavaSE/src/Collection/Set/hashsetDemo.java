package Collection.Set;

import java.util.HashSet;

/**
 * HashSet Api：
 * 初始化：new HashSet<T>()
 * 查：size(), System.out.println(set)
 * 增：add(e)
 * 删：remove(e), clear()
 * 判断：set.contains(e)
 */

public class hashsetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.remove(3);
        // set.clear();
        System.out.println(set.contains(1));
        System.out.println(set.size());
        System.out.println(set);
    }
}
