package exercicios.core.association;

public class Developer {
    private String name;
    private String techStack;
    private Squad squad;

    public Developer(String name, String techStack) {
        this.name = name;
        this.techStack = techStack;
    }

    public void showDev(){
        System.out.println("Nome Dev: " + this.name);
        System.out.println("Stack do Dev: " + this.techStack);
        if (squad == null) return;
        System.out.println("Squad: " + squad.getSquadName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public Squad getSquad() {
        return squad;
    }

    public void setSquad(Squad squad) {
        this.squad = squad;
    }
}
