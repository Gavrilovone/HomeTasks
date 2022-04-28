package Home11;

public class Car {

    String color;
    String engine;
    int numberOfDoors;

    Car(String color, String engine, int numberOfDoors1) {
        this.color = color;
        this.engine = engine;
        numberOfDoors = numberOfDoors1;
    }

}

class CarTest {

    void changeNumberOfDoors(Car car, int numberOfDoors1) {
        car.numberOfDoors = numberOfDoors1;
        System.out.println("Количество дверей стало " + numberOfDoors1);
    }

    static void changeColor(Car c1, Car c2) {
        Car c3 = c1;
        c3.color = c1.color;
        c1.color = c2.color;
        c2.color = c3.color;

    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("Зеленый", "V8", 4);
        Car c2 = new Car("Красный", "V6", 5);
        Car c3 = new Car("Синий", "V12", 7);
        System.out.println("Цвет машины c1: " + c1.color);
        System.out.println("Двигатель c1: " + c1.engine);
        System.out.println("Количество дверей c1: " + c1.numberOfDoors);
        System.out.println("Цвет машины c2: " + c2.color);
        System.out.println("Двигатель c2: " + c2.engine);
        System.out.println("Количество дверей c2: " + c2.numberOfDoors);
        ct.changeNumberOfDoors(c1, 3);
        ct.changeNumberOfDoors(c2, 5);
        System.out.println("Количество дверей c1 после: " + c1.numberOfDoors);
        System.out.println("Количество дверей c2 после: " + c2.numberOfDoors);
        System.out.println("Цвет машины с1 " + c1.color);
        System.out.println("Цвет машины с2 " + c2.color);
        changeColor(c1, c2);
        System.out.println("Цвет машины с1 теперь :" + c1.color);
        System.out.println("Цвет машины с2 теперь :" + c2.color);

    }
}
