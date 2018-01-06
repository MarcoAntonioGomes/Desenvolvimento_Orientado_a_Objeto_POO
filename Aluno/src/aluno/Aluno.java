/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;
import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class Aluno {
 public String nome;
 public String nomeCurso;
 public float tempoSemDormir;
  
 public void estudar(float qtdHorasEstudo){
     tempoSemDormir = tempoSemDormir+qtdHorasEstudo;
 }
 public void dormir (float qtdHoraSono){
     tempoSemDormir = tempoSemDormir-qtdHoraSono;
 }
 
 
   
    public static void main(String[] args) {
       Scanner Entrada = new Scanner(System.in);
       Aluno ObjAluno = new Aluno();
        System.out.println("--- Testando a Classe Aluno ---"+"\n Informe o nome do aluno: ");
        ObjAluno.nome = Entrada.nextLine();
        System.out.println("Informe o nome do curso: ");
        ObjAluno.nomeCurso = Entrada.nextLine();
        System.out.println("Informe a quantidade de horas sem dormir: ");
        ObjAluno.tempoSemDormir = Entrada.nextFloat();
        ObjAluno.estudar(10);
        ObjAluno.dormir(5);
        
        System.out.println("O Aluno, "+ObjAluno.nome+", do curso, "+ObjAluno.nomeCurso+" esta ha "+ObjAluno.tempoSemDormir+" horas sem dormir.");
        
    }
    
}
