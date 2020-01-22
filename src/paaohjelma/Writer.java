package paaohjelma;

import java.io.*;

public class Writer {
    Topiclist topiclist;

    public Writer() {

    }

    BufferedWriter writer = null;


    public void kirjoitaTiedostoon(String topic, String description, String source) {
        try {
            writer = new BufferedWriter(new FileWriter("topics.txt", true));
            Topiclist.addTopicsToList(topic, description, source);
            writer.write(topiclist.getTopic(topic) + "\n");

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
