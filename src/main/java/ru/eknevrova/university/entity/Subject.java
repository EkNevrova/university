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
        return this.name;
    }

    public University getUniversity() {
        return this.university;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public Professor setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student getStudent() {
        return this.student;
    }

    public Student setStudent(Student student) {
        this.student = student;
    }
}
