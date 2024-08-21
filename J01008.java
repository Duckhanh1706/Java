import java.util.Scanner;
public class J01008 {
    public static Scanner ip=new Scanner(System.in);
    public static void test(int t){
        int n=ip.nextInt();
        int N=n;
        System.out.printf("Test %d: ",t);
        for(int i=2;i<=N/2;i++){
            int d=0;
            while (n%i==0) {
                d++;
                n/=i;
            }
            if(d!=0) System.out.printf("%d(%d) ",i,d);
        }
        if(n!=1) System.out.printf("%d(%d)",n,1);
        System.out.println();
    }
    
    public static void main(String[] args) {
        int t=ip.nextInt();
        for(int i=0;i<t;i++){
            test(i+1);
        }
    }
}
