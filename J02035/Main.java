package J02035;
import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int index=0;
            int min=Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
                if(min>a[i]){
                    index=i;
                }
                min=a[i];
            }
            System.out.println(index);
        }
     }
}
