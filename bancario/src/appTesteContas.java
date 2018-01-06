
import classes.pessoa;
import contas.Conta;
import contas.ContaComun;


public class appTesteContas {

    
    public static void main(String[] args) {
      Conta contacomun = new ContaComun(12345, new pessoa("Chico","11133344455"),150);
        System.out.println("Correntista: "+contacomun.getCorrentista().getNome());
         System.out.println("Saldo inicial da conta: "+ contacomun.getSaldo());
    }
    
}
