package Exercicio_4;

import Exercicio_3.Ler_calcular_media;
import Leitura.Leitor;
import Leitura.Ler;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ler_dados extends Leitor implements Ler {

    Filial filial_1;
    Filial filial_2;
    Filial filial_3;
    Filial filial_4;
    Filial filial_5;

    public Filial getFilial_1() {
        return filial_1;
    }

    public void setFilial_1(Filial filial_1) {
        this.filial_1 = filial_1;
    }

    public Filial getFilial_2() {
        return filial_2;
    }

    public void setFilial_2(Filial filial_2) {
        this.filial_2 = filial_2;
    }

    public Filial getFilial_3() {
        return filial_3;
    }

    public void setFilial_3(Filial filial_3) {
        this.filial_3 = filial_3;
    }

    public Filial getFilial_4() {
        return filial_4;
    }

    public void setFilial_4(Filial filial_4) {
        this.filial_4 = filial_4;
    }

    public Filial getFilial_5() {
        return filial_5;
    }

    public void setFilial_5(Filial filial_5) {
        this.filial_5 = filial_5;
    }

    private String linha;

    public Ler_dados(FileInputStream arquivo) {
        super(arquivo);
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Ler_dados dados_filiais;
        dados_filiais = new Ler_dados(new FileInputStream("filiais.csv"));
        dados_filiais.setFilial_1(new Filial(1, 0, 0, 0));
        dados_filiais.setFilial_2(new Filial(2, 0, 0, 0));
        dados_filiais.setFilial_3(new Filial(3, 0, 0, 0));
        dados_filiais.setFilial_4(new Filial(4, 0, 0, 0));
        dados_filiais.setFilial_5(new Filial(5, 0, 0, 0));
        
        try {
           dados_filiais.ler();

        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo");
        }
        
       
         
        System.out.println("--- Informando os dados de Venda de Cada Filial --- ");
        System.out.println("-----------------------------------------------------");
        System.out.println("Filial nº: "+dados_filiais.getFilial_1().getFilial()); 
        System.out.println("Total de Vendas: R$ "+dados_filiais.getFilial_1().getVenda_total());
        System.out.println("Média de Vendas: R$ "+dados_filiais.getFilial_1().calculaMedia());
        System.out.println("-----------------------------------------------------");
        System.out.println("Filial nº: "+dados_filiais.getFilial_2().getFilial()); 
        System.out.println("Total de Vendas: R$ "+dados_filiais.getFilial_2().getVenda_total());
        System.out.println("Média de Vendas: R$ "+dados_filiais.getFilial_2().calculaMedia());
        System.out.println("-----------------------------------------------------");
        System.out.println("Filial nº: "+dados_filiais.getFilial_3().getFilial()); 
        System.out.println("Total de Vendas: R$ "+dados_filiais.getFilial_3().getVenda_total());
        System.out.println("Média de Vendas: R$ "+dados_filiais.getFilial_3().calculaMedia());
        System.out.println("-----------------------------------------------------");
        System.out.println("Filial nº: "+dados_filiais.getFilial_4().getFilial()); 
        System.out.println("Total de Vendas: R$ "+dados_filiais.getFilial_4().getVenda_total());
        System.out.println("Média de Vendas: R$ "+dados_filiais.getFilial_4().calculaMedia());
        System.out.println("-----------------------------------------------------");
        System.out.println("Filial nº: "+dados_filiais.getFilial_5().getFilial()); 
        System.out.println("Total de Vendas: R$ "+dados_filiais.getFilial_5().getVenda_total());
        System.out.println("Média de Vendas: R$ "+dados_filiais.getFilial_5().calculaMedia());
        
    }

    private double converter(String texto) {
        return Double.parseDouble(texto);
    }

    private int converter_int(String texto) {
        return Integer.parseInt(texto);
    }

    @Override
    public void ler() throws IOException {
        InputStreamReader isr = new InputStreamReader(this.arquivo);
        BufferedReader br = new BufferedReader(isr);

        do {
            setLinha(br.readLine());

            if (this.linha != null) {

                try {
                    String[] palavras = getLinha().split(",");
                  
                    switch (palavras[0]) {
                        case "1":

                            getFilial_1().setVenda_total(getFilial_1().getVenda_total() + converter(palavras[1]));
                            getFilial_1().setCont_vendas(getFilial_1().getCont_vendas() + 1);
                            break;
                        case "2":
                            getFilial_2().setVenda_total(getFilial_2().getVenda_total() + converter(palavras[1]));
                            getFilial_2().setCont_vendas(getFilial_2().getCont_vendas() + 1);
                            break;
                        case "3":
                            getFilial_3().setVenda_total(getFilial_3().getVenda_total() + converter(palavras[1]));
                            getFilial_3().setCont_vendas(getFilial_3().getCont_vendas() + 1);
                            break;
                        case "4":
                            getFilial_4().setVenda_total(getFilial_4().getVenda_total() + converter(palavras[1]));
                            getFilial_4().setCont_vendas(getFilial_4().getCont_vendas() + 1);
                            break;
                        case "5":
                            getFilial_5().setVenda_total(getFilial_5().getVenda_total() + converter(palavras[1]));
                            getFilial_5().setCont_vendas(getFilial_5().getCont_vendas() + 1);
                            break;
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("A linha \"" + this.linha + "\" contém erros");
                }

            }
        } while (getLinha() != null);

    }

}
