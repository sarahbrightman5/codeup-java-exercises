package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private  ArrayList<Integer> grades;

    public void addGrade(int grade){
         grades.add(grade);
    }

    public double getGradeAverage(){
        int sum = 0;
        for(int grade: grades ){
            sum+=grade;
        }
        return (double) sum/grades.size();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }
}
