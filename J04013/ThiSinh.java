package J04013;

public class ThiSinh {
    private String maTS, ten;
    private float toan, ly, hoa;

    public ThiSinh(){

    }

    public ThiSinh(String maTS, String ten, float toan, float ly, float hoa){
        this.maTS = maTS;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public float diemUT(){
        if(this.maTS.charAt(2) == '1') return 0.5f;
        else if(this.maTS.charAt(2) == '2') return 1f;
        else return 2.5f;
    }

    public float tongDiem(){
        return this.toan * 2 + this.ly + this.hoa;
    }

    public String trangThai(){
        if(this.tongDiem() + this.diemUT() >= 24) return "TRUNG TUYEN";
        else return "TRUOT";
    }

    public String toString(){
        if(this.tongDiem() == (int) this.tongDiem()){
            if(this.diemUT() == 1.0){
                return this.maTS + " " + this.ten + " " + 1 + " " + (int) this.tongDiem() + " " + this.trangThai();
            }
            else{
                return this.maTS + " " + this.ten + " " + String.format("%.1f", this.diemUT()) + " " + (int) this.tongDiem() + " " + this.trangThai();
            }
        }

        else
        {
            if(this.diemUT() == 1.0){
                return this.maTS + " " + this.ten + " " + 1 + " " + String.format("%.1f", this.tongDiem()) + " " + this.trangThai();
            }
            else{
                return this.maTS + " " + this.ten + " " + String.format("%.1f", this.diemUT()) + " " + String.format("%.1f", this.tongDiem()) + " " + this.trangThai();
            }
        }
    }
}
