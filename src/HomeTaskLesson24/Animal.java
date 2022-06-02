/**
 * Создайте абстрактный класс Аnimal, его конструктор пусть имеет параметр, значение которого 
назначается переменной String name.Cоздайте абстрактные методы еаt и slеер. 
Создайте абстрактный класс Fish, который является дочерним классом класса Аnimal, его конструктор 
пусть имеет параметр, значение которого назначается переменным name данного и родительского 
класса. В классе Fish перезапишите метод slеер так, чтобы он выводил на экран "Всегда интересно 
наблюдать как спят рыбы", Также здесь создайте абстрактный метод swim. 
Создайте абстрактный класс Вird, который является дочерним классом класса Animal, его конструктор 
пусть имеет параметр, значение которого назначается переменным name данного и родительского 
класса. Также здесь создайте абстрактный метод fly. 
Создайте абстрактный класс Маmmal, который является дочерним классом класса Animal, его 
конструктор пусть имеет параметр, значение которого назначается переменным name данного и 
родительского класса. Также здесь создайте абстрактный метод run. 
Создайте интерфейс Speakable, в котором пусть будет дефолтный метод speak, который выводит на 
экран "Some body speaks". Пусть класс Маmmal имплементирует этот интерфейс. Также пусть класс Вird 
имплементирует этот интерфейс и перезаписывает его метод так, чтоб он выводил на экран имя + "sings". 
Создайте класс Меchenosec, который является дочерним классом класса Fish, его конструктор пусть 
имеет параметр, значение которого назначается переменным name данного и родительского класса. В 
классе Меchenosec перезапишите метод swim так, чтобы он выводил на экран "Меченосец красивая рыба
которая быстро плавает". Также перезапишите метод eat так, чтобы он выводил на экран 
"Меченосец не хищная рыба и она ест обычный рыбий корм!".
 */
package HomeTaskLesson24;

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



