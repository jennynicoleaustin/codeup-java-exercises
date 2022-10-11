package grades;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student ramaj = new Student("Ramaj");
        ramaj.addGrade(99);
        ramaj.addGrade(98);
        ramaj.addGrade(89);

        Student peter = new Student("Peter");
        peter.addGrade(80);
        peter.addGrade(90);
        peter.addGrade(95);

        Student jenny = new Student("Jenny");
        jenny.addGrade(99);
        jenny.addGrade(90);
        jenny.addGrade(88);

        Student eric = new Student("Eric");
        eric.addGrade(55);
        eric.addGrade(75);
        eric.addGrade(95);


        students.put("RamajTheTiger", ramaj);
        students.put("PeterTheGreat", peter);
        students.put("dinojennycodes", jenny);
        students.put("ericf", eric);
    }
}

