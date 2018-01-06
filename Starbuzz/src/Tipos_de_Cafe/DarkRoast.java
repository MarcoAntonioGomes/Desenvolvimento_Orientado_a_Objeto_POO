package Tipos_de_Cafe;


import Complementos.Beverage;


public class DarkRoast extends Beverage {
    
     @Override
    public double cost() {
         return 0.99;
    }

    public DarkRoast() {
   
        setDescription(" DarkRoast Coffee ");
        this.quant_compl=0;
    }
    
}
