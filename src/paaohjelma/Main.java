package paaohjelma;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Scanner lukija = new Scanner(System.in);
        Writer kirjoittaja = new Writer();
        Reader reader = new Reader();

            Interface userinterface = new Interface(reader, kirjoittaja, lukija);

        try {
            userinterface.kaynnista();
        }catch (IOException e){
            System.out.println("Jotain tapahtui");
            e.printStackTrace();
        }*/

        Topiclist aihelistaus = new Topiclist();
        aihelistaus.addTopicsToList("Java");
        aihelistaus.addTopicsToList("Dava");
        aihelistaus.addTopicsToList("Hava");



        System.out.println(aihelistaus.getTopic("Java").getTitle());
        System.out.println(aihelistaus.getTopic("Java").getId());
        System.out.println(aihelistaus.getTopic("Java").getId());

        System.out.println(aihelistaus.getTopic("Dava").getTitle());
        System.out.println(aihelistaus.getTopic("Dava").getId());

        System.out.println(aihelistaus.getTopic("Hava").getTitle());
        System.out.println(aihelistaus.getTopic("Hava").getId());
        System.out.println(aihelistaus.getTopic("Hava").getId());
        System.out.println(aihelistaus.getTopic("Hava").isComplete());
        System.out.println(aihelistaus.getTopic("Hava").isComplete());
        System.out.println(aihelistaus.getTopic("Java"));

        aihelistaus.getAllTopics();




        }
    }

