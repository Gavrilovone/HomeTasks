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
    static final double p =3.14;  
    
    void areaOfCircle (double r){
        double area = p*r*r;
        
    }    
    static void circumFerence(double r){
        double l = 2*p*r;
        
    }  
    
    void showInfo(double r){
        System.out.println();
    }
    
}
