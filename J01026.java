import java.util.Scanner;
public class J01026 {
    public static Scanner ip=new Scanner(System.in);
    public static void test(){
        int N=ip.nextInt();
        int n=(int)Math.sqrt(N);
        if(n*n==N){
            System.out.println("YES");
        }else System.out.println("NO");
    }
    public static void main(String[] args) {
        int t=ip.nextInt();
        while(t-->0){
            test();
        }
    }
}
