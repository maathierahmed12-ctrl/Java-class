public class countYZ {

    public static void main(String[] args) {

        public int countYZ (String []){
            int len = str.length();
            int count = 0;
            String str;
            for (int i = 0; i < len - 2; i++) {

                char c = str.charAt(i);

                if (c == str.charAt(i + 1) && c == str.charAt(i + 2))
                    count++;
            }
                   return count;
        }

    }
}





