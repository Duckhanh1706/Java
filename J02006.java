import java.util.*;
public class J02006 {
    public static Scanner ip=new Scanner(System.in);
    public static void test(){
        int n=ip.nextInt();
        int m=ip.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        int[] dd=new int[1001];
        for(int i=0;i<n;i++){
            a[i]=ip.nextInt();
            dd[a[i]]=1;
        }
        for(int i=0;i<m;i++){
            b[i]=ip.nextInt();
            dd[b[i]]=1;
        }
        for(int i=0;i<1001;i++){
            if(dd[i]==1){
                System.out.printf(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t=1;
        while(t-->0){
            test();
        }
    }
}
