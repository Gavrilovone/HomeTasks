/*
   Создайте класс, в котором создайте метод abc. Инпут параметров данного метода
   будет N-ое количество параметров типа String. Метод должен возвращать уже
   отсортированный объект ArrayList из неповторяющихся объектов типа String, взятых 
   из параметра метода и выводить даннй объект на экран.
   Продемонстрируйте данный метод.
 */
package HomeTaskLesson20;

import java.util.*;
import java.util.Collections;

public class ArrayListSort {

    public static void abc(String... s) {

        ArrayList<String> list = new ArrayList<>();

        for (String s1 : s) {
            if (!(list.contains(s1))) {
                list.add(s1);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        abc("5", "3", "6", "8", "0", "5", "5", "6", "7", "10", "100"); // [0, 10, 3, 5, 6, 7, 8]
        abc("B", "N", "C", "B", "A", "A", "E", "Z", "M", "L", "V"); //    [A, B, C, E, L, M, N, V, Z] 
    }
}
