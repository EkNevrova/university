package ru.eknevrova.university.entity;

import ru.eknevrova.university.service.GeneralActions;
import ru.eknevrova.university.service.ProfessorActions;

public class Professor implements GeneralActions, ProfessorActions {
    private String name;
    private University university;
    private Student student;
    private Subject subject;

    public Professor (String name, University university, Subject subject) {
        this.name = name;
        this.university = university;
        this.subject = subject;
    }

    public Professor () {
    }

    @Override
    public void belong() {
        System.out.println("Профессор " + name + " преподаёт в " + university.getName() + " " + subject.getName());
    }

    @Override
    public void drinkCoffe() {
        System.out.println("Профессор " + name + " выпил чашечку кофе и пошёл в аудиторию");
    }

    @Override
    public void writeOnBoard() {
        System.out.println("Профессор " + name + " написал на доске условие задачи");
    }

    @Override
    public void teach() {
        System.out.println("У профессора " + name + " студент " + student.getName() + " изучает " + subject.getName());
    }

    @Override
    public void gradeExam() {
        System.out.println("Профессор " + name + " принимает экзамен по " + subject.getName() + " у студента " + student.getName());
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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public University getUniversity() {
        return university;
    }
}
