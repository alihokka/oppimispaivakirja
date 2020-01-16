package paaohjelma;

import java.util.ArrayList;

public class Topiclist {
    private Topic topic;
    private ArrayList<Topic> arrayList;

    public Topiclist(){
        this.arrayList = new ArrayList();
    }

    public void addTopicsToList(String aihe){
        arrayList.add(new Topic(aihe));
    }

    public Topic getTopic(String haettava) {
        Topic haettavatopic = null;
        for(Topic aihe : arrayList){
            if(aihe.getTitle().equals(haettava)){
                haettavatopic = aihe;
            }
        }
        return haettavatopic;
    }

    public void getAllTopics(){
        for(Topic aihe : arrayList){
            System.out.println(aihe.getTitle() + " " + aihe.getAdditionalSource() + " " + aihe.getCompletionDate() + " " +
                    aihe.getCreationDate() + " " +aihe.getDescription() + " " +aihe.getId()+ " " + aihe.isComplete());
        }

    }
}
