package casting;

public class Casting2 {
    public static void main(String[] args) {
        /*
        * WIDENING CASTING
        * (Small)byte->short->char->int->long->float->double(LARGE)
        *
        * NARROWING CASTING
        * double->float->long->int->char->short->byte
        *
        *
        *
        *
        *
        * */
        double  master = 4.00d;
        int servant = (char) master;
         System.out.println(master);
         System.out.println(servant);

    }
}
