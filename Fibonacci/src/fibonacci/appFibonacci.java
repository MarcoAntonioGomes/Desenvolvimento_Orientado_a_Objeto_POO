
package fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;


public class appFibonacci {

    
    public static void main(String[] args) throws NumerioInvalidoException {
      Fibonacci Seq;
      int numero = 0;
      Scanner teclado = new Scanner(System.in);
      Seq = new Fibonacci();
      
      System.out.println("Digite a quantidade de numeros a compor a sequencia");
       System.out.print("Escolha um numero maior que 3 e menor que 92: ");
      try{
       numero = teclado.nextInt();
       Seq.verificaNumero(numero);
      }catch(NumerioInvalidoException e){
          System.out.println("Erro: "+e);
      }
      catch(InputMismatchException e){
          System.out.println("Erro: dado inválido!");
      }
      if(Seq.verifica==true){
          Seq = new Fibonacci(numero);
          Seq.seqFibonacci(Seq.n,2);
          Seq.mostrarSeq();
      }
    }
    
    
}
