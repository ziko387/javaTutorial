import java.util.Scanner;

public class Boaz {
    public  static void  main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your age:");
        var age = input.nextInt();
        System.out.print("enter your admission:");
        var admission = input.nextInt();



            if (age >= 0 && age < 18) {
                System.out.println("you are underage");
                System.exit(0);

            } else if (age >= 18 && age <= 100) {
                System.out.println("you are welcomed dear customer");


            }  else {
                System.out.println("invalid age or it has reached a maximum of 100 and error");
                System.exit(0);

            }

            if (admission >=1000){
                System.out.println("welcome:"+admission);
            }else{
                System.out.println("error occurred");
                System.exit(6);
            }

        }
    }

