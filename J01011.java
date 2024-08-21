import java.util.Scanner;
public class J01011 {
    public static Scanner ip=new Scanner(System.in);
    // boi chung nho  nhat
    public static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
    // uoc chung lon nhat
    public static long gcd(long a,long b){
        while(b!=0){
            long x=a%b;
            a=b;
            b=x;
        }
        return a;
    }
    public static void test(){
        long a=ip.nextLong();
        long b=ip.nextLong();
        System.out.println(lcm(a,b)+" "+gcd(a,b));
    }
    public static void main(String[] args) {
        int t=ip.nextInt();
        while(t-->0){
            test();
        }
    }
}
