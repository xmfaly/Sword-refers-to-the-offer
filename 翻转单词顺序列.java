public class 翻转单词顺序列 {

    public static String ReverseSentence(String str) {
        if (str == null) {
            return null;
        }
        String strs[] = str.split(" ");
        String ans = "";
        if (strs.length > 0) {
            for (int i = strs.length - 1; i > 0; i--) {
                ans += strs[i] + " ";
            }
            ans += strs[0];
        }else {
            ans = str;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence("student. a am I"));
        System.out.println(ReverseSentence(""));
        System.out.println(ReverseSentence(" "));
        System.out.println(ReverseSentence("  "));
        System.out.println(ReverseSentence("a"));
    }
}
