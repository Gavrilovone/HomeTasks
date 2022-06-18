package HomeTaskLesson27;

public class Tiger {

    public void eat(String s) {
        if (!s.equals("meat")) {
            throw new NoMeatException("Tiger does't eat : " + s);
        } 
            System.out.println("Tiger eats myaso");
        
    }
    
   public void drink(String s) throws NoWaterException {
        if (!s.equals("water")) {
            throw new NoWaterException("Tiger does't drink : " + s);
        } 
            System.out.println("Tiger drink " + s);
        
    }
}
