/* В первом классе создайте static final переменную Пи = 3,14.
   Используйте данную константу  в non-static методе который 
   принимает в параметре значение радиуса и вычисляет площадь 
   круга по формуле: Площадь = Пи*радиус*радиус. Также используйте
   данную константу в static методе, который принимает в параметре
   значение радиуса и вычисляет длину окружности по формуле: 
   Площадь = 2*Пи*радиус. Создайте еще один non-static метод, который
   принимает в параметре значение радиуса и выводит на экран информацию
   о радиусе, площади круга и длине.
 
 */
package homeTaskLesson8_2;

public class AreaOfCircle {

    static  double p = 3.14;
    static int radius;

    void areaOfCircle(double radius) {
        double area = p * radius * radius;
        System.out.println("Площадь круга: " + area);
    }

    static void circumFerence(double radius) {
        double l = 2 * p * radius;
        System.out.println("Длина круга: " + l);
    }

    void showInfo(double radius) {
        System.out.println("Радиус: " + radius);
        areaOfCircle(radius);
        circumFerence(radius);
    }
    public static void main(String[] args) {
        AreaOfCircle ar1 = new AreaOfCircle();
        ar1.areaOfCircle(3);
        AreaOfCircle.circumFerence(5.5);
        ar1.showInfo(3);
        ar1.showInfo(p);
       
    }   
    
}
