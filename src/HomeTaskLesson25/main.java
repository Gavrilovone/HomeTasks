package HomeTaskLesson25;

import HomeTaskLesson24.*;

public class main {

    public static void main(String[] args) {
        Animal a1 = new Lev("Simba1");
        Animal a2 = new Penguin("Pororo1");
        Animal a3 = new Swordtail("Micho");
        Bird b1 = new Penguin("Pororo2");
        Fish f1 = new Swordtail("Micho2");
        Mammal m1 = new Lev("Simba2");
        Penguin p1 = new Penguin("Pororo3");
        Swordtail s1 = new Swordtail("Micho3");
        Lev l1 = new Lev("Simba3");
        Speakable sp1 = new Lev("Simba4");
        Speakable sp2 = new Penguin("Pororo4");
        Animal[] array1 = {a1, a2, a3, b1, f1, m1, p1, s1, l1};
        Speakable[] array2 ={sp1, sp2};
        for(Animal an: array1){
            if(an instanceof Lev){
                Lev l = (Lev)an;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
                
            } else if (an instanceof Penguin){
                Penguin p = (Penguin)an;
                System.out.println(((Penguin) an).name);
                p.eat();                                                                                                                                                                                                                                                                                                                                
                p.fly();
                p.sleep();
                p.speak();
            } else if (an instanceof Swordtail){
                Swordtail s = (Swordtail)an;
                System.out.println(s.name);
                s.eat();
                s.sleep();
                s.swim();
            }
            System.out.println("--------------------------");
            
        }
        
        for(Speakable sp: array2){
            if(sp instanceof Lev){
                 Lev l = (Lev)sp;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
                
            } else if(sp instanceof Penguin){
                Penguin p = (Penguin)sp;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            }
                
        }
        

    }
}
