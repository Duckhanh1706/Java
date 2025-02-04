import java.util.Scanner;
public class J01010 {
    public static Scanner ip=new Scanner(System.in);
    public static long solve(String s){
        long res=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            switch(c){
                case '0':
                case '8':
                case '9':
                    res=res*10;
                    break;
                case '1':
                    res=res*10+1;
                break;
                default:
                return 0;
            }
        }
        return res;
    }
    public static void test(){
        String s=ip.next();
        long res=solve(s);
        if(res==0){
            System.out.println("INVALID");
        }else System.out.println(res);
    }
    public static void main(String[] args) {
        int t=ip.nextInt();
        while (t-->0) {
            test();
        }
    }
}
