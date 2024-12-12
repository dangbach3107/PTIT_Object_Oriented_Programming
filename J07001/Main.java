package J07001;
/*
 @author dangbach
 09/09/2024
 09:01
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fileinput = new File("DATA.in");
        Scanner in = new Scanner(fileinput);
        while(in.hasNext())
        {
            System.out.println(in.nextLine());
        }
    }
}
