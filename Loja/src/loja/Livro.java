
package loja;


public class Livro extends Produto  {
  private String autor;
    
    public Livro(String nome, double preço, String autor, int codigo) {
        super(nome, preço, codigo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     @Override
    public String toString(){
        System.out.println("Nome do Livro: "+this.getNome());
        System.out.println("Preço R$: "+this.getPreço());
        System.out.println("Autor: "+this.getAutor());
        return null;
     }
    
}
