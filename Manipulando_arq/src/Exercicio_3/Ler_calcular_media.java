package Exercicio_3;

import Gravacao.Gravar;
import Leitura.Leitor;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ler_calcular_media extends Leitor implements Gravar {
    private String nome;
    String linha;
    private double nota1;
    private double nota2;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public FileOutputStream getNotas() {
        return notas;
    }

    public void setNotas(FileOutputStream notas) {
        this.notas = notas;
    }
    
    public FileOutputStream notas;

    public Ler_calcular_media(FileInputStream arquivo, FileOutputStream notas) {
        super(arquivo);
        this.notas= notas;
    }

  

    private double converter(String texto) {
        return Double.parseDouble(texto);
    }

    @Override
    public void ler() throws IOException  {
        InputStreamReader isr = new InputStreamReader(this.arquivo);
        BufferedReader br = new BufferedReader(isr);
        
        
        do {
            setLinha(br.readLine());
           
            if (this.linha != null) {
                

                try {
                     String[] palavras = getLinha().split(";");
                    
                    setNota1(this.converter(palavras[1]));
                  
                    setNota2(this.converter(palavras[2]));
                    
                    setNome(palavras[0]);
                  
                    setMedia((getNota1()+getNota2())/2);
                    
                    
                    gravar();
                    setNotas(new FileOutputStream("notas.txt",true));
                 
                    
                } catch (NumberFormatException ex) {
                    System.out.println("A linha \"" + this.linha + "\" contém erros");
                }
              
            }
        } while (getLinha() != null);
        
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    @Override
    public void gravar() throws IOException {

       
        PrintWriter pw = new PrintWriter(this.notas);
        pw.println(getNome()+";"+getNota1()+";"+getNota2()+";"+getMedia());
        pw.close();
        getNotas().close();
    }
    
}
