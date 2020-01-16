package paaohjelma;

import java.io.IOException;
import java.util.Scanner;

public class Interface {
    private Reader reader;
    private Writer writer;
    private Scanner scanner;

        public Interface(Reader reader, Writer writer, Scanner scanner){
            this.reader = reader;
            this.writer = writer;
            this.scanner = scanner;
        }

    public void kaynnista() throws IOException {



        while(true) {
            System.out.println("---------------------------------------");
            System.out.println("Komennot:");
            System.out.println("listaa = listaa tämän kansion tiedostot");
            System.out.println("kirjoita = kirjoita tiedostoon");
            System.out.println("avaa = näytä tiedoston sisältö");
            System.out.println("---------------------------------------");

            String valinta = scanner.nextLine();

            if (valinta.equals("listaa")) {
                System.out.println("moi");
            }

            if (valinta.equals("kirjoita")) {
                System.out.print("Mihin tiedostoon kirjoitetaan?: ");
                String kirjoitusvalinta = scanner.nextLine();
                System.out.println("Lisää tekstiä:");
                writer.writeToFile(kirjoitusvalinta);
                continue;
            }

            if(valinta.equals("avaa")){
                System.out.println("Mikä tiedosto avataan?");
                String avattava = scanner.nextLine();

                reader.readFile(avattava);
            }

            if(valinta.isEmpty()){
                break;
            }

        }


    }
}
