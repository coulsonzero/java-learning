package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ArrayList Api:
 * 初始化：
 *      new ArrayList<T>();
 *      new ArrayList<>(Arrays.asList(nums));
 *      new ArrayList<>(CoreType.List.of(new Integer[]{ 1, 2, 3 }));
 * 长度：size()
 * 增：add(e), add(i, e), Collections.addAll(list, 4, 5)
 * 删：remove(i), clear()
 * 改：set(i, e)
 * 查值：get(i), System.out.println(list)
 * 包含：contains(e)
 *
 * Collections.sort(list)
 * Collections.reverse(list)
 * Collections.shuffle(list)
 * Collections.max(list)
 * Collections.min(list)
 */

public class ArrayListDemo {
    public static void main(String[] args) {
//        CoreType.List<Integer> stringList = new ArrayList<>(CoreType.List.of(new Integer[]{ 1, 2, 3 }));
//        System.out.println(stringList);
        IntegerList();

    }

    public static void listExample() {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        System.out.println(list.get(0));
//        list.remove(0);
//        list.set(list.size()-1, 9);
        System.out.println(list);
        System.out.println(list.size());
    }

    public static void IntegerList() {
        Integer[] nums = {2, 5, 3, 1, 7};
        List<Integer> list = new ArrayList<>(Arrays.asList(nums));
        // 增
        list.add(9);                    // 末尾增加
        list.add(1, 2);   // 中间插入
        // 删
        list.remove(0);
        // list.clear();
        // 改
        list.set(1, 8);
        // 查
        System.out.println(list.size());    // 长度
        System.out.println(list.get(1));    // 索引值
        System.out.println(list);           // 所有值

        System.out.println(list.contains(4));
        Collections.sort(list);
        Collections.reverse(list);
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
