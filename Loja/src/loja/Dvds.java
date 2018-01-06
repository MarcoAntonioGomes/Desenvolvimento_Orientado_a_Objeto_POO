/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author Marco
 */
public class Dvds extends Produto{
    private int duracao;

    public Dvds(String nome, double preço, int duracao, int codigo) {
        super(nome, preço, codigo);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }
    
 
    @Override
    public String toString(){
        System.out.println("Nome do DVD: "+this.getNome());
        System.out.println("Preço R$: "+this.getPreço());
        System.out.println("Duração: "+this.getDuracao());
        return null;
     }
}
