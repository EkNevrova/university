package ru.eknevrova.university.entity;

public class Subject {
    private String name;
    private University university;
    private Student student;
    private Professor professor;

    public Subject (String name, University university) {
        this.name = name;
        this.university = university;
    }

    public Subject () {
    }

    public String getName() {
        return name;
    }

    public University getUniversity() {
        return university;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
