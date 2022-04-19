package homeTaskLesson6;

public class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student("Алексей", "Иванов", 14, 2);
        st1.showInfo(st1, 4);
        Student st2 = new Student("Иван", "Петров", 14);
        st2.showInfo(st2, 3);
        Student st3 = new Student();
        st3.showInfo(st3, 0);

    }

}
