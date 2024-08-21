import java.util.Scanner;
public class J01002 {
    public static Scanner ip=new Scanner(System.in);
    public static void test(){
        long n=ip.nextLong();
        long s=n*(n+1)/2;
        System.out.println(s);
    }
    public static void main(String[] args) {
        int T=ip.nextInt();
        while(T-->0){
            test();
        }
    }
}
