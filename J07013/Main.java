package J07013;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> ds = (ArrayList<SinhVien>) ois.readObject();
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}
