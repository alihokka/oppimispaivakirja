package paaohjelma;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public Topiclist topiclist;

    public Reader(){
    this.topiclist = new Topiclist();
    }

    public void readFile(){
        try (Scanner tiedostonLukija = new Scanner(new File("topics.txt"))) {
            ArrayList<String []>rivit = new ArrayList<>();
            while (tiedostonLukija.hasNextLine()) {
                rivit.add(tiedostonLukija.nextLine().split(","));
            }
            int i = 0;
            while(i < rivit.size()){
                topiclist.addTopicsToList(rivit.get(i)[1],rivit.get(i)[2], rivit.get(i)[3]);
                i++;
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
