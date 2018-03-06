public class 左旋转字符串 {

    public static String LeftRotateString(String str,int n) {
        if(n>str.length()){
            return "";
        }
        String s1 = str.substring(0,n);
        String s2 = str.substring(n);
        return s2 + s1;
    }

    public static void main(String[] args) {
        System.out.println(LeftRotateString("123abcdef",100));
    }
}
