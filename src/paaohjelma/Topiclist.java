package paaohjelma;

import java.util.ArrayList;

public class Topiclist {
    private Topic topic;
    private static ArrayList<Topic> arrayList;

    public Topiclist(){
        arrayList = new ArrayList<>();
       // this.arrayList = new ArrayList();
    }

    public static void addTopicsToList(String aihe){
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

    public static int getKoko(){
        return arrayList.size();
    }

    public static void getAllTopics(){
        //String palautus = arrayList.get(0).getTitle();

        int i = 0;
        while(i < arrayList.size()){
            System.out.println("id: " + arrayList.get(i).getId() + " aihe: " + arrayList.get(i).getTitle() + " luotu: " + arrayList.get(i).getCreationDate());
            i++;
        }



    }
}
