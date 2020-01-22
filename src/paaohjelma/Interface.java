package paaohjelma;

import java.io.IOException;
import java.util.Scanner;

public class Interface {
    private Writer writer;
    private Scanner scanner;
    private Remover remover;
    public Topiclist topiclist;

        public Interface(Writer writer, Scanner scanner, Remover remover){
            this.writer = writer;
            this.scanner = scanner;
            this.remover = remover;
        }

    public void kaynnista() throws IOException {

        while(true) {
            menu();
            String valinta = scanner.nextLine();

            if (valinta.equals("syötä")) {
                syotto();
                continue;
            }

            if(valinta.equals("listaa")){
                listaus();
            }

            if(valinta.equals("hae")){
                haku();
            }

            if(valinta.equals("päivitä")){
                paivitys();
            }

            if(valinta.equals(("poista"))){
                poisto();
            }

            if(valinta.equals("lopeta")){
                break;
            }

        }

    }

    public void paivitys(){
        System.out.print("Mitä aihetta haluat päivittää? ");
        String toupdate = scanner.nextLine();
        updatemenu();
        String selection = scanner.nextLine();
        if(selection.equals("otsikko")){
            System.out.println("Anna uusi otsikko: ");
            String newtopic = scanner.nextLine();
            topiclist.updateTopic(toupdate, newtopic);
            writer.updateTextFile();
        }
        if(selection.equals("kuvaus")){
            System.out.println("Anna uusi kuvaus: ");
            String newdescription = scanner.nextLine();
            topiclist.updateDescription(toupdate, newdescription);
            writer.updateTextFile();
        }
        if(selection.equals("lähde")){
            System.out.println("Anna uusi lähde: ");
            String newsource = scanner.nextLine();
            topiclist.updateSource(toupdate, newsource);
            writer.updateTextFile();
        }

        if(selection.equals("valmis")){
            topiclist.complete(toupdate);
            writer.updateTextFile();
        }
    }

    public void haku(){
        System.out.print("Anna haettava aihe: ");
        String aihe = scanner.nextLine();
        System.out.println(topiclist.haeTopic(aihe));
    }

    public void poisto() {
        System.out.print("Minkä aiheen haluat poistaa?: ");
        String toremove = scanner.nextLine();
        remover.removeTopic(toremove);
    }


    public void listaus(){
        Topiclist.getAllTopics();
        System.out.println("---------------------------------------");
        System.out.println(topiclist.getKoko() + " aihetta listalla");
    }

    public void syotto(){
        System.out.println("Anna aihe: ");
        String aihe = scanner.nextLine();
        System.out.println("Anna kuvaus: ");
        String kuvaus = scanner.nextLine();
        System.out.println("Anna lähde: ");
        String lahde = scanner.nextLine();
        writer.kirjoitaTiedostoon(aihe, kuvaus, lahde);
    }

    public void menu(){
        System.out.println("---------------------------------------");
        System.out.println("Komennot:");
        System.out.println("syötä = syötä aihe");
        System.out.println("hae = hae aiheen nimellä");
        System.out.println("listaa = listaa aiheet");
        System.out.println("poista = poista aihe");
        System.out.println("päivitä = päivitä aihe");
        System.out.println("lopeta = lopeta ohjelma");
        System.out.println("---------------------------------------");
    }

    public void updatemenu(){
        System.out.println("Minkä osan haluat päivittää?");
        System.out.println("otsikko");
        System.out.println("kuvaus");
        System.out.println("lähde");
        System.out.println("valmis");
    }


}
