package paaohjelma;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        Writer kirjoittaja = new Writer();
        Reader reader = new Reader();
        Topiclist topiclist = new Topiclist();

            Interface userinterface = new Interface(reader, kirjoittaja, lukija, topiclist);

        try {
            userinterface.kaynnista();
        }catch (IOException e){
            System.out.println("Jotain tapahtui");
            e.printStackTrace();
        }

        }
    }

