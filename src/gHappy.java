public class gHappy {
    public static Boolean gHappy(String str) {
        int len = str.length();
        boolean happy = true;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i - 1) == 'g') {

                } else {
                    if (i < len - 1 && str.charAt(i + 1) == 'g') {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }
}
