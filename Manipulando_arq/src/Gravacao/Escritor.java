package Gravacao;


import java.io.FileOutputStream;
import java.io.IOException;


public abstract class  Escritor implements Gravar  {
    public FileOutputStream arquivo;

    public Escritor(FileOutputStream arquivo)throws IOException {
        this.arquivo = arquivo;
    }
    

    
}
