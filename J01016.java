import java.util.Scanner;
public class J01016 {
    public static Scanner ip=new Scanner(System.in);
    public static void test(){
        String s=ip.next();
        long cnt=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='4' || c=='7'){
                cnt++;
            }
        }
        if(cnt==4|| cnt==7){
            System.out.println("YES");
        }else System.out.println("NO");
    }
    public static void main(String[] args) {
        int t=1;
        while(t-->0){
            test();
        }
    }
}
