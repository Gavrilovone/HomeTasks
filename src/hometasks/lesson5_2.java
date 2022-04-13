/* Измените класс Student (из домашнего задания hometasks.lesson4) так,
чтобы среднюю арифмитическую оценку студента выводил на экран метод. Т.е.
создайте 1 метод, параметр которого - это объект класса Student, а в теле
метода будет вычисляться средняя арифметическая оценка и выводиться на экран.


*/
package hometasks;


public class lesson5_2 {
    
}


class Student {
    
       
        int studentNumder;
        String name;
        String surName;
        int yearOfStudy;
        int mathAverage;
        int economicsAverage;
        int languadgeAverage;
        int resultAverage;
        
        int sredneeAryfmetycheskoe(Student student){
        this.resultAverage = (mathAverage+economicsAverage+languadgeAverage)/3;
        return resultAverage;
            }
 }
        class StudentTest {
        int mathAverage;
        int economicsAverage;
        int languadgeAverage;
        int resultAverage;
            
        
               
        public static void main(String[] args) {

        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();
        
        Student1.languadgeAverage = 9;
        Student1.mathAverage = 8;
        Student1.economicsAverage =5;
        Student1.name = "Alexey";
        Student1.surName ="Gavrilov";
        
        Student2.languadgeAverage = 5;
        Student2.mathAverage = 3;
        Student2.economicsAverage =5;
        Student2.name = "Ivan";
        Student2.surName ="Petrov";
                     
                       
        Student3.languadgeAverage = 4;
        Student3.mathAverage = 4;
        Student3.economicsAverage =4;
        Student3.name = "Sergey";
        Student3.surName = "Gavrilov";
                     
        
                 System.out.println("Средняя оценка студента  "+Student1.name +" "+ Student1.surName +" = " + Student1.sredneeAryfmetycheskoe(Student1));
                 System.out.println("Средняя оценка студента  "+Student2.name +" "+ Student2.surName +" = " + Student2.sredneeAryfmetycheskoe(Student2));
                 System.out.println("Средняя оценка студента  "+Student3.name +" "+Student3.surName +" = " + Student3.sredneeAryfmetycheskoe(Student2));
         }
}
        