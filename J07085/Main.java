package J07085;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        for(String x : a){
            int tong = 0;
            String res = "";
            for(char token : x.toCharArray()){
                if('0' <= token && token <= '9'){
                    res += token;
                    tong += token - '0';
                }
            }
            res = res.replaceFirst("^0+", "");
            System.out.println(res + " " + tong);
        }
        
    }

}
