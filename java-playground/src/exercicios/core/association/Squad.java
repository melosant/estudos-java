package exercicios.core.association;

public class Squad {
    private String squadName;
    private Developer[] devs;

    public Squad(String squadName) {
        this.squadName = squadName;
    }

    public void showSquad(){
        if (devs == null) {
            System.out.println("Squad Vazia!");
            return;
        }

        System.out.println("------- SQUAD --------");
        for (Developer dev : devs) {
            dev.showDev();
            System.out.println("---------------------------");
        }
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public Developer[] getDevs() {
        return devs;
    }

    public void setDevs(Developer[] devs) {
        this.devs = devs;
    }
}
