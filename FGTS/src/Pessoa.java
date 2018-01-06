
import static javax.management.Query.lt;


public class Pessoa {
    private String nome;
    private double salario;
    boolean verifica = false;
    boolean verifica2 = false;
    boolean verifica3 = false;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void verificaTamanhoNome(String nome)throws TamanhoDoNomeException{
       if((nome.length()>=5) && (nome.length()<=50)){
           verifica = true;
       }
       else{
       throw new TamanhoDoNomeException();
       }
    }
    
  public void containsOnlyNumbers(String nome) throws NumerosNoNomeException{
	int cont=0;  
       for (char letra : nome.toCharArray()){      
            if(Character.isDigit(letra)){ 
              throw new NumerosNoNomeException();
            }
            else{
                cont++;
            }
            
	  }
         if(cont==nome.length()){
             verifica2 = true;
         } 
               
}
  
  public void verificaSalario(double salario) throws SalarioMinimoException{
      if (salario >= 800.00) {
          verifica3 = true;
      }
      else{
          throw new SalarioMinimoException();
      }
  }
  public double calculaFGTS(){
      return this.salario*(8.0/100.0);
  }
}