
package excecoes;


public class SaldoInsuficienteException extends Exception {
    private double saldo;
    private double valor;

    public SaldoInsuficienteException(double saldo, double valor) {
        this.saldo = saldo;
        this.valor = valor;
    }
    @Override
    public String toString(){
        return "Saldo insuficiente para o saque. O saldo atual é R$ " + saldo +  " e você esta tentando sacar R$ " + valor; 
    }
}
