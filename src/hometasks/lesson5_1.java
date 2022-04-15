/* В класс BankAccount добавьте 2 метода. Первый метод называется popolnenieScheta
 и увеличивает баланс на сумму, которая указана в параметре этого метода. Второй
метод называется snyatieSoScheta и уменьшает баланс на сумму, которая указана в 
параметре этого метода
 */
package hometasks;

public class lesson5_1 {

}

class BankAccount {

    double popolnenyeScheta(double i) {
        double result;
        result = balance + i;
        return result;

    }

    double snyatyeScheta(double i) {
        double result;
        result = balance - i;
        return result;

    }

    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount(); // первый BankAccount это тип данных(тоесть объект BankAccount, а второй BankAccount это вызов конструктора BankAccount()
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Alexey";
        MyAccount.balance = 100;

        YourAccount.id = 2;
        YourAccount.name = "Sergey";
        YourAccount.balance = 150;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 130;

        System.out.println("счет пополнился, был: " + MyAccount.balance + " Стал: " + MyAccount.popolnenyeScheta(17.5));
        System.out.println("счет убавился, был: " + MyAccount.balance + " Стал: " + MyAccount.snyatyeScheta(16.2));

    }
}
