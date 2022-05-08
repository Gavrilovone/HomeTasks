/*
  Создайте класс, в котором создайте метод ravenstvo. Input параметрами которого будут 2 объекта
  класса StringBuilder. Метод должен иметь boolean return type, возвращать true если значения
  объектов совпадают и false если не опадают. продемонстрируйте даный метод.
 */
package HomeTaskLesson17;

public class Compare {

    boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean b1;
        String s1 = new String(sb1);
        String s2 = new String(sb2);

        b1 = s1.equals(s2);
        System.out.println(b1);
        return b1;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Привет");
        StringBuilder sb2 = new StringBuilder("Привет");
        Compare c1 = new Compare();

        c1.ravenstvo(sb1, sb2);
    }
}
