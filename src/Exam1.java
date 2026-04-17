public class Exam1 {
    public static void Evaluate(){
        int [] value= {34,67,85,89,43,90,150};
        int max = value[0];
        int i;
        for(i=0; i< value.length;i++){
            try{
                if (value[i]>max){
                    max = value[i];
                }
            }catch(Exception e){
                System.out.println("error was done");

            }
        }
        System.out.println(max);


    }

    public  static void  main(String[] args){
        Evaluate();
    }
}
