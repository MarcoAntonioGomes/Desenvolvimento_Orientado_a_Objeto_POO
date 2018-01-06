package Tipos_de_Cafe;


import Complementos.Beverage;


public class Espresso extends Beverage{
  

    public Espresso() {
        setDescription(" Expresso Coffee");
         this.quant_compl=0;
    }

    
    
    
     @Override
    public double cost() {
         return 1.99;
    }
    
}
