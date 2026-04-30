package projects.phase1;

public class Main {
    public static void main(String[] args) {
        Training treino1 = new Training(100);
        Training treino2 = new Training(100, 12);

        treino1.setStyle("Borboleta");
        treino2.setStyle("Costas");

        treino1.showTraining();
        treino2.showTraining();

        treino1.setTimeSec(-8);
        treino1.showTraining();

        treino2.setDistanceMeters(-90);
        treino2.showTraining();
    }
}
