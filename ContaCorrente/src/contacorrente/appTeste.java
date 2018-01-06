
package contacorrente;


public class appTeste {

 
    public static void main(String[] args) {
        
        ContaCorrente Conta1;
        Conta1 = new ContaCorrente();
        ContaCorrente Conta2;
        Conta2 = new ClienteEspecial();
        
        Conta1.depositar(1000);
        Conta2.depositar(1000);
        Conta1.sacar(500);
        Conta2.sacar(500);
        System.out.println("Saldo da Conta-1 apos o saque: R$ "+Conta1.getSaldo());
         System.out.println("Saldo da Conta-2 apos o saque: R$ "+Conta2.getSaldo());
    }
    
}
