package J07057;

public class ThiSinh implements Comparable<ThiSinh> {
    private String hoTen;
    private float diemThi;
    private float tongDiem;
    private String danToc;
    private int khuVuc;
    private static int dem = 0;
    private String maThiSinh;
    public ThiSinh(String hoTen, float diemThi, String danToc, int khuVuc) {
        maThiSinh = "TS" + String.format("%02d", ++dem);
        this.hoTen = "";
        String tmp[] = hoTen.trim().split("\\s+");
        for(String token : tmp){
            this.hoTen += token.substring(0,1).toUpperCase() + token.substring(1).toLowerCase() + " ";
        }
        this.diemThi = diemThi;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        if(khuVuc == 1) tongDiem = diemThi + 1.5f;
        else if(khuVuc == 2) tongDiem = diemThi + 1.0f;
        else tongDiem = diemThi;

        if(danToc.compareTo("Kinh") != 0) tongDiem += 1.5f;

        
    }
    @Override
    public int compareTo(ThiSinh o) {
        if(Float.compare(o.tongDiem, this.tongDiem) != 0) return Float.compare(o.tongDiem, this.tongDiem);
        else return this.maThiSinh.compareTo(o.maThiSinh);
    }
    @Override
    public String toString() {
        return maThiSinh + " " + hoTen + tongDiem  ;
    }

    public float getTongDiem(){
        return tongDiem;
    }
    
}
