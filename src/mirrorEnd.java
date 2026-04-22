public class mirrorEnd {
    public static String mirrorEnd(String str, String strat, String end) {

        int len = str.length();

        for (int i = 0; i < len; i++) {
            String start = "";
            String temp1 = "";
            String temp2 = "";

            for (int j = temp1.length() - 1; j >= 0; j--) {

                temp2 += temp1.substring(j, j + 1);

                if (temp2.equals(String.substring(len-i-1,len))){

                    str+= temp1;
                }

                return str;
            }
        }
    }
}
