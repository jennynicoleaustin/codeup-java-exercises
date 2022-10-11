package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;
    private double average;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

    }

public String toString() {
        return "Name: " + this.name + " | Average: " + getAverage() + " |";
}
    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }


    public double getAverage() {
        double sum = 0;
        int i = 0;
        int numGrades = grades.size();
        double average;
        while(i < numGrades) {
            sum += grades.get(i);
            i++;
        } average = sum / numGrades;
        return average;
    }


}
