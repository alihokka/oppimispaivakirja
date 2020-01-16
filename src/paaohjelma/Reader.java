package paaohjelma;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public Reader(){

    }

    public void readFile(){
        String tulos = null;
        try (FileReader fr = new FileReader("topics.txt");
             BufferedReader in = new BufferedReader(fr)) {
            StringBuilder teksti = new StringBuilder();
            String rivi;
            int i = 0;
            int pituus = 0;
            while ((rivi = in.readLine()) != null) {
                teksti.append(rivi).append("\n");
                pituus = pituus + rivi.length();
                i++;
            }
            tulos = teksti.toString();
            System.out.println(tulos);
        } catch (FileNotFoundException ex) {
            System.out.println("Error: File not found!");
        } catch (IOException ex) {
            System.out.println("Error: Unknown error!");
        }
    }
}
