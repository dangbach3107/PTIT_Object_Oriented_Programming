package J07072;

public class Ten implements Comparable<Ten> {
    @Override
    public int compareTo(Ten o) {
        if(this.ten.compareTo(o.ten) != 0)
            return this.ten.compareTo(o.ten);
        else if(this.ho.compareTo(o.ho) != 0)
            return this.ho.compareTo(o.ho);
        else 
            return this.dem.compareTo(o.dem);
    }

    private String ho, ten, dem;

    public Ten(String hoTen) {
        String tmp[] = hoTen.toLowerCase().trim().split("\\s+");
        ten = tmp[tmp.length - 1].toUpperCase().substring(0,1 ) + tmp[tmp.length - 1].substring(1);
        ho = tmp[0].toUpperCase().substring(0,1 ) + tmp[0].substring(1);
        dem = "";
        if(tmp.length > 2){
            for(int i = 1; i < tmp.length - 1; i++){
                dem += tmp[i].toUpperCase().substring(0,1) + tmp[i].substring(1) + " ";
            }
        }
        dem = dem.trim();
    }

    @Override
    public String toString() {
        return ho + " " + dem + " " + ten;
    }

}
