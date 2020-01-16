package paaohjelma;

import java.util.Scanner;

public class Interface {
    private Topic topic;
    private Reader reader;
    private Writer writer;
    private Scanner scanner;

        public Interface(Topic topic, Reader reader, Writer writer, Scanner scanner){
            this.topic = topic;
            this.reader = reader;
            this.writer = writer;
            this.scanner = scanner;
        }
        public void start(){

        }
}
