package Complementos;


public class Soy extends CondimentDecorator{
      public Beverage beverage;

    public Beverage getBeverage() {
        return beverage;
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
         this.beverage.incrementar_compl();
        
    }
    
   public String getDescription() {
        return getBeverage().getDescription()+", Soja";
    }

    public double cost() {
        return .15+ getBeverage().cost();
    }
}
