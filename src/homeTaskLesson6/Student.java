/*
  Измените класс Student так, чтобы он имел 3 конструктора.
  1 - принимает все параметры, 2ой - только id, name, surname,
  course. 3ий - не принимает значений. Создайте в классе 
  StudentTest 3 объекта с помощью разных конструкторов.
 
 */
package homeTaskLesson6;

public class Student {

    int studentNumder;
    String name;
    String surName;
    int yearOfStudy;

    public Student(String name, String surName, int studentNumder, int yearOfStudy) {
        this.studentNumder = studentNumder;
        this.surName = surName;
        this.yearOfStudy = yearOfStudy;
        this.name = name;
    }

    Student(String name1, String surName1, int studentNumder1) {
        this(name1, surName1, studentNumder1, 0);
    }

    Student() {
        this(null, null, 0, 0);

    }

    /* решил  немного  расширить  задачу и  создать метод,  который будет выводить в консоль
       данные студента, в зависимости от того  сколько у него аргументов. Параметр allParametrs1
       в методе это число  аргументов вызванного  конструктора( 4, 3 или 0  соответственно) 
    */
    void showInfo(Student student, int allParametrs1) {
        int allParametrs = allParametrs1;
        if (allParametrs == 4) {
            System.out.println("Студент " + name + " " + surName + ", Номер студенческого билета " + studentNumder + ", Курс " + yearOfStudy);
        } else if (allParametrs == 3) {
            System.out.println("Студент " + name + " " + surName + ", Номер студенческого билета " + studentNumder);
        } else if (allParametrs == 0) {
            System.out.println("Уупс, никакой информации о студенте ");
        }

    }

}
