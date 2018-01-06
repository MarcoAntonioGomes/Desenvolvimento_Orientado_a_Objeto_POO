package Tipos_de_Cafe;


import Complementos.Beverage;


public class HouseBlend extends Beverage{

   
    
    public HouseBlend() {
        setDescription(" HouseBlend Coffee");
         this.quant_compl=0;
    }
    
     @Override
    public double cost() {
     return .89;    
    }
    
}
