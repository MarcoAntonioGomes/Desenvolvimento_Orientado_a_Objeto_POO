
package ClassesDeVoo;

import Interfaces.FlyBehavior;


public class NaoVoar implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println(" Este pato Não voa...");
    }
    
}
