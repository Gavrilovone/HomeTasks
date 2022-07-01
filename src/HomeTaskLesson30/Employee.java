package HomeTaskLesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {

    String name;
    String departament;
    int salary;

    Employee(String name, String departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }
}

class TestEmployee{
    void printEmployee(Employee emp){
        System.out.println("Имя работника: " + emp.name + " Департамент: " + emp.departament + " Зарплата : " + emp.salary);
    }
    
    void filtraciaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> t ){
        for(Employee e: aL){
            if(t.test(e)){
                printEmployee(e);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee("Иван", "ТЭК", 100);
        Employee e2 = new Employee("Алексей", "IT", 300);
        Employee e3 = new Employee("Екатерина", "Бухгалтерия", 450);
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        
        TestEmployee temp = new TestEmployee();
        
        temp.filtraciaRabotnikov(list, st -> st.departament == "IT" && st.salary > 200);
        temp.filtraciaRabotnikov(list, st -> st.name.startsWith("Е") && st.salary != 450 );
        temp.filtraciaRabotnikov(list, st -> st.name == st.departament);
    }
    
    
}
