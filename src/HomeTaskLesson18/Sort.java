/*
  Создайте класс, в котором создайте метод sortirovka. Инпут параметром
  данного метода будет одномерный массив типа int. Метод должен возвращать 
  уже отсортированный по возрастанию массив. Продемонстрируйте данный метод.

  (Подсказка: есть неколько способов сортировки массива, один из самых легких это сначала находим минимальный элемент массива и меняем его метами с нулевым элементом, затем начиная с первого элемента массива мы находим минимальный элемент массива и меняем его местами уже с первым элементом и так далее мы проделываем это столько раз сколько нужно, в зависимости от длины массива т.у используем 2 nested for)
 */
package HomeTaskLesson18;

import java.util.Arrays;

public class Sort {

    public static void sortirovka(int array[]) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int index = i; 
            int min = array[i]; 

            for (int j = i+1; j < array.length; j++) {
                if(array[j] < min){
                    min = array[j];
                    index = j; 
                }
            }
            
            if(i !=index){
            a = array[i];
            array[i] = min;
            array[index] = a;
            
            
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 8, -1, 6};
        sortirovka(array); // [-1, 8, 2, 6]

    }
}
