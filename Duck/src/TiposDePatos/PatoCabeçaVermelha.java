
package TiposDePatos;

import ClassesDeVoo.Voocomasas;
import Classes_Grasnar.Quack;
import DuckSimulator.Duck;
import Interfaces.FlyBehavior;
import Interfaces.QuackBehavior;


public class PatoCabeçaVermelha extends Duck {
  
    
      public PatoCabeçaVermelha (){
       setVoo( new Voocomasas()); 
       setGrasnar(new Quack());
    }
     public PatoCabeçaVermelha(FlyBehavior fb, QuackBehavior qk){
      setVoo(fb);
      setGrasnar(qk);
     }
      
    
    @Override
    public  void display(){
        System.out.println("Pato de cabeça vermelha");
    }
}
