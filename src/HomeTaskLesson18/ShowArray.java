/*
   Создайте класс, в котором создайте метод showArray. инпут параметром 
   данного метода будет двумерный массив типа String. Метод должен выводить 
   на экран данный массив в следующем виде:

   {{элемент00, элемент01},{элемент10},{элемент10,элемент11}} 

   Содержимое естественно будет зависеть от Вашего массива. продемонстрируйте даный метод.
 */
package HomeTaskLesson18;

public class ShowArray {

    public static void showArrays(String[][] array) {

        System.out.print("{{" + array[0][0] + ", " + array[0][1] + "},{" + array[1][0] + "},{" + array[2][0] + ", " + array[2][1] + "}}");
        System.out.println("");
    }

    public static void main(String[] args) {
        String[][] array = new String[][]{{"Алексей", "Иван"}, {"Петр"}, {"Петр", "Андрей"}};

        showArrays(array);
    }
}
