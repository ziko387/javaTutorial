// input ={ string = sc.nextLine  integers = sc.nextInt}
// types of scanners = file scanner = (File.data{data.value}) ,   i/o scanners

import java.util.Scanner;

public  class input{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first number:");
        var number1 = input.nextInt();
        System.out.print("enter your second number");
        var number2= input.nextInt();

        System.out.println("your first number is"+number1+"your second number is" +number2);

    }
}
