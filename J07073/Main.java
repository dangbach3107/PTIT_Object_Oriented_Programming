package J07073;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<MonHoc> a = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(x.getHinhThucGiangDayThucHanh().compareTo("Truc tiep") != 0) a.add(x);
        }

        Collections.sort(a);

        for(MonHoc x : a){
            System.out.println(x);
        }
    }
}
