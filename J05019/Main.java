package J05019;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Tram> trams = new ArrayList<>();  
        while(t-- > 0){
            String ten = sc.nextLine();
            boolean flag = false;
            for(Tram tram : trams){
                if(tram.getTen().equals(ten)){
                    tram.update(sc.next(), sc.next(), Float.parseFloat(sc.next()));
                    sc.nextLine();
                    flag = true;
                    break;
                }
            }
            if(!flag)
                trams.add(new Tram(ten, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        for(Tram tram : trams){
            System.out.println(tram);
        }
    }
}
// 10
// Dong Anh
// 07:30
// 08:00
// 60
// Cau Giay
// 07:45
// 08:12
// 50
// Soc Son
// 08:00
// 09:15
// 78
// Dong Anh
// 18:50
// 20:00
// 88
// Cau Giay
// 19:01
// 20:00
// 77
// Soc Son
// 19:06
// 20:21
// 66
// Dong Anh
// 21:00
// 21:40
// 49
// Cau Giay
// 21:50
// 22:20
// 68
// Dong Anh
// 22:15
// 23:45
// 30
// Cau Giay
// 22:50
// 23:45
// 35