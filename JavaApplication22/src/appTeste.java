
import java.util.Scanner;
import javaapplication22.HeitoException;
import javaapplication22.Projeto;


public class appTeste {


    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       Projeto novoprojeto = new Projeto();
       String proj;
       int nome = 0;
       
        System.out.print("Digite o nome do projeto: ");
        proj = teclado.next();
        
        System.out.print("Digite o nome responsavel : ");
        nome = teclado.nextInt();
        
         boolean verifica = false;
         
        while(verifica == false){ 
        try{
         verifica=novoprojeto.verificaNome(nome);
        }
        catch(HeitoException e){
                 System.out.println("ERro!!! : "+e);
                 System.out.print("Digite um nome valido porque senao vai feder: ");
                 nome = teclado.nextInt();
        }
       }
    }
       
        
    }
    

