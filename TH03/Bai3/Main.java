package Bai3;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("DANHSACH.in"));
            ArrayList<SinhVien> list = new ArrayList<>();
            while (in.hasNextLine()) {
                list.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
            }

            Collections.sort(list, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2){
                    if(o1.getLop().compareTo(o2.getLop()) != 0){
                        return o1.getLop().compareTo(o2.getLop());
                    }
                    else return o1.getMaSV().compareTo(o2.getMaSV());
                }
            });

            for(SinhVien x : list){
                System.out.println(x);
            }
    }
}
