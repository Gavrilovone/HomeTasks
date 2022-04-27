package HomeTaskLesson11;

public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car("Зеленый", "V8", 4);
        Car c2 = new Car("Красный", "V6", 5);
        System.out.println("Цвет машины: " + c1.color);
        System.out.println("Двигатель: " + c1.engine);
        System.out.println("Количество дверей: " + c1.numberOfDoors);
        c1.changeNumberOfDoors(3);
        System.out.println(c1.numberOfDoors);
        System.out.println("Цвет машины с1 " + c1.color);
        System.out.println("Цвет машины с2 " + c2.color);
        Car.changeColor(c1, c2);
        System.out.println("Цвет машины с1 теперь :" + c1.color);
        System.out.println("Цвет машины с2 теперь :" + c2.color);

    }
}
