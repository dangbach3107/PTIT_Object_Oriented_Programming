package J04015;
/*
 @author dangbach
 07/09/2024
 17:27
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maGV = sc.nextLine();
        String ten = sc.nextLine();
        int luongCoBan = sc.nextInt();
        GiaoVien gv = new GiaoVien(maGV, ten, luongCoBan);
        System.out.print(gv);
    }
}

