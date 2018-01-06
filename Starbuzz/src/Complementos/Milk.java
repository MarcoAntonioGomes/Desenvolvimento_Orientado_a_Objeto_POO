package Complementos;


public class Milk extends CondimentDecorator{
public Beverage beverage;

    public Beverage getBeverage() {
        return beverage;
    }

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.beverage.incrementar_compl();
        
    }
    
   public String getDescription() {
        return getBeverage().getDescription()+", Milk ";
    }

    public double cost() {
        return .10+ getBeverage().cost();
    }
    
    
    
}
