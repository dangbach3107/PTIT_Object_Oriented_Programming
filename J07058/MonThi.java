package J07058;

public class MonThi {
    private String MM, TM, HTT;

    public MonThi(String MH, String TM, String HTT) {
        this.MM = MH;
        this.TM = TM;
        this.HTT = HTT;
    }
    
    public String getMM() {
        return MM;
    }

    public String toString() {
        return MM + " " + TM + " " + HTT;
    }

}
