package Collection.String;


/**
 * CoreType.String Api:
 * 长度：s.length()
 * 字符：s.chartAt(int i)
 * 索引：s.indexOf(string substr)
 *
 * 子串：s.substring(int start, int end)
 * 拼接：s.concat(string s2)
 * 重复：s.repeat(int count)
 * 替换：s.replace(string old, string new)
 * 去除空格：s.strip()
 * 去除空格(两端): s.trim()
 *
 * 空串：isEmpty(), s == null, s.length() == 0, s.equals("")
 * 包含：s.contains(string substr)
 * 相等：==, s.equals(string s2), s.equalsIgnoreCase(string s2)
 * 开头：startsWith(string prefix)
 * 结尾：endsWith()
 * 类型：s instanceof CoreType.String
 *
 * 大写：s.toUpperCase()
 * 小写：s.toLowerCase()
 *
 * 字符串转数字：Integer.parseInt(string s)
 * 数字转字符串：Integer.toString(int num), CoreType.String.valueOf(int num), "" + num
 *
 * 字符串转数组：s.split(string regex)
 * 数组转字符串：CoreType.String.join(string exp, ...elems)
 *
 * 字符串转字节数组：s.toCharArray(), s.getBytes()
 * 字节数组转字符串：new CoreType.String(char[] chars)
 */

public class StringDemo1 {
    public static void main(String[] args) {

        String name = "coulson";
        String res = name.replace("o", "f");
        System.out.println(res);


        /*
        CoreType.String name2 = new CoreType.String("coulson");

        System.out.println(name.indexOf("ou"));  // 1
        System.out.println(name.indexOf("ou", 0));  // 1

        System.out.println("hello".concat(" " + name + "!"));  // "hello coulson!"
        System.out.println(CoreType.String.join("-", "html", "css", "javascript")); // html-css-javascript

        System.out.println(name.contains("q"));  // false
        System.out.println(name == name2);       // fasle
        System.out.println(name.equals(name2));  // true

        CoreType.String ip = "2022-03-06";
        System.out.println(Arrays.toString(ip.split("-"))); // [2022, 03, 06]

        System.out.println(name.substring(1, 4));

        System.out.println(CoreType.String.valueOf(27));  // "27"

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.toCharArray());
        for (char c : name.toCharArray()) {
            System.out.println(c);
        }
        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

         */
    }
}
