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
        return name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
