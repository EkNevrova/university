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
        Subject politics = new Subject("Политология", economicUniversity);
        Subject accounting = new Subject("Бухгалтерский учёт", economicUniversity);

        Professor mathProfessor = new Professor("Сергей Алексеевич", economicUniversity, mathematics);
        Professor econProfessor = new Professor("Иван Андреевич", economicUniversity, economy);
        Professor politProfessor = new Professor("Марк Иосифович", economicUniversity, politics);
        Professor accountProfessor = new Professor("Эвелина Родионовна", economicUniversity, accounting);

        Student student1 = new Student("Пётр Богомолов", economicUniversity);
        Student student2 = new Student("Инна Вертинская", economicUniversity);
        Student student3 = new Student("Андрей Петров", economicUniversity);
        Student student4 = new Student("Полина Быстрова", economicUniversity);
        Student student5 = new Student("Пётр Богомолов", economicUniversity);
        Student student6 = new Student("Елена Вершинина", economicUniversity);
        Student student7 = new Student("Артём Борисов", economicUniversity);
        Student student8 = new Student("Вероника Крылова", economicUniversity);

        StudentService studentService = new StudentService();
        ProfessorService professorService = new ProfessorService();


    }
}
