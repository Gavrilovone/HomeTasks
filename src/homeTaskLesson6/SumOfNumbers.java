/*
  Создайте класс, в котором  будут 5 overloaded методов,
  которые вычисляют сумму нуля, одного, двух, трех и четырех
целых чисел соответственно, передают эту сумму в output и выводят
её на экран. В случае когда слагамые отсутствуют(т.е. когда параметров нет)
сумма путь равняется 0.
 */
package homeTaskLesson6;

public class SumOfNumbers {
    int a;
    int b;
    int c;
    int d;
    int sum;
    
    public void sumNumbers(int a4, int b4, int c4, int d4){
    a = a4;
    b = b4;
    c = c4;
    d = d4;
    sum = a+b+c+d;
    System.out.println("Сумма чисел = " + sum);
            
    }
    
    public void sumNumbers(int a3, int b3, int c3){
    this.sumNumbers(a3, b3, c3, 0);
    }
    
    public void sumNumbers(int a2, int b2 ){
    this.sumNumbers(a2, b2, 0, 0);
    }
    
    public void sumNumbers(int a1){
    this.sumNumbers(a1, 0, 0, 0);
    }
    public void sumNumbers(){
    this.sumNumbers(0, 0, 0, 0);
    }
}
