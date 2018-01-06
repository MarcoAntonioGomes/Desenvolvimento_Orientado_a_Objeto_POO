package Leitura;


import java.io.FileInputStream;


public abstract class Leitor implements Ler {
   public FileInputStream arquivo;
   

    public Leitor(FileInputStream arquivo) {
        this.arquivo = arquivo;
    }
    
   
}
