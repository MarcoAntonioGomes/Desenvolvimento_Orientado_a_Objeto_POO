
package contacorrente;


public class ClienteEspecial extends ContaCorrente implements Sacar {
    
    
    @Override
    public boolean sacar(double valor) {
        if (valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - (valor*1.01));
            return true;
        }
        else{
           return false; 
        }
    }

    public ClienteEspecial() {
    }
}
