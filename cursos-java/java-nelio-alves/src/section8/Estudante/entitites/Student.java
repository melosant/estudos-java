package section8.Estudante.entitites;

public class Student {
    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        setName(name);
        this.grades = new double[3];
        setGrades(grades);
    }

    @Override
    public String toString() {
        String relatory = "FINAL GRADE = " + sumGrades();
        if (sumGrades() < 60) {
            relatory += "\nFAILED\nMISSING " + missingPoints() + " POINTS.";
        } else {
            relatory += "\nPASS";
        }

        return relatory;
    }

    public double sumGrades() {
        double sum = 0;
        for (double grade : this.grades) {
            sum += grade;
        }
        return sum;
    }

    public double missingPoints() {
        return 60 - sumGrades();
    }

    public void setName(String name) {
        if (name.isBlank()) return;
        this.name = name;
    }

    public void setGrades(double[] grades) {
        if (grades == null || grades.length != 3) return;

        for (int i = 0; i < grades.length; i++) {
            if (i == 0) {
                if (grades[i] >= 0 && grades[i] <= 30) {
                    this.grades[i] = grades[i];
                } else {
                    System.out.println("A nota máxima do primeiro trimestre foi 30.");
                }
            } else {
                if (grades[i] >= 0 && grades[i] <= 35) {
                    this.grades[i] = grades[i];
                } else {
                    System.out.println("A nota máxima do segundo e terceiro trimestre foi 35.");
                }
            }
        }

    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }
}
