
package contas;

import classes.Taxas;
import classes.pessoa;
import excecoes.SaldoInsuficienteException;


public final class ContaComun extends Conta implements Taxas{

    public ContaComun() {
    }


    public ContaComun(int numero, pessoa correntista, double saldo) {
        super(numero, correntista, saldo);
    }
    
    @Override
    public void sacar(double dinheiros) throws SaldoInsuficienteException{
        if (dinheiros<=this.getSaldo()) 
            this.setSaldo(this.getSaldo()-dinheiros);
        
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
