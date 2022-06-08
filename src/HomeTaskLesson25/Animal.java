/**
 * Переименуйте класс Lesson24 из последнего домашнего задания в lesson25 измените его метод main следующим образом
 * Создайте в нем 2 массива типа Speakable и тип Animal, которые будут содержать все возможные ссылочные переменные, 
 * ссылающиеся на все возможные объекты.Используя if и istanceof проверяйте на какой объект ссылается переменная и 
 * выводите на экран соотетствующие переменные данного объекта и вызывайте его методы
 */
package HomeTaskLesson25;
import HomeTaskLesson24.*;

abstract public class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }
    
    abstract void eat();
    abstract void sleep();
 }

 interface Speakable{
        default void speak(){
            System.out.println("Som body speak");
        }
    }




