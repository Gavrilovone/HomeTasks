
package HomeTaskLesson24;


public class Penguin extends Bird {
    Penguin(String name){
    super.name = name;
    }
     @Override
    void eat(){
        System.out.println("penguin loves to eat fish");
    }
    @Override
    void sleep(){
        System.out.println("penguin loves to eat fish");
    }
    @Override
    void fly(){
        System.out.println("penguins can't fly");
    }
    @Override
    public void speak(){
            System.out.println("penguins can't sing like nightingales");
        }
}
