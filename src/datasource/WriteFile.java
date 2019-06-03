package datasource;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("D:\\saya.txt", true);
            BufferedWriter bw=new BufferedWriter(w);
            PrintWriter pw=new PrintWriter(bw);

            pw.println("My name is Savariya Saran");
            pw.println("I am 1 year old");
            pw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
