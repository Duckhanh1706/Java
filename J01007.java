import java.util.Scanner;
public class J01007 {
    public static Scanner ip=new Scanner(System.in);
    public static long[] fb=new long[100];
    public static void pre(){
        fb[0]=0L;
        fb[1]=1L;
        for(int i=2;i<100;i++){
            fb[i]=fb[i-1]+fb[i-2];
        }
    }
    public static boolean test(long n){
       for(long i:fb){
        if(i==n) return true;
        else if(i>n) return false;
       }
       return false;
    }
    public static void t1(){
        long n=ip.nextLong();
        if(test(n)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        pre();
        int t=ip.nextInt();
        while(t-->0){
            t1();
        }
    }
}
