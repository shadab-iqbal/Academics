package JavaIO;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

class FileReaderDemo {
    public static void main(String args[]) throws Exception {
        File f = new File("TestFile.java");
        Reader fr = new FileReader(f);
        char data[] = new char[(int) f.length()];
        fr.read(data);
        System.out.println(new String(data));
//        for (int i = 0; i < f.length(); i++) {
//            System.out.print((char)fr.read());
//        }
        fr.close();
    }
}