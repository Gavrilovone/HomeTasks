
package HomeTaskLesson27;


public class Lesson27 {
    
}

class NoMeatException extends RuntimeException{
    NoMeatException(String msg){
        super(msg);
    }
    
}

class NoWaterException extends Exception{
    NoWaterException(String msg){
        super(msg);
    }
    
    public static void main(String[] args) throws NoWaterException {
        Tiger t = new Tiger();
        t.eat("meat");
        try{
            t.drink("water");
            try{
                t.drink("beer");
            }
            catch(NoWaterException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("This is inner finnaly block");
            }
        }
        /**
         * тут важна последовательность, потому, что RuntimeException является child классом Exception, если их поменять местами, то будет ошибка компиляции
         */
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
      
        
        /**
         * Tiger eats myaso
           Tiger drink water
           Tiger does't drink : beer
           This is inner finnaly block
         */
    }
}
