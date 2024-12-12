package J05015;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CuaRo implements Comparable<CuaRo>{
    private String hoTen, donVi, ma;
    private Date denDich;
    private float tocDo;
    public CuaRo(String hoTen, String donVi, String dendich) throws ParseException {

        this.hoTen = hoTen;
        this.donVi = donVi;
        SimpleDateFormat sdf = new SimpleDateFormat("h:mm");
        this.denDich = sdf.parse(dendich);
        ma = "";

        String tokens2[] = donVi.split(" ");
        for(String token : tokens2){
            ma += token.charAt(0);
        }
        String tokens[] = hoTen.split(" ");
        for(String token : tokens){
            ma += token.charAt(0);
        }
         
        float time = 1.0f * (denDich.getTime() - sdf.parse("6:00").getTime()) / 1000 / 60 / 60;
        tocDo = 120.0f / time;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d Km/h", ma, hoTen, donVi, Math.round(tocDo));
    }
    @Override
    public int compareTo(CuaRo o) {
        int cmp = Float.compare(o.tocDo, tocDo);
        if(cmp != 0) return cmp;
        else return ma.compareTo(o.ma);
    }
    
}
