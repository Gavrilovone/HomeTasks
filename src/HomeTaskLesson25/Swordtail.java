
package HomeTaskLesson25;

import HomeTaskLesson24.*;


 class Swordtail extends Fish { // меченосец
    Swordtail(String name){
    super(name);
    this.name = name;
    }
    @Override
    void swim(){
        System.out.println("swordtail is a beautiful fish that swims fast");
    }
    @Override
    void eat(){
        System.out.println("the swordtail is not a predatory fish and it eats regular fish food");
    }
}
