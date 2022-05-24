/*
Создайте класс Animal. при вызове его конструктора пусть на экран выводится "I am animal". 
В классе пусть будут пременная eyes, характеризующая колличество глаз; методы eat (выводящий на экран "Animal eats") и drink 
(выводящий на экран "Animal drinks").
Создайте класс Pet, который является child классом класса Animal. При вызове его конструктора пусть на экран выводится
"I am pet" и переменной eyes придается значение 2. В классе пусть будут переменные name; tail, характеризующая количество
хвостов и равная 1; paw, характеризующая количество лап и равная 4; методы run(выводящий на экран "Pet runs") и jump
(выводящий на экран "Pet jumps").
Создайте класс Dog, который  является child классом класса Pet. При вызове его конструктора с параметром который будет 
передавать имя, пусть на экран выводится "I am dog and my name is: " + имя питомца. В класс добавьте метод play(выводящий 
на экран "Dog plays") Создайте класс Cat, который является child классом класса Pet. При вызове его конструктора с параметром, 
который будет передавать имя, пусть на экран выводится "I am cat and my name is: " + имя питомца.  В класс добавьте метод sleep 
(выводящий на экран "Cat sleeps").
Создайте класс Test, в методе main выведите на экран количество лап объекта класса Dog и вызовите метод sleep объекта  класса Cat.
 */
package HomeTaskLesson22;

public class Animal {

    int eyes;

    Animal() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }

}

class Pet extends Animal {

    String name;
    int tail = 1;
    int paw = 4;

    Pet() {
        System.out.println("I am Pet");
        eyes = 2;
    }

    public void run() {
        System.out.println("Animal runs");
    }

    public void jump() {
        System.out.println("Animal jumpss");
    }
}

class Dog extends Pet {

    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    }
    
    public void play(){
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {

    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    }
    
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
