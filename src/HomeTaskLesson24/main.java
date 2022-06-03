
package HomeTaskLesson24;


public class main {
    public static void main(String[] args) {
        Swordtail swordtail = new Swordtail("Mich");
        System.out.println(swordtail.name);
        swordtail.eat();
        swordtail.sleep();
        swordtail.swim();
        Speakable sp = new Penguin("Pororo");
        sp.speak();
        Animal a = new Lev("Sherhan");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal m = new Lev("Simba");
        System.out.println(m.name);
        m.eat();
        m.run();
        m.sleep();
        m.speak();
                
        
    }
}
