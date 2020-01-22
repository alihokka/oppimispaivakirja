package paaohjelma;

import java.io.IOException;
import java.util.Scanner;

public class Interface {
    private Reader reader;
    private Writer writer;
    private Scanner scanner;
    private Remover remover;
    private Topic topic;
    public Topiclist topiclist;

        public Interface(Reader reader, Writer writer, Scanner scanner, Remover remover){
            this.reader = reader;
            this.writer = writer;
            this.scanner = scanner;
            this.remover = remover;
        }

    public void kaynnista() throws IOException {



        while(true) {
            System.out.println("---------------------------------------");
            System.out.println("Komennot:");
            System.out.println("kirjoita = kirjoita tiedostoon");
            System.out.println("lue = näytä tiedoston sisältö");
            System.out.println("hae = hae aiheen nimellä");
            System.out.println("listaa = listaa aiheet");
            System.out.println("poistu = lopeta ohjelma");
            System.out.println("---------------------------------------");

            String valinta = scanner.nextLine();

            if (valinta.equals("kirjoita")) {
                System.out.println("Anna aihe: ");
                String aihe = scanner.nextLine();
                System.out.println("Anna kuvaus: ");
                String kuvaus = scanner.nextLine();
                System.out.println("Anna lähde: ");
                String lahde = scanner.nextLine();
                writer.kirjoitaTiedostoon(aihe, kuvaus, lahde);
                continue;
            }

            if(valinta.equals("listaa")){
                Topiclist.getAllTopics();
                System.out.println("---------------------------------------");
                System.out.println(topiclist.getKoko() + " aihetta listalla");

            }

            if(valinta.equals("hae")){
                System.out.print("Anna haettava aihe: ");
                String aihe = scanner.nextLine();
                System.out.println(topiclist.haeTopic(aihe));
            }

            if(valinta.equals("lue")){
                reader.printFile();
            }

            if(valinta.equals(("poista"))){
                remover.removeTopic();
            }

            if(valinta.equals("lopeta")){
                break;
            }

        }


    }
}
