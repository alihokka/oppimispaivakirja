package paaohjelma;

import java.io.*;
import java.util.Scanner;

public class Reader {

    public Topiclist topiclist;

    public Reader(){
    this.topiclist = new Topiclist();
    }

    public void readFile(){
        try (Scanner tiedostonLukija = new Scanner(new File("topics.txt"))) {
            while (tiedostonLukija.hasNextLine()) {
                topiclist.addTopicsToList(tiedostonLukija.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("tiedostoa ei löydy");
        }
    }

    public void printFile(){
        try (Scanner tiedostonLukija = new Scanner(new File("topics.txt"))) {
            while (tiedostonLukija.hasNextLine()) {
                String lisattava = tiedostonLukija.nextLine();
                System.out.println(lisattava);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("tiedostoa ei löydy");
        }
    }
}
