package J07032;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {

    public static boolean check(int n){
        String s = Integer.toString(n);
        if (s.length()%2==0||s.length()==1) return false;
        for(int i=0;i<=s.length()/2;++i){
            char x=s.charAt(i);
            char y=s.charAt(s.length()-i-1);
            if ((x-'0')%2==0||(y-'0')%2==0||x!=y) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();

        int c[] = new int[1000001];
        int d[] = new int[1000001];
        for(Integer x : a1){
            if(check(x)) c[x]++;
        }
        for(Integer x : a2){
            if(check(x)) d[x]++;
        }
        int cnt = 0;
        for(int i=0;i<=1000000;++i){
            if (c[i]>0&&d[i]>0){
                System.out.println(i+" "+(c[i]+d[i]));
                cnt++;
                if (cnt==10) break;
            }
        }
    }
}
