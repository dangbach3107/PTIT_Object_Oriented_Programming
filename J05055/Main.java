package J05055;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        VDV[] vdv = new VDV[n];

        for (int i = 0; i < n; i++) {
            try {
                vdv[i] = new VDV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            } catch (Exception e) {
            }
        }

        Arrays.sort(vdv);

        vdv[0].setXepHang(1);
        for (int i = 1; i < n; i++) {
            vdv[i].setXepHang(i + 1);
            if(vdv[i].getThanhTichXepHang() == vdv[i - 1].getThanhTichXepHang()){ 
                vdv[i].setXepHang(vdv[i - 1].getXepHang());
            }
        }

        int dem = 1;
        for(int i = 0; i < n; i++){
            for (VDV v : vdv) {
                if(v.getMa().equals(String.format("VDV%02d", dem))){
                    System.out.println(v);
                    dem++;
                    break;
                } 
            } 
        }
    }
}
