/*
  В классе StudentTest  написать 2 метода, которые принимают 2 input параметра - 2 объекта класса Student
  из  Lesson11. Первый метод сравнивает 2х студентов, используя 1 if  statement  и логические операторы
  внутри него и выводит на экран информацию о том, равны ли студенты. Второй метод использует nested if
  statement, сравнивая все атрибуты студентов по отдельности, выводит на экран информацию о том, равны ли
  студенты, а если не равны, то в чем именно было обнаружено первое неравенство. 
 */
package HomeTaskLesson12;

import lesson11.*;

public class StudentTest {

    static void compare1(Student s1, Student s2) {
        if (s1.name == s2.name && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    static void compare2(Student s1, Student s2) {
        if (s1.name == s2.name) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {

                    System.out.println("Студенты равны");
                } else {
                    System.out.println("Студенты не равны, у них разные оценки");
                }
            } else {
                System.out.println("Студенты не равны, у них разные курсы");
            }
        } else {
            System.out.println("Студенты не равны, у них разные имена");
        }
    }

    public static void main(String[] args) {

        Student st3 = new Student("Иван", 3, 6.1);
        Student st4 = new Student("Иван", 2, 6.1);
        compare1(st3, st4);
        compare2(st3, st4);
    }
}
