public class countTriple {
    public static Boolean equalIsNot(String str , String C) {


        int len = str.length();
        int count = 0;

        for (int i = 0; i < len - 2; i++) {
            char c = str.charAt(i);
            if (c == str.charAt(i + 1) && c == str.charAt(i + 2)) {
                count++;
            }
            return count;
        }
    }
}
