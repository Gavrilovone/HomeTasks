
package p4;
import p1.*;
import p1.p2.p3.*;
import p4.p5.*;
import static p1.p2.B.*;


public class D {
    
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println("Переменная из класса пакета p1, класса А - " + a1.a);
        C c1 = new C();
        System.out.println("Переменная из подпакета р3 подпакета р2 пакета р1 - " + c1.c);
        E e1 = new E();
        System.out.println("Переменная из подпакета р5 пакета р4 - " + e1.e);
        methodB();
        
    }
}
