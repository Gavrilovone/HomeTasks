/* Создайте класс Car с тремя переменными: цвет, мотор и количество дверей.
Затем создайте класс CarTest, в котором должны быть 2 метода. 1-ый изменяет 
количество дверей объекта Car на число прописанное в параметре метода. 2-ой
принимает в параметры 2 объекта Car и меняет их цвета местами. Примените оба
метода в main и вывведите на экран атрибуты всех объектов. 

 */
package HomeTaskLesson11;

public class Car {

    String color;
    String engine;
    int numberOfDoors;

    Car(String color, String engine, int numberOfDoors1) {
        this.color = color;
        this.engine = engine;
        numberOfDoors = numberOfDoors1;

    }

    void changeNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        System.out.println("Количество дверей стало " + numberOfDoors);
    }

    static void changeColor(Car c1, Car c2) {
        Car c3 = new Car(c1.color, c1.engine, c1.numberOfDoors);
        c3.color = c1.color;
        c1.color = c2.color;
        c2.color = c3.color;

    }
}
