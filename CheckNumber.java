class CheckNumber {

    public boolean digitCount(String num) {

        int N = num.length(); //Length of the string
        int i=0;
        int count;

        while(i<N){

            count = count(num, i);

            if(num.charAt(i) - '0' == count){
                i++;
            }
            else{
                return false;
            }
        }

        return true;
    }


    public int count(String num, int i) {

        int count = 0;

        for(int j=0; j<num.length(); j++){
            if(num.charAt(j) - '0' == i)
                count++;
        }

        return count;
    }
}
