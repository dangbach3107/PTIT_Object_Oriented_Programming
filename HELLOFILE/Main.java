package HELLOFILE;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fileinput = new File("Hello.txt");
        Scanner in = new Scanner(fileinput);
        while(in.hasNext())
        {
            System.out.println(in.nextLine());
        }
    }
}
