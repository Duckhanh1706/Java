import java.util.Scanner;
public class J01006 {
    public static Scanner ip=new Scanner(System.in);
    public static long[] fb=new long[100];
    public static void pre(){
        fb[1]=fb[2]=1L;
        for(int i=3;i<93;i++){
            fb[i]=fb[i-1]+fb[i-2];
        }
    }
    public static void test(){
        int n=ip.nextInt();
        System.out.println(fb[n]);
    }
    public static void main(String[] args) {
        pre();
        int t=ip.nextInt();
        while(t-->0){
            test();
        }
    }
}
