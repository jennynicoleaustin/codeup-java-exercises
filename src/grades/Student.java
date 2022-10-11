package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage () {
        double sum = 0;
        int i = 0;
        int numGrades = grades.size();
        while(i < numGrades) {
            sum += grades.get(i);
            i++;
        }
        return sum / numGrades;
    }
}
