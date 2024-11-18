package ru.eknevrova.university.entity;

public class Subject {
    private String name;
    private Student student;
    private Professor professor;

    public Subject (String name, Student student, Professor professor) {
        this.name = name;
        this.student = student;
        this.professor = professor;
    }

    public Subject () {
    }

    public String getName() {
        return this.name;
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
