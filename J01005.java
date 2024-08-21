import java.util.Scanner;
public class J01005 {
    public static Scanner ip=new Scanner(System.in);
    public static void test(){
        int n=ip.nextInt();
        int h=ip.nextInt();
        for(double i=1d;i<n;i++){
            System.out.printf("%6f ",Math.sqrt(i/n)*h);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t=ip.nextInt();
        while (t-->0) {
            test();
        }
    }
}
