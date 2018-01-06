
import java.util.InputMismatchException;
import java.util.Scanner;


public class appFGTS {

    
    public static void main(String[] args) throws TamanhoDoNomeException, NumerosNoNomeException, SalarioMinimoException {
        Pessoa p1;
        String nome = null;
        double salario = 0;
        p1 = new Pessoa();
        Scanner teclado = new Scanner(System.in);
        while (p1.verifica == false || p1.verifica2 == false){
        System.out.print("Digite o nome da Pessoa: "); 
        nome = teclado.next();
        try{
         p1.verificaTamanhoNome(nome);
         p1.containsOnlyNumbers(nome);
        }
        catch(TamanhoDoNomeException e){
            
            System.out.println("Erro!" + e);
            System.out.println("Digite um nome válido... ");
                   
        }
        catch(NumerosNoNomeException a){
            System.out.println("Erro!" + a);
            System.out.println("Digite um nome válido... ");
        }
      }
      p1.setNome(nome);
        System.out.print("Digite o Salário...: R$ ");
       
        while (salario==0 || p1.verifica3 == false){
        try{
      
          salario= teclado.nextDouble();
          p1.verificaSalario(salario);
       
        }
        catch(InputMismatchException e){
           
            System.out.println("O salário só pode possuir numeros: "+e);
            System.out.println("Digite valores válidos... "+teclado.next());
            System.out.print("Digite o salário: R$ ");
        }
        catch(SalarioMinimoException a){
            System.out.println("Salário inválido... "+a);
            System.out.print("Digite um salário válido: R$ ");
        }  
    }
    p1.setSalario(salario);
        System.out.println("-------------------------------------------------");
        System.out.println("Recibo de Pagamento");
        System.out.println("Nome:         "+p1.getNome());
        System.out.println("Salário:      R$ "+p1.getSalario());
        System.out.println("FGTS:         R$ "+p1.calculaFGTS());
  }
    
}
