
package Classes_Grasnar;

import Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Pato mudo");
    }
    
}
