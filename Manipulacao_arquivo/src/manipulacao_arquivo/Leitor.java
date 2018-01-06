
package manipulacao_arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Leitor {


    public static void main(String[] args) {
        try{
        FileInputStream arquivo = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(arquivo);
        BufferedReader br = new BufferedReader(isr);
        String  linha; 
        
          /*do{
              linha = br.readLine();
              if(linha != null){
                  System.out.println("lido: "+linha);
              }
          }while(linha != null);
          */
        do{
              linha = br.readLine();
              if(linha != null){
                  String [] palavras = linha.split(";");
                  System.out.println("nova linha ------------------------------------");
                  for(int i =0; i<palavras.length;i++){
                      System.out.println("palavra lida: "+ palavras[i]);
                  }
              }
          }while(linha != null);
        
        }
        catch(Exception e){
            System.out.println("Erro: leitura do arquivo");
    }
        
    }
    
}
