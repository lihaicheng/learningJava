package examTreasure.javaCore.S4_7IO;

import java.io.File;

public class TFile {
    public static void scandir(File file)
    {
        File[] files = file.listFiles();
        for (File f : files)
        {
            if (f.isFile())
            {
                System.out.println(f.toString() + ".isFile()");
            }
            if (f.isDirectory())
            {
                System.out.println(f.toString() + ".isDirectory()");
                scandir(f);
            }
        }
    }
    public static void main(String[] args) {
        File file = new File("/Users/zrb/shelltest");
        if (file.exists())
        {
            System.out.println("file.exists()");
            scandir(file);
        }
    }
}
