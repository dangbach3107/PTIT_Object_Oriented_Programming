package J05013;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ThiSinh[] ts = new ThiSinh[t];
        for(int i = 0; i < t; i++){
            ts[i] = new ThiSinh(sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
        }
        Arrays.sort(ts);
        for(ThiSinh i : ts){
            System.out.println(i);
        }
    }
    
}


