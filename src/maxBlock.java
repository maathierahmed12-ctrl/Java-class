public class maxBlock {
    public static Integer maxBlock(String str) {

        int len = str.length();

        int count = 0;

        int tempcount = 1;

        if (len==0){

        }
            return 0;

            for(int i = 0 ; i< len;i++){

                tempcount++;
        }else{
                return tempcount=1;
        }
            count = Math.max(count,tempcount);

    }

}

