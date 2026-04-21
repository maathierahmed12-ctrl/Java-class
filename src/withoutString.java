import java.util.Locale;

public class withoutString {


    public static int withoutString(String base, String remove, String hello) {

        int blen = base.length();
        int rlen = remove.length();
        String lowbase = base.toLowerCase();
        String lowrem = remove.toLowerCase();

        for (int i = 0; i < blen; i++) {
            if (i <= blen - rlen) {
                String tmp = lowbase.substring(i, i + rlen);
                if (!tmp.equals(lowrem)) {
                    hello += base.substring(i, i + 1);
                else{
                        i += rlen - 1;
                    }
                } else {
                    String tmp2 = lowbase.substring(i, i + 1);
                    if (!tmp2.equals(lowrem)) {
                        hello += base.substring(i, i + 1);
                    }
                }

                return hello;
            }
        }
    }
}

