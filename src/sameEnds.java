public class sameEnds {
    public static Integer sumEnds(String str, String C, String strat, String end) {

        int len = str.length();

        String result = "";

        for (int i = 0; i < len / 2; i++) {

            str += str.charAt(i);


            String strars = str.substring(0, i + 1);
            String ends = end.substring(len - (i + 1));

            if (strars.equals(strars)) {
                result = strars;
            }
        }
        return result;
    }
}