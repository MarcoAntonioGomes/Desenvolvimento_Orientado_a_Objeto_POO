




package TiposDePatos;

import ClassesDeVoo.NaoVoar;
import Classes_Grasnar.Squeak;
import DuckSimulator.Duck;
import Interfaces.FlyBehavior;
import Interfaces.QuackBehavior;


public class Pato_borracha extends Duck{
 
    public Pato_borracha (){
       setVoo( new NaoVoar()); 
       setGrasnar(new Squeak());
    }
    
    public Pato_borracha(FlyBehavior fb, QuackBehavior qk){
        setGrasnar(qk);
        setVoo(fb);
    }
    
    @Override
    public  void display(){
        System.out.println(" Pato de borracha");
    }
  
    
}
