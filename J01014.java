import java.util.Scanner;
public class J01014 {
    public static Scanner ip=new Scanner(System.in);
    public static boolean check(long n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }
    public static void test(){
        long n=ip.nextLong();
        long res=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(check(n/i)){
                    System.out.println(n/i);
                    return;
                }
                if(check(i)){
                    res=i;
                }
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int t=ip.nextInt();
        while(t-->0){
            test();
        }
    }
}
