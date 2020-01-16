package paaohjelma;

import java.time.LocalDate;

public class Topic {
    static int id = 0;
    private String title;
    private String description;
    private String additionalSource;
    private boolean complete;
    private LocalDate creationDate;
    private LocalDate completionDate;

    public Topic(String title){
        this.title = title;
        this.creationDate = LocalDate.now();
        this.complete = false;
        this.id = id+1;
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription(){
        return this.description;
    }

    public String getAdditionalSource(){
        return this.additionalSource;
    }

    public boolean isComplete(){
        return this.complete;
    }

    public String getCreationDate(){
        return creationDate.toString();
    }

    public String getCompletionDate(){
        if(completionDate == null){
            return "Ei valmis.";
        }else{
            return this.completionDate.toString();
        }
    }

}
