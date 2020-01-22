package paaohjelma;

import java.io.*;

public class Remover {
    Topiclist topiclist;

    public Remover() {

    }

    public void removeTopic() {

        try {

            File inputFile = new File("topics.txt");
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String lineToRemove = "bbb";
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(lineToRemove)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            //boolean successful =
                    inputFile.delete();
                    tempFile.renameTo(inputFile);
        } catch (Exception e) {
            System.out.println("Didn't work!");
        }
    }
}
