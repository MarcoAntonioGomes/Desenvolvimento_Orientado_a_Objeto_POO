
package WarSiimulation;

import TiposDeInimigo.Fragil;
import TiposDeInimigo.GrandeExercito;
import TiposDeInimigo.Nuclear;
import Tipos_de_Estrategia.AliançaVizinho;
import Tipos_de_Estrategia.AtacarSozinho;
import Tipos_de_Estrategia.Diplomacia;
import java.util.Scanner;


public class WarSimulation {

  
    public static void main(String[] args) {
        Guerra novaguerra;
        novaguerra = new Guerra();
        Scanner entrada = new Scanner(System.in);
        String Pais = null;
        int op =0;
        int tamanho = 0;
        do{
         System.out.println("-------Simulando uma Guerra---------");
         System.out.println("Digite o Nome do País: ");
         Pais= entrada.next();
         System.out.println("Escolha o Tipo de Inimigo");
         System.out.println("1- Inimigo Fragil");
         System.out.println("2- Inimigo Nuclear");
         System.out.println("3- Grande Exercito - Para Exercitos maiores que 10000 Homens - ");
         System.out.println("Escolha uma Opção: ");
         op = entrada.nextInt();
         if(op==3){
             System.out.println("Digite o Tamanho do exercito inimigo: ");
             tamanho = entrada.nextInt();
             if(tamanho < 10000){
                 System.out.println("Exercito Inválido");
                 System.out.println("Escolha o tipo de Inimigo adequadro");
                 
             }
         }
        }while((op != 1 && op !=2) && tamanho < 10000);
         
        switch(op){
             case 1:
              Fragil inimigofragil;
              inimigofragil = new Fragil();
              AtacarSozinho ataquesozinho;
              ataquesozinho = new AtacarSozinho();
              novaguerra = new Guerra(Pais,inimigofragil ,ataquesozinho);
              break;
             case 2:
              Nuclear inimigonuclear;
              inimigonuclear = new Nuclear();
              Diplomacia diplomacia;
              diplomacia =  new Diplomacia();  
              novaguerra = new Guerra(Pais,inimigonuclear,diplomacia);
              break;
             case 3:
              GrandeExercito exercitogrande;
              exercitogrande = new GrandeExercito();
              AliançaVizinho alianca;
              alianca =  new AliançaVizinho();
              novaguerra = new Guerra(Pais,exercitogrande,alianca);
              break;
             default:
                 System.out.println("Opção inválida");
         }
        System.out.println("Iniciando guerra contra o País: " + novaguerra.getPais());
        System.out.println("Estratégia: ");
        novaguerra.NovoInimigo.Estrategia.exibirTipoEstretgia();
        System.out.println("Inicio: ");
        novaguerra.NovoInimigo.Estrategia.Iniciar();
        System.out.println("Concluir: ");
        novaguerra.NovoInimigo.Estrategia.Concluir();
        
         
    }
    
}
