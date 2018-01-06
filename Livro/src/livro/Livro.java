/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;
import java.util.Scanner;
/**
/**
 *
 * @author Marco
 */
public class Livro {

    public String nome;
    public int qtdPaginas;
    public String autor;
    public float preco;

    public void setPreco(float x) {
        preco = x;
    }

    public float getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        Livro ObjLivro_1 = new Livro();
        System.out.println("Inserindo um Livro"+"\n Digite o nome do Livro: ");
        ObjLivro_1.nome = Entrada.nextLine();
        System.out.println("Digite o nome do Autor: ");
        ObjLivro_1.autor = Entrada.nextLine();
        System.out.println("Digite a Quantidade de Paginas do livro: ");
        ObjLivro_1.qtdPaginas = Entrada.nextInt();
        System.out.println("Digite o preço: R$ ");
        ObjLivro_1.setPreco(Entrada.nextInt());
        
        System.out.println("/n/n/n");
        System.out.println("--- Livro Cadastrado ---");
        System.out.println("Nome "+ObjLivro_1.nome+"\nAutor: "+ObjLivro_1.autor+"\nQuantidade de Paginas: "+ObjLivro_1.qtdPaginas);
        System.out.println("Preço: R$"+ObjLivro_1.getPreco());
    }

}
