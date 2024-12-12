package J07033;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV, ten, lop, mail;

    @Override
    public String toString() {
        return maSV + " " + ten + lop + " " + mail  ;
    }

    public SinhVien(String maSV, String ten, String lop, String mail) {
        this.maSV = maSV;
        this.lop = lop;
        this.mail = mail;
        this.ten = "";
        String tmp[] = ten.toLowerCase().trim().split("\\s+");

        for(String token : tmp)
        {
            this.ten += token.substring(0, 1).toUpperCase() + token.substring(1) + " ";
        }
    }

    @Override
    public int compareTo(SinhVien o) {
        // TODO Auto-generated method stub
        return this.maSV.compareTo(o.maSV);
    }

    
}
