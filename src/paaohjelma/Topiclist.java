package paaohjelma;

import java.time.LocalDate;
import java.util.ArrayList;

public class Topiclist {
    private static ArrayList<Topic> arrayList;

    public Topiclist() {
        arrayList = new ArrayList<>();
    }

    public static void addTopicsToList(String aihe, String kuvaus, String lahde) {
        arrayList.add(new Topic(aihe, kuvaus, lahde));
    }

    public static void addTopicsToListFromTxtFile(int id, String aihe, String kuvaus, String lahde){
        arrayList.add(new Topic(id, aihe, kuvaus, lahde));
    }

    public static String getIdToRemove(String tofind) {
        String specificId = "%";
        int i = 0;
        while (i <= arrayList.size() - 1) {
            if (arrayList.get(i).getTitle().equals(tofind)) {
                specificId = Integer.toString(arrayList.get(i).getId());
                arrayList.remove(i);
            }
            i++;
        }
        return specificId;
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

    public static void updateTopic(String topicToUpdate, String newTopic) {
        int i = 0;
        while (i <= arrayList.size() - 1) {
            if (arrayList.get(i).getTitle().equals(topicToUpdate)) {
                arrayList.get(i).setTitle(newTopic);
            }
            i++;
        }
    }

    public static void updateDescription(String topicToUpdate, String newDescription) {
        int i = 0;
        while (i <= arrayList.size() - 1) {
            if (arrayList.get(i).getTitle().equals(topicToUpdate)) {
                arrayList.get(i).setDescription(newDescription);
            }
            i++;
        }
    }

    public static void updateSource(String topicToUpdate, String newSource) {
        int i = 0;
        while (i <= arrayList.size() - 1) {
            if (arrayList.get(i).getTitle().equals(topicToUpdate)) {
                arrayList.get(i).setAdditionalSource(newSource);
            }
            i++;
        }
    }

    public static void complete(String topicComplete){
        int i = 0;
        while (i <= arrayList.size() - 1) {
            if (arrayList.get(i).getTitle().equals(topicComplete)) {
                arrayList.get(i).setComplete(true);
                arrayList.get(i).setCompletionDate(LocalDate.now());
            }
            i++;
        }
    }

    public static void getAllTopics() {
        int i = 0;
        while (i < arrayList.size()) {
            System.out.println("id: " + arrayList.get(i).getId() + " aihe: " + arrayList.get(i).getTitle() + " kuvaus: "
                    + arrayList.get(i).getDescription() + " lahde: " + arrayList.get(i).getAdditionalSource() +
                    " onko valmis: " + arrayList.get(i).isComplete() + " luotu: " + arrayList.get(i).getCreationDate()
                    + " valmis: " + arrayList.get(i).getCompletionDate());
            i++;
        }
    }

    public static String updateTxtFile() {
        String updation = "";
        int i = 0;
        while (i < arrayList.size()) {
            updation = arrayList.get(i).getId() + "," + arrayList.get(i).getTitle() + ","
                    + arrayList.get(i).getDescription() + "," + arrayList.get(i).getAdditionalSource() +
                    "," + arrayList.get(i).isComplete() + "," + arrayList.get(i).getCreationDate()
                    + "," + arrayList.get(i).getCompletionDate();
            i++;
        }
        return updation;
    }
}
