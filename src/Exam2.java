import java.util.Scanner;

public class Exam2 {
    public static void Evaluate (){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of index");
        int value = input.nextInt();
        int [] arr = new  int[value];
        System.out.print("enter the values below");
        arr[0]= input.nextInt();
        int max = arr[0];
        int i;

        for (i=0; i<value; i++){
            arr[i] = input.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.print(max);
    }

    public  static void main(String[] args){
        Evaluate();

    }
}
