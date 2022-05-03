/* В классе Month  создайте метод, у которого 1 параметр типа данных int.
   Этот параметр будет указывать порядковый номер месяца. Используя функционал
   switch, выведите на экран количество дней этого месяца для 2015 года.
   Проверьте работу данного метода в main*/
package HomeTaskLesson13_v2;

public class Month {

    public static void monthNumber(int month) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней");
                break;
            case 2:
                System.out.println("В феврале 28 дней ");
                break;
            default:
                System.out.println("Упс..Такого месяца нет..");

        }

    }

    public static void main(String[] args) {
        monthNumber(4);
        Month.monthNumber(7);
    }
}
