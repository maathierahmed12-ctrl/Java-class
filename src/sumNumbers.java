public class sumNumbers {

        public static Integer sumNumbers(String str) {

            int len = str.length();

            int sum=0;
            String temp ="";

            for(int i =0; i<len;i++){
                if(char.isDigit(str.charAt(i))){
                    if(i<len-1&& Character.isDigit(str.chari+1))){

                       temp += str.charAt(i);
                    }
                }else{

                    if(! temp.equals("")){

                    }
                    sum += Integer.str(temp);
                }
            }
                   return sum;
        }

}
}
