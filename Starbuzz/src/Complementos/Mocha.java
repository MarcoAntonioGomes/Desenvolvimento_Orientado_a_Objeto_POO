package Complementos;


public class Mocha extends CondimentDecorator{
    public Beverage beverage;

    public Beverage getBeverage() {
        return beverage;
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
         this.beverage.incrementar_compl();
    }
    
   public String getDescription() {
        return getBeverage().getDescription()+", Moca ";
    }

    public double cost() {
        return .20+ getBeverage().cost();
    }
}
