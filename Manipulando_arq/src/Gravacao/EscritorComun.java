package Gravacao;

import Gravacao.Escritor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritorComun extends Escritor {

         private String texto;

    public EscritorComun(FileOutputStream arquivo, String texto) throws IOException {
        super(arquivo);
        setTexto(texto);
    }

   

  

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public void gravar() throws IOException {
        PrintWriter pw = new PrintWriter(this.arquivo);
        pw.println(getTexto());
        pw.close();
        arquivo.close();
    }

    public String getTexto() {
        return texto;
    }

}
