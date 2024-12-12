package J07059;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("CATHI.in"));

        int n = Integer.parseInt(in.nextLine());

        CaThi a[]  = new CaThi[n];

        for(int i  = 0; i < n; i++){
            a[i] = new CaThi(in.nextLine(), in.nextLine(), in.nextLine());
        }

        Arrays.sort(a);

        for(int i = 0 ; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}