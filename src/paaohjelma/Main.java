package paaohjelma;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        Writer kirjoittaja = new Writer();
        Reader reader = new Reader();
        Remover remover = new Remover();
        Topiclist topiclist = new Topiclist();

        //System.out.println(topiclist.getTopic("Java"));

        reader.readFile();

            Interface userinterface = new Interface(reader, kirjoittaja, lukija, remover);



        try {
            userinterface.kaynnista();
        }catch (IOException e){
            System.out.println("Jotain tapahtui");
            e.printStackTrace();
        }

        }
    }

