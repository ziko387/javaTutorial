public class question1 {
    public static void main (String[] args){
        int [] records = {10, 20, 30, 40, 50};
        int sum =0;


        int i;
        for(i=0; i< records.length; i++ ){
            System.out.println(records[i]);
            sum += records[i];

        }
        System.out.println(sum);


    }
}
