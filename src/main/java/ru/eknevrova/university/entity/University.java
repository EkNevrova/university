package ru.eknevrova.university.entity;

public class University {
    private String name;
    private Student student;
    private Professor professor;
    private Subject subject;

    public University (String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void getSubject() {
        return this.student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
