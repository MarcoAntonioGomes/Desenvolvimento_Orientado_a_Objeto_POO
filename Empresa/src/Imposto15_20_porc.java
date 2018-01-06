
public class Imposto15_20_porc implements Imposto{

    public double calcularImposto(Cargo Func) {
       
        if(Func.salario > 2000){
            return Func.salario*(20.00/100.00);
        }
        
            return Func.salario*(15.00/100.00);
             
    }
    
   }

   

