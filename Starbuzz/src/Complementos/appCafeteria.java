package Complementos;

import Tipos_de_Cafe.DarkRoast;
import Tipos_de_Cafe.Decaf;
import Tipos_de_Cafe.Espresso;

public class appCafeteria {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " R$ " + beverage.cost());

        Beverage beverage2 = new Decaf();
        beverage2 = new Milk(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.printf(beverage2.getDescription() + ", Custo Total R$  " + "%.2f\n", beverage2.cost());
        System.out.printf(" Café com desconto por  "+beverage2.getQuant_compl()+" acrescimos: R$ "+"%.2f\n",beverage2.calculaDesconto());
        
        Beverage beverage3 = new DarkRoast();
        beverage3 = new Milk(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
       

        System.out.printf(beverage3.getDescription() + ", Custo Total R$  " + "%.2f\n", beverage3.cost());
        System.out.printf(" Café com desconto por  "+beverage2.getQuant_compl()+" acrescimos: R$ "+"%.2f\n",beverage2.calculaDesconto());
        
    }

}
