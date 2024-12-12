package J06003;

import java.util.ArrayList;

public class Nhom {
    private static int ID = 0;
    private int id;
    private String deTai;
    private ArrayList<SinhVien> danhSach;

    public Nhom(String deTai) {
        id = ++ ID;
        this.deTai = deTai;
        danhSach = new ArrayList<>();
    }

    @Override
    public String toString() {
        String s = String.format("DANH SACH NHOM %d:\n", id);
        for(SinhVien x : danhSach){
            s += (x.toString() + "\n");
        }
        s += String.format("Bai tap dang ky: %s", deTai);
        return s;
    }

    public int getId() {
        return id;
    }

    public ArrayList<SinhVien> getDanhSach() {
        return danhSach;
    }

    
}
