/* В классе Month  создайте метод, у которого 1 параметр типа данных int.
   Этот параметр будет указывать порядковый номер месяца. Используя функционал
   switch, выведите на экран количество дней этого месяца для 2015 года.
   Проверьте работу данного метода в main*/
package HomeTaskLesson13;

public class Month {

   

    public static void monthNumber(int month) {
        

        switch (month) {
            case 1:
                System.out.println("В январе 31 день ");
                break;
            case 2:
                System.out.println("В феврале 28 дней ");
                break;
                 case 3: 
                System.out.println("В марте 31 день ");
                break;
                 case 4: 
                System.out.println("В апреле 30 день ");
                break;
                 case 5: 
                System.out.println("В мае 31 день ");
                break;
                 case 6: 
                System.out.println("В июне 30 день ");
                break;
                 case 7: 
                System.out.println("В июле 31 день ");
                break;
                 case 8: 
                System.out.println("В январе 31 день ");
                break;
                 case 9: 
                System.out.println("В сентябре 30 день ");
                break;
                 case 10: 
                System.out.println("В октябре 31 день ");
                break;
                 case 11: 
                System.out.println("В ноябре 30 день ");
                break;
                 case 12: 
                System.out.println("В декабре 31 день ");
                break;
                 default: 
                     System.out.println("Упс..Такого месяца нет..");

        }

    }
    
    
    public static void main(String[] args) {
        monthNumber(5);
        Month.monthNumber(0);
    }
}
