public class sumDigits {
    public static Integer sumDigits(String str, String C) {
        int len = str.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {

            if (Character.isDigit(str.charAt(i))) {

                String c = str.substring(i,i+1);

                sum += Integer.parseInt(C);
            }
        }
        return sum;
    }
    }
