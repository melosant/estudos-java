package projects.phase1;

public class Training {
    private int distanceMeters;
    private double timeSec;
    private String style;


    public Training(int distanceMeters, double timeSec, String style){
        // passa pela validação dos setters
        setDistanceMeters(distanceMeters);
        setTimeSec(timeSec);
        setStyle(style);
    }


    public Training(int distanceMeters, double timeSec){
        this(distanceMeters, timeSec, "Não Definido");
    }


    public void showTraining(){
        System.out.println("\n=====================================");
        System.out.println("Estilo de Nado : " + this.style);
        System.out.println("Distância em metros : " + this.distanceMeters + "m");
        System.out.println("Tempo em segundos : " + this.timeSec + "s");
        System.out.println("Pace médio : " + getAveragePace() + "m/s");
        System.out.println("=====================================\n");
    }


    public double getAveragePace(){
        if (this.distanceMeters == 0 || this.timeSec == 0.0){
            return 0.0;
        } else {
            return this.distanceMeters / this.timeSec;
        }
    }


    public void setDistanceMeters(int distanceMeters) {
        if (distanceMeters >= 0) {
            this.distanceMeters = distanceMeters;
        }
    }


    public void setTimeSec(double timeSec) {
        if (timeSec >= 0.0) {
            this.timeSec = timeSec;
        }
    }


    public void setStyle(String style) {
        this.style = style;
    }
}
