package J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String loai, ten, gia, phi;

    @Override
    public String toString() {
        return loai + " " + ten + " " + gia + " " + phi  ;
    }

    public LoaiPhong(String s) {
        String tmp[] = s.split(" ");
        loai = tmp[0];
        ten = tmp[1];
        gia = tmp[2];
        phi = tmp[3];
    }

    @Override
    public int compareTo(LoaiPhong o) {
        // TODO Auto-generated method stub
        return this.ten.compareTo(o.ten);
    }
    
}
