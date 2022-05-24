/*
  Создайте класс Student со следующими переменными: name (используйте StringBuilder), course, grade
  Примените инкапсуляцию к данному классу. Длина имни объектов не должна быть не менее 3-х символов, 
  оценки должны быть числами в интервале от 1 до 10, курс должен быть числом от 1 до 4 включительно.
  Создайте метод showinfo, который будет выводить всю информацию о студенте, не используя переменные
  класса напрямую. Создайте класс TestStudent, в котором создайте объект класса Student, придайте его 
  переменным значения. Про  изведите вызов метода showinfo.

 */
package HomeTaskLesson22;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder n = new StringBuilder(name);
        return n;
    }

    public void setName(StringBuilder name) {

        if (name.length() >= 3) {
            this.name = name;
        } else {
            this.name = new StringBuilder("Имя не корректно");
        }

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {

        if (course > 0 && course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {

        if (grade > 0 && grade <= 10) {
            this.grade = grade;
        }
    }

    void showinfo() {
        if (this.getCourse() == 0 || this.grade == 0) {
            System.out.println("Один из параметров введен неверно!");
        } else {
            System.out.println("Имя студента: " + this.getName());
            System.out.println("Курс студента: " + this.getCourse());
            System.out.println("Оценка студента: " + this.getGrade());

        }
    }
}

class StudentTest {

    public static void main(String[] args) {
        Student st = new Student();
        st.setName(new StringBuilder("Иван"));
        st.setCourse(3);
        st.setGrade(8);
        st.showinfo();

    }

}

/**
Имя студента: Иван
Курс студента: 3
Оценка студента: 8
 */
