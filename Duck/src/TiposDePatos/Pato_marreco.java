
package TiposDePatos;

import ClassesDeVoo.Voocomasas;
import Classes_Grasnar.Quack;
import DuckSimulator.Duck;
import Interfaces.FlyBehavior;
import Interfaces.QuackBehavior;


public class Pato_marreco extends Duck{

     public Pato_marreco (){
       setVoo( new Voocomasas()); 
       setGrasnar(new Quack());
    }
    
     public Pato_marreco(FlyBehavior fb, QuackBehavior qk){
         setGrasnar(qk);
         setVoo(fb);
     }
     
    @Override
    public  void display(){
        System.out.println("Pato marreco"); 
    }
    
}
