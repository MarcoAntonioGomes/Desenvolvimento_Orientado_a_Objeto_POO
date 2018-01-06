
package Exercicio_2;

import Gravacao.Escritor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritor_notas extends Escritor {
    private String nome;
    private double n1,n2;

    public Escritor_notas(String nome, double n1, double n2, FileOutputStream arquivo) throws IOException {
        super(arquivo);
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
     public void gravar() throws IOException {
        PrintWriter pw = new PrintWriter(this.arquivo);
        pw.println(getNome()+";"+getN1()+";"+getN2());
        pw.close();
        this.arquivo.close();
    }
}
