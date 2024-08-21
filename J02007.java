import java.util.*;
public class J02007 {
    public static Scanner ip=new Scanner(System.in);
    public static void test(int t){
        int n=ip.nextInt();
        int[] a=new int[n];
        int[] dd=new int[100005];
        for(int i=0;i<n;i++){
            a[i]=ip.nextInt();
            dd[a[i]]++;
        }
        System.out.printf("Test %d:\n",t);
        for(int i=0;i<n;i++){
            if(dd[a[i]]>0){
                System.out.printf("%d xuat hien %d lan",a[i],dd[a[i]]);
                dd[a[i]]=0;
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int t=ip.nextInt();
        for(int i=1;i<=t;i++){
            test(i);
        }
    }
}
