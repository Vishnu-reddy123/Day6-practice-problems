import java.util.Scanner;
public class StopWatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start,stop;
        double tim;
        System.out.println("press 1 to start the stopwatch");
        int s = sc.nextInt();
        start = System.currentTimeMillis();
        System.out.println("press 2 to stop the stopwatch");
        int m = sc.nextInt();
        stop = System.currentTimeMillis();
        tim = (stop-start)/1000.0;
        System.out.println(tim);
    }
}
