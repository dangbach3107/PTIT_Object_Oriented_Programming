package J05004;
import java.util.*;
import java.text.*;
class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;

    private static int id = 1;

    public SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0;
    }

    public void nhap(Scanner sc) {
        sc.nextLine(); // Đọc bỏ dòng trống
        this.hoTen = chuanHoaTen(sc.nextLine());
        this.lop = sc.nextLine();
        this.ngaySinh = chuanHoaNgaySinh(sc.nextLine());
        this.gpa = sc.nextFloat();
        this.maSV = String.format("B20DCCN%03d", id++);
    }

    private String chuanHoaTen(String ten) {
        ten = ten.trim().toLowerCase();
        String[] words = ten.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private String chuanHoaNgaySinh(String ngaySinh) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("d/M/yyyy");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = inputFormat.parse(ngaySinh);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return ngaySinh;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", maSV, hoTen, lop, ngaySinh, gpa);
    }
}