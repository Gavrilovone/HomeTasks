/* Создайте пакет р1, в нем класс А. В пакете р1 создайте подпакет р2, в нем
класс B c static элементами. В подпакете p2 создайте под пакет p3,  в нем
класс С. Создайте новый пакет р4, в нем класс D. В пакете р4 создайте
подпакет р5, в нем класс Е. Внутри класса D напишите код, который будет 
задействовать любые элементы классов A, C, Е, а так же static, элементы 
класса B. Используйте выражения import static, работайте с неполными именами.


*/

package p1;

public class A {
    public int a = 5;
}
