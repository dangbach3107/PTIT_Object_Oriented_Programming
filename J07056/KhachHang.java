package J07056;

public class KhachHang implements Comparable<KhachHang> {
    private String hoTen;
    private String loai;
    private int soDau, soCuoi;
    private static int count = 0;
    private String maKhachHang;
    private int tienTrongDinhMuc, tienVuotDinhMuc, thueVAT, tongTienPhaiNop;

    public KhachHang(String hoTen, String loai, int soDau, int soCuoi) {
        maKhachHang = String.format("KH%02d", ++count);
        this.hoTen = "";
        String tokens[] = hoTen.toLowerCase().trim().split("\\s+");
        for(String token : tokens){
            this.hoTen += token.toUpperCase().substring(0,1) + token.substring(1) + " ";
        }
        this.hoTen = this.hoTen.trim();
        this.loai = loai;
        this.soDau = soDau;
        this.soCuoi = soCuoi;

        int dinhMuc = 0, soDien = soCuoi - soDau;
        if(loai.compareTo("A") == 0) dinhMuc = 100;
        else if(loai.compareTo("B") == 0) dinhMuc = 500;
        else if(loai.compareTo("C") == 0) dinhMuc = 200;

        tienTrongDinhMuc = Math.min(soDien, dinhMuc) * 450;
        tienVuotDinhMuc = Math.max(0, soDien - dinhMuc) * 1000;
        thueVAT = tienVuotDinhMuc / 20;
        tongTienPhaiNop = tienTrongDinhMuc + tienVuotDinhMuc + thueVAT;
        
    }

    @Override
    public String toString() {
        return maKhachHang + " " + hoTen + " " + tienTrongDinhMuc + " "
                + tienVuotDinhMuc + " " + thueVAT + " " + tongTienPhaiNop;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Integer.compare(o.tongTienPhaiNop, this.tongTienPhaiNop);
    }
}
