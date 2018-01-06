
package DuckSimulator;

import Interfaces.FlyBehavior;
import Interfaces.QuackBehavior;


public abstract  class Duck {

    private FlyBehavior Voo; 
    private QuackBehavior Grasnar;
    
    
    
    public void swim(){
        System.out.println("Pato com Nado");
    }

    public FlyBehavior getVoo() {
        return Voo;
    }

    public void setVoo(FlyBehavior Voo) {
        this.Voo = Voo;
    }

    public QuackBehavior getGrasnar() {
        return Grasnar;
    }

    public void setGrasnar(QuackBehavior Grasnar) {
        this.Grasnar = Grasnar;
    }
    
    public void performQuack(){
        this.Grasnar.quack();
    }
    public void performFly(){
        this.Voo.fly();
    }
    
    public abstract void display();
}
