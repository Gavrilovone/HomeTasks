/* Создайте класс Employee с атрибутами id, surname, salary, age, departament 
которые должны создаваться в конструкторе. Необходимо так же создать в этом классе метод,
который будет увеличивать зарплату в 2 раза. Создайте второй класс EmployeeTest и создайте в нем 
2 объекта класса Employee. Увеличьте каждому из них зарплату с помощью метода и вывидете на экран
 */
package hometasks.lesson5_3;

public class Employee {

    int id;
    String surname;
    int age;
    int salary;
    String departament;
    int povyshenyeZP;

    Employee(int id1, String surname1, int age1, int salary1, String departament1) {

        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        departament = departament1;
    }

    int povyshenyeZP(int salary) {
        this.salary = salary;
        povyshenyeZP = salary * 2;
        return povyshenyeZP;
    }
}

