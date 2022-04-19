/* 
   Пересоздайте класс Employee таким  образом, чтобы  переменная salary была   недоступна
   вне класса, переменная surname  была доступна отовсюду, а переменная id  только внутри
   пакета. Также  создайте 3 public метода, которые будут показывать на  дисплее значения
   этих переменных. Создайте для данного класса 3 разных конструктора с public, default и 
   private access modifier-ами. В  конструкторах  присваивайте переменным класса значения 
   из параметров. Создайте новые классы в том и другом пакете. Попытайтесь В них  создать 
   объекты  класса  Employee  и  вывести  на экран  значения переменных данного объекта с 
   помощью метода println и методов самого класса.
 */

package homeTaskLesson7;

public class Employee {

   public int id;
    public String surName;
    int age;
    private double salary;
    String department;

    public void showSalary (double salary1){
        salary = salary1;
        System.out.println("Значение переменной salary: " + salary);
    }

    public void showSurName (String surName1){
        surName = surName1;
        System.out.println("Значение переменной surName: " + surName);
    }
   
    public void showID (int id1){
        id = id1;
        System.out.println("Значение переменной ID: " + id);
    }

    public Employee(int id2, String surName2, double salary2){
        id = id2;
        surName = surName2;
        salary = salary2;
    }
    
        public Employee (int id2, String surName2, double salary2, int age){
        id = id2;
        surName = surName2;
        salary = salary2;
    }

    
}


