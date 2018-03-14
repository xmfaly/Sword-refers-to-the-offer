public class 表示数值的字符串 {

    public static boolean isNumeric(char[] str) {
        String in = new String(str);

        try {
            int ans = Integer.valueOf(in);
            return true;
        } catch (Exception e) {
            try {
                double ans = Double.valueOf(in);
                return true;
            } catch (Exception e1) {
                return false;
            }

        }


    }

    public static void main(String[] args) {
        System.out.println(isNumeric("12e".toCharArray()));
        System.out.println(isNumeric("122222".toCharArray()));
        System.out.println(isNumeric("5e2".toCharArray()));
    }
}
