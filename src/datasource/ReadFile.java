package datasource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        String s;
        File f=new File("D:\\achuJava\\A.java");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while((s=br.readLine())!=null)
            {
                System.out.println(s);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
