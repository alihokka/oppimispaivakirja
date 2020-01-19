package paaohjelma;

import java.io.IOException;
import java.util.Scanner;

public class Interface {
    private Reader reader;
    private Writer writer;
    private Scanner scanner;
    private Topic topic;
    public Topiclist topiclist;

        public Interface(Reader reader, Writer writer, Scanner scanner){
            this.reader = reader;
            this.writer = writer;
            this.scanner = scanner;
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
                continue;
            }

            if(valinta.equals("listaa")){
                Topiclist.getAllTopics();
                System.out.println("---------------------------------------");
                System.out.println(topiclist.getKoko() + " aihetta listalla");

            }

            if(valinta.equals("lue")){
                reader.printFile();
            }

            if(valinta.equals("lopeta")){
                break;
            }

        }


    }
}
