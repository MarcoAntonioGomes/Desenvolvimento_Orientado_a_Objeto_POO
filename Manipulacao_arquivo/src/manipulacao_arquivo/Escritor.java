/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacao_arquivo;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Marco
 */
public class Escritor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           //Usar a frag True na instancia para escrever no final do arquivo, senão irá subscrever...
           FileOutputStream arquivo = new FileOutputStream("arquivo.txt",true);
           PrintWriter pw = new PrintWriter(arquivo);
           pw.println("linha1 colona1; linha2 coluna2, linha3 coluna3");
           pw.println("linha1 colona1; linha2 coluna2, linha3 coluna3");
           pw.println("linha1 colona1; linha2 coluna2, linha3 coluna3");
           
        pw.close();
        arquivo.close();
       }
    
    catch(Exception e){
            System.out.println("Erro na escrita do arquivo");
         }
    
   }
}