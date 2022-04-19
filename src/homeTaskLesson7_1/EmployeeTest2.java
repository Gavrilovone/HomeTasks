
package homeTaskLesson7_1;


public class EmployeeTest2 {
    public static void main(String[] args) {
        homeTaskLesson7.Employee emp2 = new homeTaskLesson7.Employee(4, "Иванов", 2000, 34);
            emp2.surName = "Петров";
            System.out.println("Значение переменной surName из другого пакета: " + emp2.id);
           
    }
}
