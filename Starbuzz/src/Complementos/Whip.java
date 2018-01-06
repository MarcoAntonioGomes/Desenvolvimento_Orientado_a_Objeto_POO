package Complementos;


public class Whip extends CondimentDecorator{
      public Beverage beverage;

    public Beverage getBeverage() {
        return beverage;
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
         this.beverage.incrementar_compl();
         
    }
    
   public String getDescription() {
        return getBeverage().getDescription()+", Creme";
    }

    public double cost() {
        return .10+ getBeverage().cost();
    }
    
}
