package Tipos_de_Cafe;


import Complementos.Beverage;


public class Decaf extends Beverage{
  
   

    public Decaf() {
        setDescription(" Decaf Coffee");
         this.quant_compl=0;
    }

    
    @Override
    public double cost() {
        
       return 1.05;  
    }
    
}
