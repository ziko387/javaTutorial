package arrays.lOOPaRRAY;

public class LoopArray2 {
    public static void main(String[] args) {
        int[] masses ={65,67,78,98,69};
        int sum =0;
        int average =0;

        for (int mass : masses){
            sum+=mass;

        }
        average = sum/masses.length;
        System.out.println(sum);
        System.out.println(average);
    }
}
