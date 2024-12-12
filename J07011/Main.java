package J07011;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int t = Integer.parseInt(sc.nextLine());
        Map<String, Integer> map = new HashMap<>();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] a = s.toLowerCase().split("[^a-zA-Z0-9]+");
            for(String i : a){
                if(i.length() > 0){
                    if(map.containsKey(i)) map.put(i, map.get(i) + 1);
                    else map.put(i, 1);
                }
            }
        }
        ArrayList<Map.Entry<String, Integer>> ans = new ArrayList<>(map.entrySet());
        ans.sort((a, b) -> {
            if(a.getValue() != b.getValue()) return b.getValue() - a.getValue();
            return a.getKey().compareTo(b.getKey());
        });
        for(Map.Entry<String, Integer> i : ans){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
// 3
// PTIT duy tri hoc phi on dinh nam 2019 va khong tang trong nam 2020-2021 va 2021-2022!
// Khi dich benh xuat hien PTIT trich hon 6 ty dong ho tro sinh vien PTIT
// voi muc ho tro 500000 dong/sinh vien PTIT.