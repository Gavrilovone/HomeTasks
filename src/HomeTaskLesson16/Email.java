/*
    Создайте класс, в котором создайте метода email. Данный метод должен приимать  в  инпут  1 String параметр.
    Данный параметр должен содержать в себе email-ы в следующем виде: ya@yahoo.com; on@mail.ru; ona@gmail.com;
    т.е. После каждого email должен стоять знак припинания ";". Ваш метод должен выводить на экран информацию
    о том, какой почтой пользуются, исходя из параметра, т.е. оутпут должен быть следующего вида:
    yahoo
    mail
    gmail
    продемонстрируйте данный метод.

 */
package HomeTaskLesson16;

public class Email {

    public void email(String e1) {
        int a = 0; // позиция "@"
        int b = 0; // позиция "."
        int с = 0; // позиция ";"

        System.out.println("Пользователь использует: ");

        while (с < e1.length() - 1) {
            a = e1.indexOf("@", с);
            b = e1.indexOf(".", с);
            с = e1.indexOf(";", с + 1);
            System.out.println(e1.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Email e = new Email();
        e.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
