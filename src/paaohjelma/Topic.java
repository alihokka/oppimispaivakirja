package paaohjelma;

import java.time.LocalDate;
import java.util.Random;

public class Topic {
    private int id;
    private String title;
    private String description;
    private String additionalSource;
    private boolean complete;
    private LocalDate creationDate;
    private LocalDate completionDate;
    Random random = new Random();

    public Topic(String title, String description, String additionalSource) {
        this.title = title;
        this.creationDate = LocalDate.now();
        this.complete = false;
        this.id = random.nextInt(1000000);
        this.description = description;
        this.additionalSource = additionalSource;
        this.completionDate = null;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getAdditionalSource() {
        if(this.additionalSource == null){
            return "ei asetettu";
        }else{
            return this.additionalSource;
        }
    }

    public boolean isComplete() {
        return this.complete;
    }

    public String getCreationDate() {
        return creationDate.toString();
    }


    public String getCompletionDate() {
        if (completionDate == null) {
            return "ei valmis";
        } else {
            return this.completionDate.toString();
        }
    }

}
