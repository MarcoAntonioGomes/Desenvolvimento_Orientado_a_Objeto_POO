/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricadecamisas;

import Camisas.CamisaNormal;
import Camisas.CamisaPolo;
import Camisas.CamisaRegata;
import Camisas.Camisas;
import Camisas.Produto;
import Dimensoes.Dimensoes;
import Dimensoes.EG;
import Dimensoes.EGG;
import Dimensoes.G;
import Dimensoes.GG;
import Dimensoes.GG_BabyLook;
import Dimensoes.G_BabyLook;
import Dimensoes.M;
import Dimensoes.M_BabyLook;
import Dimensoes.P;
import Dimensoes.P_BabyLook;
import TiposDeGola.Golas;
import static TiposDeGola.Golas.TiposDeGola.GolaBotoes;
import static TiposDeGola.Golas.TiposDeGola.GolaNormalFina;
import static TiposDeGola.Golas.TiposDeGola.GolaNormalLarga;
import static TiposDeGola.Golas.TiposDeGola.GolaPolo;
import static TiposDeGola.Golas.TiposDeGola.GolaV;
import TiposTecidos.Algodao;
import TiposTecidos.Linho;
import TiposTecidos.PV;
import TiposTecidos.Seda;
import TiposTecidos.TipoDeTecido;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class FabricaDeCamisas {

    public static void main(String[] args) {
        Camisas camisa = null;
        String cor, marca;
        String confirma = "S";
        int qtd = 0;
        double preco;

        TipoDeTecido tecido = null;
        Dimensoes dimensoes = null;
        Golas.TiposDeGola gola = null;
        int op = 0;
        int op2 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("-- Sistema para Confeccções de Camisas --");
        System.out.println("---------- FÁBRICA DE CAMISAS -----------");
        System.out.println("Para Começar Informe os dados solicitados");
        System.out.print("Digite a Cor da Camisa: ");
        cor = teclado.next();
        System.out.print("Digite a marca da Camisa: ");
        marca = teclado.next();
        System.out.print("Digie o Preço do Custo de Confecção: ");

        preco = teclado.nextDouble();
        System.out.println("----------------------------------------------------------------------");
        //gola = gola.EscolhaGolas();

        System.out.println("Escolha o tipo de Tecido no qual a camisa será confeccionda: ");
        System.out.println(" 1 - Algodão");
        System.out.println(" 2 - Linho");
        System.out.println(" 3 - Pv");
        System.out.println(" 4 - Seda");
        System.out.print(" Opção: ");
        op = teclado.nextInt();
        switch (op) {
            case 1:
                tecido = new Algodao();
                break;
            case 2:
                tecido = new Linho();
                break;
            case 3:
                tecido = new PV();
                break;
            case 4:
                tecido = new Seda();
                break;
            default:
                System.out.println(" A Opção digitada é invalida !!!");
        }
       

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Escolha um Tipo de Gola: ");
        System.out.println(" 1 - Gola-V");
        System.out.println(" 2 - Gola Polo");
        System.out.println(" 3 - Gola Normal Fina");
        System.out.println(" 4 - Gola Normal Larga");
        System.out.println(" 5 - Gola Com Botões");
        System.out.print(" Opção: ");
        op = teclado.nextInt();
        switch (op) {
            case 1:
                gola = GolaV;
            case 2:
                gola = GolaPolo;
            case 3:
                gola = GolaNormalFina;
            case 4:
                gola = GolaNormalLarga;
            case 5:
                gola = GolaBotoes;
            default:
                System.out.println(" A Opção digitada é invalida !!!");
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Escolha um Modelo de Camisa: ");
        System.out.println(" 1 - Camisa Normal");
        System.out.println(" 2 - Camisa Polo");
        System.out.println(" 3 - Camisa Regata");
        System.out.print(" Opção: ");
        op = teclado.nextInt();

        switch (op) {
            case 1:
                camisa = new CamisaNormal(cor,tecido, gola, preco, marca);
             
                break;
            case 2:
                camisa = new CamisaPolo(cor,  tecido, preco, marca);
                break;
            case 3:
                camisa = new CamisaRegata(cor, tecido, gola, preco, marca);
                break;
            default:
                System.out.println(" A Opção digitada é invalida !!!");
        }
        
         while (("s".equals(confirma)) || ("S".equals(confirma))) {
            System.out.println("----------------------------------------------------------------------");

            System.out.println("Escolha o Estilo de Camisa");
            System.out.println(" 1 - Padrão de Camisa Tradicional");
            System.out.println(" 2 - Baby Look");
            System.out.print(" Opção: ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------------------------------------------------------------------");

                    System.out.print("Digite a Quantidade de Camisas por Tamanho: ");
                    qtd = teclado.nextInt();
                    System.out.println("Escolha o Tamanho");
                    System.out.println(" 1 - P ");
                    System.out.println(" 2 - M ");
                    System.out.println(" 3 - G ");
                    System.out.println(" 4 - GG ");
                    System.out.println(" 5 - EG ");
                    System.out.println(" 6 - EGG ");
                    System.out.print(" Opção: ");
                    op2 = teclado.nextInt();
                    switch (op2) {
                        case 1:
                            dimensoes = new P(qtd);
                            
                            break;
                        case 2:
                            dimensoes = new M(qtd);
                            break;
                        case 3:
                            dimensoes = new G(qtd);
                            break;
                        case 4:
                            dimensoes = new GG(qtd);
                            break;
                        case 5:
                            dimensoes = new EG(qtd);
                            break;
                         case 6:
                            dimensoes = new EGG(qtd);
                            break;
                        default:
                            System.out.println(" A Opção digitada é invalida !!!");
                          
                    }
                break; 
                case 2:
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("Digite a Quantidade de Camisas por Tamanho: ");
                    qtd = teclado.nextInt();
                    System.out.println("Escolha o Tamanho");
                    System.out.println(" 1 - P ");
                    System.out.println(" 2 - M ");
                    System.out.println(" 3 - G ");
                    System.out.println(" 4 - GG ");
                    System.out.print(" Opção: ");
                    op2 = teclado.nextInt();
                    switch (op2) {
                        case 1:
                            dimensoes = new  P_BabyLook(qtd);
                            break;
                        case 2:
                            dimensoes = new  M_BabyLook(qtd);
                            break;
                        case 3:
                            dimensoes = new  G_BabyLook(qtd);
                            break;
                        case 4:
                            dimensoes = new  GG_BabyLook( qtd);
                            break;

                        default:
                            System.out.println(" A Opção digitada é invalida !!!");
                            break;
                    }
                break;
                default:
                    System.out.println(" A Opção digitada é invalida !!!");
                   
            }
           camisa.addDimensao(dimensoes);
            System.out.print("Deseja-se escolher um novo tamnho para a mesma camisa?? (S-Sim/N-Não):");
            confirma = teclado.next();
        }
    }

}
