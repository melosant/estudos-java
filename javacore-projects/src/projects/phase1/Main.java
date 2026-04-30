package projects.phase1;

public class Main {
    public static void main(String[] args) {
        Training treino1 = new Training(100, 8.3, "Crawl");
        Training treino2 = new Training(100, 12);


        treino1.showTraining();
        treino2.showTraining();


        // Não irá alterar o tempo
        treino1.setTimeSec(-8);
        treino1.showTraining();


        // Não irá alterar a distância
        treino2.setDistanceMeters(-90);
        treino2.setStyle("Borboleta");
        treino2.showTraining();
    }
}
