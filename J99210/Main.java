package J99210;
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sv = new Scanner(new File("SINHVIEN.in"));
        Scanner dk = new Scanner(new File("DANGKY.in"));
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(sv.nextLine());
        SinhVien a[] = new SinhVien[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = new SinhVien(sv.nextLine(), sv.nextLine(), sv.nextLine(), sv.nextLine(), sv.nextLine(), sv.nextLine());
        }

        for(int i = 0; i < n; i++){
            String tmp = dk.nextLine();
            String [] tmp2 = tmp.split(" ");
            for(int j = 0; j < n; j++){
                if(a[j].getMaSV().equals(tmp2[0])){
                    a[j].setSize(tmp2[1]);
                    break;
                }
            }
        }
        Arrays.sort(a);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            String tmp = in.nextLine();
            String [] tmp2 = tmp.split(" ");
            System.out.printf("DANH SACH SINH VIEN %s DANG KY SIZE %s\n", tmp2[0].toUpperCase(), tmp2[1]);
            for(int i = 0; i < n; i++)
            {
                if(tmp2[0].equals(a[i].getGioitinh()) && tmp2[1].equals(a[i].getSize())){
                    System.out.println(a[i]);
                }
            }
        }
    }
}

