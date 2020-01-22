package paaohjelma;

import java.util.ArrayList;

public class Topiclist {
    //private Topic topic;
    private static ArrayList<Topic> arrayList;

    public Topiclist() {
        arrayList = new ArrayList<>();
    }

    public static void addTopicsToList(String aihe, String kuvaus, String lahde) {
        arrayList.add(new Topic(aihe, kuvaus, lahde));
    }

    public static String haeTopic(String haettava) {
        String haettavatopic = haettava + " ei löytynyt.";
        int i = 0;
        while (i <= arrayList.size() - 1) {
            if (arrayList.get(i).getTitle().equals(haettava)) {
                haettavatopic = "ID: " + arrayList.get(i).getId() + ", Title: " + arrayList.get(i).getTitle() +
                        ", Description: " + arrayList.get(i).getDescription() +
                        ", Source: " + arrayList.get(i).getAdditionalSource() +
                        ", Is Complete: " + arrayList.get(i).isComplete() +
                        ", Creation date: " + arrayList.get(i).getCreationDate() +
                        ", Completion date: " + arrayList.get(i).getCompletionDate();
            }
            i++;
        }
        return haettavatopic;
    }

    public static String getTopic(String haettava) {
        String haettavatopic = null;
        for (Topic aihe : arrayList) {
            if (aihe.getTitle().equals(haettava)) {
                haettavatopic = aihe.getId() + "," + aihe.getTitle() + "," + aihe.getDescription() + "," + aihe.getAdditionalSource()
                        + "," + aihe.isComplete() + "," + aihe.getCreationDate() + "," + aihe.getCompletionDate();
            }
        }
        return haettavatopic;
    }

    public static int getKoko() {
        return arrayList.size();
    }

    public static void getAllTopics() {
        //String palautus = arrayList.get(0).getTitle();

        int i = 0;
        while (i < arrayList.size()) {
            System.out.println("id: " + arrayList.get(i).getId() + " aihe: " + arrayList.get(i).getTitle() + " kuvaus: "
                    + arrayList.get(i).getDescription() + " lahde: " + arrayList.get(i).getAdditionalSource() +
                    " onko valmis: " + arrayList.get(i).isComplete() + " luotu: " + arrayList.get(i).getCreationDate()
                    + " valmis: " + arrayList.get(i).getCompletionDate());
            i++;
        }


    }
}
