package J07058;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<MonThi> mt = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            MonThi x = new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mt.add(x);
        }

        Collections.sort(mt, new Comparator<MonThi>(){
            public int compare(MonThi a, MonThi b){
                return a.getMM().compareTo(b.getMM());
            }
        });

        for(MonThi x : mt){
            System.out.println(x);
        }

        sc.close();

    }
}
