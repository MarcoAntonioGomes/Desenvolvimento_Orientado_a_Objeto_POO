
import classes.pessoa;
import contas.Conta;
import contas.ContaComun;
import excecoes.SaldoInsuficienteException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class appTesteContas1 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.FRENCH);
        int numero = 0;
        String nome, cpf;
        double saldo=0, valorsaque=0;
        System.out.print("Número da conta........: ");
         try{
        numero = teclado.nextInt();
         }
         catch(InputMismatchException e){
             System.out.println("Informe um valor numérico válido para o número da conta, ex: 129245");
             System.exit(0);
         }
        System.out.print("Correntista............: ");
        nome = teclado.next();
        System.out.print("CPF....................: ");
        cpf = teclado.next();
        System.out.print("Saldo inicial..........: ");
        try{
        saldo = teclado.nextDouble();
        }
        catch(InputMismatchException e){
            System.out.println("Informe um valor monetário válido para o saldo inicial da conta, ex: 129245");
            System.exit(0);
        }
        Conta contacomun = new ContaComun(numero,new pessoa(nome,cpf),saldo);
        System.out.print("Valor do saque......: ");
        try{
        valorsaque = teclado.nextDouble();
        }
        catch(InputMismatchException e){
            System.out.println("Informe um valor monetário válido para o deposito na conta, ex: 129245");
            System.exit(0);
        }
        try{
        contacomun.sacar(valorsaque);
        }
        catch(SaldoInsuficienteException e){
                System.out.println("Falha na tentativa de saque: "+e);
                }
       
    }
    
}
