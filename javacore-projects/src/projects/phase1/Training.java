package projects.phase1;

public class Training {
    private int distanceMeters;
    private float timeSec;
    private String style;
    private float paceMean;


    public Training(int distanceMeters){
        if (distanceMeters < 0) {
            System.out.println("\nA distância não pode ser negativa!\n");
        } else {
            this.distanceMeters = distanceMeters;
            System.out.printf("\nDistância registrada com sucesso : %dm\n", this.distanceMeters);
        }
    }


    public Training(int distanceMeters, float timeSec){
        this(distanceMeters);
        if (timeSec < 0.0) {
            System.out.println("\nO tempo não pode ser negativo!\n");
        } else {
            this.timeSec = timeSec;
            System.out.printf("\nTempo registrado com sucesso : %fs\n", this.timeSec);
        }
    }


    public void showTraining(){
        averagePace();
        System.out.println("\n=====================================");
        System.out.println("Estilo de Nado : " + this.style);
        System.out.println("Distância em metros : " + this.distanceMeters + "m");
        System.out.println("Tempo em segundos : " + this.timeSec + "s");
        System.out.println("Pace médio : " + this.paceMean + "m/s");
        System.out.println("=====================================\n");
    }


    private void averagePace(){
        if (this.distanceMeters == 0 || this.timeSec == 0.0){
            System.out.println("\nFalta de informações para o cálculo do pace médio.\n");
            this.paceMean = 0;
        } else {
            this.paceMean = this.distanceMeters / this.timeSec;
        }
    }


    public void setDistanceMeters(int distanceMeters) {
        if (distanceMeters < 0) {
            System.out.println("\nA distância alterada não pode ser negativa!\n");
        } else {
            this.distanceMeters = distanceMeters;
            System.out.printf("\nDistância alterada com sucesso : %dm\n", this.distanceMeters);
        }
    }

    public void setTimeSec(float timeSec) {
        if (timeSec < 0.0) {
            System.out.println("\nO tempo alterado não pode ser negativo!\n");
        } else {
            this.timeSec = timeSec;
            System.out.printf("\nTempo alterado com sucesso : %fs\n", this.timeSec);
        }
    }

    public void setStyle(String style) {
        this.style = style;
        System.out.printf("\nEstilo registrado com sucesso : %s\n", this.style);
    }
}
