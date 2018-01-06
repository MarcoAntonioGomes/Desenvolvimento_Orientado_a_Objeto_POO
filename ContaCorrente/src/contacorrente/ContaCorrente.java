package contacorrente;

public class ContaCorrente implements Sacar{

    protected double saldo;

    public ContaCorrente() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public final void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);

    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - (valor*1.05));
            return true;
        }
        else{
           return false; 
        }
    }
}