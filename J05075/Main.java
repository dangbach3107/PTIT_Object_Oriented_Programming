package J05075;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        SinhVien[] sv = new SinhVien[n];

        for(int i = 0; i < n; i++){
            sv[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for(int i = 0; i < n; i++){
            String tmp = sc.nextLine();
            String tokens[] = tmp.split("\\s+");
            String maSV = tokens[0];
            String diemDanh = tokens[1];
            int diem = 10;
            for(int j = 0; j < 10; j++){
                if(diemDanh.charAt(j) == 'v'){
                    diem = Math.max(0, diem - 2);
                }
                else if(diemDanh.charAt(j) == 'm'){
                    diem = Math.max(0, diem - 1);
                }
            }
            for(int k = 0; k < n; k++){
                if(sv[k].getMa().equals(maSV)){
                    sv[k].setDiemChuyenCan(diem);
                    if(diem == 0){
                        sv[k].setGhiChu("KDDK");
                    }
                    break;
                }
            }
        }

        String lop = sc.nextLine();
        for(int i = 0; i < n; i++){
            if(sv[i].getLop().equals(lop)){
                System.out.println(sv[i]);
            }
        }
    }
}
