package Bai1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"))) {
            ArrayList<String> list = (ArrayList<String>) ois.readObject();

            Set<Integer> set = new TreeSet<>();

            for(String line : list){
                String [] tokens = line.split("\\s+");
                for(String token : tokens){
                    try {
                        int num = Integer.parseInt(token);
                        set.add(num);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }

            for(int num : set){
                System.out.println(num);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}