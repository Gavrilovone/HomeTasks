/*
   В первом классе создайте 2 static метода. 1й пусть умножает 3 числа из 
   параметров метода и возвращает их произведение; 2й - делит первое число
   из параметра на второе и ничего не возвращает, лишь выводит на дисплей в
   читабельном виде целое частное и остаток. Во втором классе по 2 раза 
   используйте данные методы
 
 */
package homeTaskLesson8_1;

public class MathOperations {

    static int umnogenye(int a, int b, int c) {
        int result = a * b * c;
        return result;
       
    }

    static void delenye(int a, int b) {
        int result1 = a / b;
        int result2 = a & b;
        System.out.println("Результат деления " + a + " / " + b + " : " + "целое число: " + result1 + " Остаток: " + result2);
    }
  
       
    
}

