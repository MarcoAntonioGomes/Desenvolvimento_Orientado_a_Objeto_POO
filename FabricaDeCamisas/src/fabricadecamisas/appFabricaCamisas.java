package fabricadecamisas;

import Gravacao.Escritor;
import Gravacao.EscritorComun;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class appFabricaCamisas {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String cor, marca, tecido, gola, camisa, tam = null, modelo, qtd = null, salvar;
        String confirma = "S";
       
        double preco;

        FileOutputStream arquivo_camisas = new FileOutputStream("camisas.txt", true);
        FileOutputStream arquivo_demensoes = new FileOutputStream("dimensoes.txt", true);
        Escritor salvar_camisas;
        Escritor salvar_dimensoes;

        int op = 0;
        int op2 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("-- Sistema para Confeccções de Camisas --");
        System.out.println("---------- FÁBRICA DO PALHACIN -----------");
        System.out.println("Para Começar Informe os dados solicitados");
        System.out.print("Digite a Cor da Camisa: ");
        cor = teclado.next();
        System.out.print("Digite a marca da Camisa: ");
        marca = teclado.next();
        System.out.print("Digie o Preço do Custo de Confecção: ");

        preco = teclado.nextDouble();
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Escolha o tipo de Tecido no qual a camisa será confeccionda: ");
        System.out.println(" 1 - Algodão");
        System.out.println(" 2 - Linho");
        System.out.println(" 3 - Pv");
        System.out.println(" 4 - Seda");
        System.out.print(" Opção: ");
        tecido = teclado.next();

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Escolha um Tipo de Gola: ");
        System.out.println(" 1 - Gola-V");
        System.out.println(" 2 - Gola Polo");
        System.out.println(" 3 - Gola Normal Fina");
        System.out.println(" 4 - Gola Normal Larga");
        System.out.println(" 5 - Gola Com Botões");
        System.out.print(" Opção: ");
        gola = teclado.next();

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Escolha um Modelo de Camisa: ");
        System.out.println(" 1 - Camisa Normal");
        System.out.println(" 2 - Camisa Polo");
        System.out.println(" 3 - Camisa Regata");
        System.out.print(" Opção: ");
        camisa = teclado.next();
        
        salvar = cor + ";" + marca + ";" + tecido + ";" + gola + ";" + camisa;
         System.out.println(" "+salvar );
         
          try {
               salvar_camisas = new EscritorComun(arquivo_camisas, salvar);
               salvar_camisas.gravar();  
            } catch (Exception e) {
                System.out.println("Erro na escrita do arquivo");
            }
         salvar = " ";

        while (("s".equals(confirma)) || ("S".equals(confirma))) {
            System.out.println("----------------------------------------------------------------------");

            System.out.println("Escolha o Estilo de Camisa");
            System.out.println(" 1 - Padrão de Camisa Tradicional");
            System.out.println(" 2 - Baby Look");
            System.out.print(" Opção: ");
            modelo = teclado.next();
            switch (modelo) {
                case "1":
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("Digite a Quantidade de Camisas por Tamanho: ");
                    qtd = teclado.next();
                    System.out.println("Escolha o Tamanho");
                    System.out.println(" 1 - P ");
                    System.out.println(" 2 - M ");
                    System.out.println(" 3 - G ");
                    System.out.println(" 4 - GG ");
                    System.out.println(" 5 - EGG ");
                    System.out.print(" Opção: ");
                    tam = teclado.next();
                    break;
                case "2":
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("Digite a Quantidade de Camisas por Tamanho: ");
                    qtd = teclado.next();
                    System.out.println("Escolha o Tamanho");
                    System.out.println(" 1 - P ");
                    System.out.println(" 2 - M ");
                    System.out.println(" 3 - G ");
                    System.out.println(" 4 - GG ");
                    System.out.print(" Opção: ");
                    tam = teclado.next();
                    break;
                default:
                    System.out.println(" A Opção digitada é invalida !!!");

            }
              salvar =  salvar+modelo+";"+tam+";"+qtd+";";             
            System.out.print("Deseja-se escolher um novo tamnho para a mesma camisa?? (S-Sim/N-Não):");
            confirma = teclado.next();

        }
        
        
         
        try {
                salvar_dimensoes = new EscritorComun( arquivo_demensoes, salvar);
                salvar_dimensoes.gravar();  
            } catch (Exception e) {
                System.out.println("Erro na escrita do arquivo");
            }
        
    }
    
       
}
