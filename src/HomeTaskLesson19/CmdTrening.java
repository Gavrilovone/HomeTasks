/*
   Создайте метод abc, инпут параметра которого - N-ое количество массивов типа String.
   В методе создайте новый массив, который будет состоять из элементов массивов-параметров
   и будет оутпутом данного метода(т.е внутри метода abc создаем массив который будет содержать
   в себе все элементы всех массивов, которые будут являться аргументом этого метода abc). В методе
   main Вызовите метод abc и его элементам, которые равны значениям command line параметров, присвойте
   значение null. Выведите элементы обновленного массива на экран. Везде где возможно, используйте foreach
   loop. Запустите приложение с командной строки. 
 */
package HomeTaskLesson19;

public class CmdTrening {

    public static String[] abc(String[]... array) { // array двумерный массив
        int length = 0;
        for (String[] array1 : array) {
            length += array1.length; // сумма длин всех одномерных массивов которые мы будем импользовать в парамептре метода abc
        }
        String[] target = new String[length]; // одномерный массив
        int count = 0; // индекс массива target
        // выводим элементы двумерного массива на экран с помощью nested foreach loop
        for (String[] array1 : array) { //элементом двумерного массива array является одномерный массив array1 
            for (String s : array1) { // элементом одномерного массива arra1 является String s
                target[count] = s;// тут мы не вводим на экран, а присваиваем каждому элементу массива target определенное значение = s
                count++;
            }

        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"Привет", "Пока", "Ок"}, new String[]{"Hello", "Bye", "ok"});
        // target является оутпутом метода abc в котором задействованы 2 одномерных массива

        // далее сравниваем элементы массива target и command line параметров args
        for (int i = 0; i < target.length; i++) {
            for (String s : args) {
                if (s.equals(target[i])) {
                    target[i] = null;

                }

            }

        }
        // тут мы просто выводим на экран значение массива target
        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
}
