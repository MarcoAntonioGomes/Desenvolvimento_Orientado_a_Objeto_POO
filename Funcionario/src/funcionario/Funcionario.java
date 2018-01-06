/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;
import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class Funcionario {
 private double Func_salario;
 private String Func_nome;
 
 public Funcionario(String nome, double salario){
     Func_nome = nome;
     Func_salario = salario;
 }
   public void aumentar_salario(double percentualdeaumento){
    Func_salario = Func_salario*percentualdeaumento;   
   }
   private double Teste_percentual(double percentualdeaumento){
       Scanner entrada = new Scanner(System.in);
       while(percentualdeaumento <= 1){
         System.out.print("Este percentual não é válido\n"+"Digite um percentual de aumento válido: ");
          percentualdeaumento=entrada.nextDouble(); 
       }  
          return percentualdeaumento;
   }
     
   
   
    public static void main(String[]args){
     Scanner entrada = new Scanner(System.in);
    Funcionario Novo_Funcionario = new Funcionario("João Rodrigues",1000);
    Novo_Funcionario.aumentar_salario(1.5);
        System.out.println("Salário após o aumento: R$ "+Novo_Funcionario.Func_salario);
    }
    

}