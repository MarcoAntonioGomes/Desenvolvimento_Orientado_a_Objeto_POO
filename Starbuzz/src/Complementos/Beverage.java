package Complementos;


public abstract class Beverage {
    public String description;
    
  public static int quant_compl=0;

    public  int getQuant_compl() {
        return quant_compl;
    }

   
    
   


    
    public void setDescription(String description) {
        this.description = description;
    }
    
   
    public String getDescription() {
        return description;
    }
    public abstract double cost();

   public void incrementar_compl() {
        ++quant_compl;
    }
   
   public double calculaDesconto(){
       if(getQuant_compl()==2){
           return cost()*.75;
       }
       if(getQuant_compl()==3){
           return cost()*.6;
       }
       if(getQuant_compl()>3){
          return cost()*.5; 
       }
       
          return 0; 
       
       
   }
}
