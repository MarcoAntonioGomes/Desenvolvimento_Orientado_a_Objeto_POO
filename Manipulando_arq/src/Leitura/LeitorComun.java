
package Leitura;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeitorComun extends Leitor {
    private String nome;
    private  double n1,n2,media;
    String linha;

    public LeitorComun(FileInputStream arquivo) {
        super(arquivo);
    }
    
    
     @Override
    public void ler() throws IOException{
        InputStreamReader isr = new InputStreamReader(this.arquivo);
        BufferedReader br = new BufferedReader(isr);
        do{
        this.linha = br.readLine();
              if(this.linha != null){
                  String [] palavras = this.linha.split(";");
                  System.out.println("nova linha ------------------------------------");
                  for(int i =0; i<palavras.length;i++){
                      System.out.println("palavra lida: "+ palavras[i]);
                  }
              }
          }while(this.linha != null);
        
    }
}
