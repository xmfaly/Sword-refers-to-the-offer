public class 把字符串转换成整数 {

    public static int StrToInt(String str) {
        try{
            return Integer.valueOf(str);
        }
        catch (Exception e){
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(StrToInt("123"));
        System.out.println(StrToInt("+123"));
        System.out.println(StrToInt("3.1416"));
    }
}
