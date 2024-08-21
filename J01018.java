import java.util.Scanner;
public class J01018 {
    public static Scanner ip=new Scanner(System.in);
    public static boolean check(char a,char b){
        int x=a-'0';
        int y=b-'0';
        return Math.abs(x-y)==2;
    }
    public static void test(){
        String s=ip.next();
        for(int i=1;i<s.length();i++){
            if(!check(s.charAt(i),s.charAt(i-1))){
                System.out.println("NO");
                return;
            }
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'0';
            sum+=x;
        }
        if(sum%10==0){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        int t=ip.nextInt();
        while(t-->0){
            test();
        }
    }
}
