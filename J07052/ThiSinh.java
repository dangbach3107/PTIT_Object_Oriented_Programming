package J07052;

public class ThiSinh implements Comparable<ThiSinh> {
    private String maThiSinh, hoTen;
    private float diemToan, diemLy, diemHoa, diemXetTuyen, diemUuTien;
    public ThiSinh(String maThiSinh, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maThiSinh = maThiSinh;
        String tmp [] = hoTen.trim().split("\\s+");
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;

        char khuVuc =maThiSinh.charAt(2);
        if(khuVuc == '1') diemUuTien = 0.5f;
        else if(khuVuc == '2') diemUuTien = 1.0f;
        else if(khuVuc == '3') diemUuTien = 2.5f;

        diemXetTuyen = diemHoa + diemToan * 2 + diemLy + diemUuTien;

        this.hoTen = "";

        for(String token : tmp){
            this.hoTen += token.toUpperCase().substring(0,1) + token.toLowerCase().substring(1) + " ";
        }

    }
    @Override
    public int compareTo(ThiSinh o) {
        if(o.diemXetTuyen != this.diemXetTuyen)    return Float.compare(o.diemXetTuyen, this.diemXetTuyen);
        else return this.maThiSinh.compareTo(o.maThiSinh);
    }
    @Override
    public String toString() {
        return maThiSinh + " " + hoTen + ((int)diemUuTien == diemUuTien ? String.format("%d", (int)diemUuTien) : String.format("%.1f", diemUuTien)) + " "
                + ((int)diemXetTuyen == diemXetTuyen ? String.format("%d", (int)diemXetTuyen) : String.format("%.1f", diemXetTuyen)  );
    }
    public float getDiemXetTuyen() {
        return diemXetTuyen;
    }
}
