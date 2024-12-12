package J07071;

public class HoTen implements Comparable<HoTen>{
    private String hoTen;
    private String ten;
    private String ho;
    private String tenVietTat;

    public HoTen(String hoTen)  {
        this.hoTen = "";
        String tmp[] = hoTen.trim().split("\\s+");
        ho = tmp[0].toUpperCase().substring(0,1) + tmp[0].toUpperCase().substring(1) ;
        tenVietTat = "";
        for(String token : tmp){
            this.hoTen += token.toUpperCase().substring(0,1) + token.toLowerCase().substring(1) + " ";
            ten = token.toUpperCase().substring(0,1) + token.toLowerCase().substring(1) + " ";
            tenVietTat += token.toUpperCase().substring(0,1);
        }


    }

    @Override
    public int compareTo(HoTen o) {
        if(this.ten.compareTo(o.ten) != 0) return this.ten.compareTo(o.ten);
        return this.ho.compareTo(o.ho);
    }

    @Override
    public String toString() {
        return hoTen ;
    }
    public String getTenVietTat() {
        return tenVietTat;
    }

    
}
