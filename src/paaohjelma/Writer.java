package paaohjelma;

import java.io.*;

public class Writer {
    Topiclist topiclist = new Topiclist();

    public Writer() {
    }

    BufferedWriter writer = null;


    public void kirjoitaTiedostoon(String stringtowrite) {
        try {
            writer = new BufferedWriter(new FileWriter("topics.txt", true));
            topiclist.addTopicsToList(stringtowrite);
            writer.write(stringtowrite + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }

}
