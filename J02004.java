import java.util.Scanner;
public class J02004 {
    public static Scanner ip=new Scanner(System.in);
    public static void test(){
        int n=ip.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        for(int i=0;i<n/2;i++){
            if(a[i]!=a[n-i-1]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        
    }
    public static void main(String[] args) {
        int t=ip.nextInt();
        while(t-->0){
            test();
        }
    }
}
