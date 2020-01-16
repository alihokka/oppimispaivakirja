package paaohjelma;

import java.io.*;

public class Writer {
    public Writer(){

    }

    /*

    public void writeToFile(String filename) throws IOException {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileWriter fw = new FileWriter(filename, true); // Write to end of file
        PrintWriter pw = new PrintWriter(fw);
        pw.println(s);
        pw.close();
        fw.close();
    }

     */

    BufferedWriter writer = null;


    public void kirjoitaTiedostoon(String filename, String stringtowrite){
        try {
            writer = new BufferedWriter(new FileWriter("topics.txt", true));
            writer.write(stringtowrite + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }

}
