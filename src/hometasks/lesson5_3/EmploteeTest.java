
package hometasks.lesson5_3;


class EmployeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(7, "Кондратьев", 34, 3800, " Плановая экономика ");
        Employee employee2 = new Employee(8, "Иванов", 34, 4200, " Внешней политики ");
        System.out.println("Юрист из департамента " + employee1.departament + " - " + employee1.surname + ": ID = " + employee1.id + ", " + " зарплата = " + employee1.salary + " $");
        System.out.println("Произошло повышение заработной платы в 2 раза, теперь его зарплата = " + employee1.povyshenyeZP(employee1.salary) + " $");
        System.out.println();
        System.out.println("Юрист из департамента " + employee2.departament + " - " + employee2.surname + ": ID = " + employee2.id + ", " + " зарплата = " + employee2.salary + " $");
        System.out.println("Произошло повышение заработной платы в 2 раза, теперь его зарплата = " + employee1.povyshenyeZP(employee2.salary) + " $");

    }
}
