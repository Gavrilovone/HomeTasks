/* 
  Переписать домашнее задание из Урока 14 так, чтобы outer и inner  циклы представляли
  собой while loop, a miiddle цикл представлял собой do while loop.
 */
package HomeTaskLesson15;

public class Time {

    public static void time() {
        int chas = 0;

        OUTER:
        while (chas < 6) {
            int minuta = 0;
            MIDDLE:
            do {
                
                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                
                int secunda = 0;
                INNER:
                while (secunda < 60) {
                    
                    System.out.println(chas + ":" + minuta + ":" + secunda);
                   if (secunda * chas > minuta) {
                        continue MIDDLE;
                    }
                    secunda++;
                }
             minuta++;   

            } while (minuta < 60);

            chas++;
        }

    }

    public static void main(String[] args) {
        time();
    }
}
