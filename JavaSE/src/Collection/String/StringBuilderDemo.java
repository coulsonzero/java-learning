package Collection.String;

/**
 * StringBuild & StringBuffer Api:
 * 初始化：new StringBuild(string s), new StringBuffer(string s);
 * 长度：length()
 * 增：append(e)
 * 插入：insert(i, e)
 * 删：delete(int start, int end)
 * 改：replace(int start, int end, string s)
 * 字符：charAt(int i)
 * 索引：indexOf(e)
 * 反转：reverse()
 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder bf = new StringBuilder();
        bf.append('z');
        bf.insert(1, "jo");
        bf.delete(1, 2);
        bf.replace(0, 2, "abc");
        System.out.println(bf.length());
        bf.reverse();
        bf.indexOf("a");
        System.out.println(bf);

        StringBuffer buffer = new StringBuffer();

    }
}
