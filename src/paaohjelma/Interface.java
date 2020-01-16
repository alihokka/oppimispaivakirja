package paaohjelma;

import java.io.IOException;
import java.util.Scanner;

public class Interface {
    private Reader reader;
    private Writer writer;
    private Scanner scanner;
    private Topic topic;
    private Topiclist topiclist;

        public Interface(Reader reader, Writer writer, Scanner scanner, Topiclist topiclist){
            this.reader = reader;
            this.writer = writer;
            this.scanner = scanner;
            this.topiclist = topiclist;
        }

    public void kaynnista() throws IOException {



        while(true) {
            System.out.println("---------------------------------------");
            System.out.println("Komennot:");
            System.out.println("kirjoita = kirjoita tiedostoon");
            System.out.println("lue = näytä tiedoston sisältö");
            System.out.println("listaa = listaa aiheet");
            System.out.println("poistu = lopeta ohjelma");
            System.out.println("---------------------------------------");

            String valinta = scanner.nextLine();

            if (valinta.equals("kirjoita")) {
                System.out.println("Lisää tekstiä:");
                String kirjoitettava = scanner.nextLine();
                writer.kirjoitaTiedostoon(kirjoitettava);
                topiclist.addTopicsToList(kirjoitettava);
                continue;
            }

            if(valinta.equals("listaa")){
                    topiclist.getAllTopics();
            }

            if(valinta.equals("lue")){
                reader.readFile();
            }

            if(valinta.equals("lopeta")){
                break;
            }

        }


    }
}
