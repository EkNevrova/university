package ru.eknevrova.university._main;

import ru.eknevrova.university.entity.Professor;
import ru.eknevrova.university.entity.Student;
import ru.eknevrova.university.entity.Subject;
import ru.eknevrova.university.entity.University;
import ru.eknevrova.university.util.ProfessorService;
import ru.eknevrova.university.util.StudentService;

public class _Main {
    public static void main (String args[]) {
        University economicUniversity = new University("Экономический университет");

        Subject mathematics = new Subject("Матемактика", economicUniversity);
        Subject economy = new Subject("Экономика", economicUniversity);
        Subject accounting = new Subject("Бухгалтерский учёт", economicUniversity);

        Professor mathProfessor = new Professor("Сергей Алексеевич", economicUniversity, mathematics);
        Professor econProfessor = new Professor("Иван Андреевич", economicUniversity, economy);
        Professor accountProfessor = new Professor("Эвелина Родионовна", economicUniversity, accounting);

        Student student1 = new Student("Пётр Богомолов", economicUniversity);
        Student student2 = new Student("Кирилл Быстров", economicUniversity);
        Student student3 = new Student("Артём Борисов", economicUniversity);

        StudentService studentService = new StudentService();
        ProfessorService professorService = new ProfessorService();

        mathProfessor.setSubject(mathematics);
        mathProfessor.setStudent(student1);
        student1.setSubject(mathematics);
        student1.setProfessor(mathProfessor);
        professorService.professorTeach(mathProfessor, mathProfessor);
        studentService.studentStudy(student1, student1);

        econProfessor.setSubject(economy);
        econProfessor.setStudent(student2);
        student2.setSubject(economy);
        student2.setProfessor(econProfessor);
        professorService.professorGradeExam(econProfessor, econProfessor);
        studentService.studentTakeExam(student2, student2);

        accountProfessor.setSubject(accounting);
        accountProfessor.setStudent(student3);
        student3.setSubject(accounting);
        student3.setProfessor(accountProfessor);
        studentService.studentStudy(student3, student3);
        professorService.professorTeach(accountProfessor, accountProfessor);
        professorService.professorGradeExam(accountProfessor, accountProfessor);
        studentService.studentTakeExam(student3, student3);

        econProfessor.setStudent(student3);
        student3.setSubject(economy);
        student3.setProfessor(econProfessor);
        professorService.professorGradeExam(econProfessor, econProfessor);
        studentService.studentTakeExam(student3, student3);

        mathProfessor.setStudent(student2);
        student2.setSubject(mathematics);
        student2.setProfessor(mathProfessor);
        professorService.professorTeach(mathProfessor, mathProfessor);
        studentService.studentStudy(student2, student2);

        accountProfessor.setStudent(student1);
        student1.setSubject(accounting);
        student1.setProfessor(accountProfessor);
        professorService.professorTeach(accountProfessor, accountProfessor);
        studentService.studentStudy(student1, student1);
    }
}
