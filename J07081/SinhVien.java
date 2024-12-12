package J07081;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV, hoTen, sdt, email, ten, ho, dem;

    public SinhVien(String maSV, String hoTen, String sdt, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;

        String tmp[] = hoTen.trim().split("\\s+");
        if(tmp.length > 2){
            for(int i = 1; i < tmp.length - 1; i++){
                dem += tmp[i] + " ";
            }
        }
        else dem = "";
        this.hoTen = this.hoTen.trim();
        ten = tmp[tmp.length - 1];
        ho = tmp[0];
    }
    public int compareTo(SinhVien o) {
        if(this.ten.compareTo(o.ten) != 0)
            return this.ten.compareTo(o.ten);
        else if(this.ho.compareTo(o.ho) != 0)
            return this.ho.compareTo(o.ho);
        else if(this.dem.compareTo(o.dem) != 0)
            return this.dem.compareTo(o.dem);
        else 
            return this.maSV.compareTo(o.maSV);
    }
    @Override
    public String toString() {
        return  maSV + " " + hoTen + " " + sdt + " " + email ;
    }
    
}


