package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

import J04015.GiaoVien;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner("MONHOC.in");
        Scanner sc2 = new Scanner("GIANGVIEN.in");
        Scanner sc3 = new Scanner("GIOCHUAN.in");

        int k =Integer.parseInt(sc3.nextLine());
        ArrayList<GioChuan> listGC = new ArrayList<>();
        for(int i = 0; i < k; i++){
            String s = sc3.nextLine();
            String str[] = s.split("\\s+");
            GioChuan gc = new GioChuan(str[0], str[1], Float.parseFloat(str[2]));
            listGC.add(gc);
        }

        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<GiangVien> listGV = new ArrayList<>();
        for(int i = 0; i < m; i++){
            String s = sc2.nextLine();
            String maGV = s.substring(0,4);
            String tenGV = s.substring(5);
            GiangVien gv = new GiaoVien(maGV, tenGV);
            listGV.addGV(gv);
        }

        for(GiangVien gv : listGV){
            float gioChuan = 0;
            System.out.println(gv + " ");
            for(GioChuan gc : listGC){
                if(gv.getMaGV().equals(gc.getMaGV)){
                    gioChuan += gc.getGio();
                }
            }
            System.out.println(String.format("%.2f", gioChuan));
        }
    }
}
