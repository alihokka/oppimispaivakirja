package paaohjelma;


public class Main {

    public static void main(String[] args) {
        Topic aihe = new Topic("Java");

        System.out.println(aihe.getId());
        System.out.println(aihe.getTitle());
        System.out.println(aihe.getCreationDate());
        System.out.println(aihe.getDescription());
        System.out.println(aihe.getAdditionalSource());
        System.out.println(aihe.getCompletionDate());
        System.out.println(aihe.isComplete());

        Topic toinenaihe = new Topic("Eri juttu");

        System.out.println(toinenaihe.getId());
        System.out.println(toinenaihe.getTitle());
        System.out.println(toinenaihe.getCreationDate());
        System.out.println(toinenaihe.getCompletionDate());

    }
}
