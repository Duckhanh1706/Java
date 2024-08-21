import java.util.Scanner;
public class J01012 {
    public static Scanner ip=new Scanner(System.in);
    public static void test(){
        long n=ip.nextLong();
        long dem=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i%2==0){
                    dem++;
                }
                if((n/i)%2==0 && i*i!=n){
                    dem++;
                }
            }
        }
        System.out.println(dem);
    }
    public static void main(String[] args) {
        int t=ip.nextInt();
        while(t-->0){
            test();
        }
    }
}
