import java.util.Scanner;
public class J01009 {
    public static Scanner ip=new Scanner(System.in);
    public static void test(){
        long n=ip.nextLong();
        long tmp=1;
        long res=0;
        for(int i=1;i<=n;i++){
            tmp*=i;
            res+=tmp;
        }
        System.out.printf("%d",res);
        System.out.println();
    }
    public static void main(String[] args) {
        int t=1;
        while(t-->0){
            test();
        }
    }
}
