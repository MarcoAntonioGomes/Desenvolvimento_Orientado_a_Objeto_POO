
public class Numero {
  private int numero;
  boolean confirma = false;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void verificaMaiorQueUm(int numero) throws maiorQueUmException{
        if((numero > 1) && (numero <= 2147483647)){
            this.confirma = true;
        }
        else
        {
            throw new maiorQueUmException();
        }
    }
    public String verifcaSeEPrimo(){
        if(this.numero %2 !=0){
            return ("É um número primo!");
        }
        return ("NÃO é um número primo!");
    }
    
}
