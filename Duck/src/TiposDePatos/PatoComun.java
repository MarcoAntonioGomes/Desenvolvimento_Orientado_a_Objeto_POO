
package TiposDePatos;

import ClassesDeVoo.Voocomasas;
import Classes_Grasnar.Quack;
import DuckSimulator.Duck;
import Interfaces.FlyBehavior;
import Interfaces.QuackBehavior;


public class PatoComun extends Duck{
    public PatoComun (){
       setVoo( new Voocomasas()); 
       setGrasnar(new Quack());
    }
     public PatoComun(FlyBehavior fb, QuackBehavior qk){
      setVoo(fb);
      setGrasnar(qk);
     }
      
    
    @Override
    public  void display(){
        System.out.println("Pato comun");
    }
}
