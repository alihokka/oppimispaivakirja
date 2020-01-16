package paaohjelma;

import java.io.*;

public class Writer {
    public Writer(){

    }

    public void writeToFile(String filename) throws IOException {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileWriter fw = new FileWriter(filename, true); // Write to end of file
        PrintWriter pw = new PrintWriter(fw);
        pw.println(s);
        pw.close();
        fw.close();
    }

}
