
package contas;

import classes.Taxas;
import classes.pessoa;
import excecoes.SaldoInsuficienteException;


public final class ContaEspecial extends Conta implements Taxas {
   
    private float limite;
    
    public ContaEspecial(){
        
    }
    
    public ContaEspecial(int numero, pessoa correntista, double saldo, float limite){
        super(numero,correntista,saldo);
        setLimite(limite);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
    public void sacar(double dinheiros)throws SaldoInsuficienteException {
        if (this.getSaldo()- dinheiros >= this.getLimite() ) 
           this.setSaldo(this.getSaldo()- dinheiros);
        else  
        throw new SaldoInsuficienteException(this.getSaldo(), dinheiros);
        
    }
    
    @Override
    public float getTaxaManuntecao(){
        return 15.0f;
    }
    @Override
    public void descontarTaxaManutencao(){
        this.setSaldo(this.getSaldo()- this.getTaxaManuntecao());
    }
}
