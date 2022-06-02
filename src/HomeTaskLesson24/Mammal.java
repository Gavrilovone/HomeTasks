
package HomeTaskLesson24;


abstract class Mammal extends Animal implements Speakable {
    Mammal(String name){
    super.name = name;
    }
    abstract void run();
    
    
   
}
