
import java.util.Scanner;
public class J01017 {
    public static Scanner ip=new  Scanner(System.in);
    public static boolean check(char a,char b){
        int x=a-'0';
        int y=b-'0';
        if(Math.abs(a-b)==1) return true;
        else return false;
    }
    public static void test(){
        String s=ip.next();
        for(int i=1;i<s.length();i++){
            if(!check(s.charAt(i),s.charAt(i-1))){
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
