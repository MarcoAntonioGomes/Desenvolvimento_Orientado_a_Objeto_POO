

public class Imposto10_15_porc implements Imposto {
   
   
    
    @Override
    public double calcularImposto(Cargo Func) {
       
        if(Func.getSalario() > 2000){
            return Func.getSalario()*(15.00/100.00);
        }
        
            return Func.getSalario()*(10.00/100.00);
             
    }
    
}
