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
        System.out.println("Профессор " + name + " преподаёт в университете " + university.getName() + " " + subject.getName() + " предмет");
    }

    @Override
    public void drinkCoffe() {
    }

    @Override
    public void writeOnBoard() {
        System.out.println("Профессор " + name + " пишет на доске условие задачи");
    }

    @Override
    public void teach() {
        System.out.println("Профессор " + name + " преподаёт предмет " + subject.getName() + " студенту " + student.getName());
    }

    @Override
    public void gradeExam() {
        System.out.println("Профессор " + name + " принимает экзамен по предмету " + subject.getName() + " у студента " + student.getName());
    }

    public String getName() {
        return this.name;
    }

    public Student getStudent() {
        return this.student;
    }

    public Student setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return this.subject;
    }

    public Subject setSubject(Subject subject) {
        this.subject = subject;
    }
    public University getUniversity() {
        return this.university;
    }
}
