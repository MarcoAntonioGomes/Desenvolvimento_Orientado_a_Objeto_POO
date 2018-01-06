
public class NumeroPerfeito {
private int n;
private boolean verifica = false;

    public NumeroPerfeito(int n) {
        this.n = n;
}

    public NumeroPerfeito() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean isVerifica() {
        return verifica;
    }

    public void setVerifica(boolean verifica) {
        this.verifica = verifica;
    }

    
public void verificaNum(int n) throws NumeroInvalidoException{
     if((n > 0)&&(n < 32767)){
           setVerifica(true);
       }
     else{
          throw new NumeroInvalidoException();
     }
}
public boolean verificaNumeroPerfeito(){
    int i = 1, soma = 0;
    while (i!=getN()){
      
        if((getN()%i)==0){
            soma = soma+i;
           
        }
        if(soma==getN()){
            return true;
        }
        i++;
    }
    return false;
    
} 

}
