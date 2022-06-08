package HomeTaskLesson25;

import HomeTaskLesson24.*;

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }
    @Override
    void eat(){
        System.out.println("lion like any predator loves meat");
    }
    @Override
    void sleep(){
        System.out.println("most of the day the lion sleeps");
    }
     @Override
    void run(){
        System.out.println("the lion is not the fastest cat");
    }

}
