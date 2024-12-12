package J05069;

public class TranDau {
    private String ma, maCLB, tenCLB;
    private long soLuongVe, doanhThu;
    public TranDau(String inp) {
        String[] tmp = inp.split(" ");
        this.ma = tmp[0];
        maCLB = ma.substring(1, 3);
        this.soLuongVe = Long.parseLong(tmp[1]);
    }

    public void setDoanhThu(long giaVe) {
        this.doanhThu = soLuongVe * giaVe;
    }

    public void setTenCLB(String tenCLB) {
        this.tenCLB = tenCLB;
    }
    

    @Override
    public String toString() {
        return ma + " " + tenCLB + " " + doanhThu;
    }

    public String getMa() {
        return ma;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public String getTenCLB() {
        return tenCLB;
    }

    public long getSoLuongVe() {
        return soLuongVe;
    }

    public long getDoanhThu() {
        return doanhThu;
    }
    

}
