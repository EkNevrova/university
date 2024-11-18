package ru.eknevrova.university.entity;

import ru.eknevrova.university.service.GeneralActions;
import ru.eknevrova.university.service.StudentActions;

public class Student implements GeneralActions, StudentActions {
    private String name;
    private University university;
    private Professor professor;
    private Subject subject;

    public Student (String name, University university, Professor professor, Subject subject) {
        this.name = name;
        this.university = university;
        this.professor = professor;
        this.subject = subject;
    }

    public Student () {
    }

    @Override
    public void belong() {
        System.out.println("Студент " + name + " из университета " + university.getName());
    }

    @Override
    public void drinkCoffe() {
    }

    @Override
    public void writeOnBoard() {
        System.out.println("Студент " + name + " пишет на доске решение задачи");
    }

    @Override
    public void study() {
        System.out.println("Студент " + name + " изучает " + subject.getName() + " у профессора " + professor.getName());
    }

    @Override
    public void takeExam() {
        System.out.println("Студент " + name + " сдаёт экзамене по предмету " + subject.getName() + " профессору " + professor.getName());
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
