public class question4 {
    public static void main (String[] args){
        int[] digits = {5, 12, 7, 18, 3, 21};
        int max = digits[0];


        int i;
        for(i=0; i<digits.length; i++ ){
           if(digits[i]>max){
               max = digits[i];
           }
        }
        System.out.println(max);

    }
}
