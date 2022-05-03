/*
  Создать класс. В классе создать статичный метод, который будет выводить на экран время
  в формате "Час:минута:секунда" в интервале от 0 до 6 часов. Если час больше единицы и 
  минута кратна 10, то метод нужно закончить. Если же (секунда умноженная на час) больше
  минуты, то пора переходить на следующую минуту. Продемонстрировать данный методе в действии
 */
package HomeTaskLesson14;

public class Time {

    public static void time() {
        OUTER:
        for (int chas = 0; chas < 6; chas++) {
            MIDDLE:
            for (int minuta = 0; minuta <= 59; minuta++) {
                if (chas > 1 && minuta % 10 == 0) {
                    break;
                }
                INNER:
                for (int secunda = 0; secunda <= 59; secunda++) {
                    System.out.println(chas + ":" + minuta + ":" + secunda);

                    if (secunda * chas > minuta) {
                        continue MIDDLE;
                    }
                }

            }
        }

    }

    public static void main(String[] args) {
        time();
    }
}
