
package loja;


public class Produto implements Comparable<Produto> {
private String nome;
private double preço;
private int codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public Produto(String nome, double preço, int codigo) {
        this.nome = nome;
        this.preço = preço;
        this.codigo= codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
@Override
public boolean equals(Object obj) {
     Produto p = (Produto)obj;
        if ((obj instanceof Produto) && ((p.getCodigo()) == (this.getCodigo()))){ 
            return true;
        } else {
            return false;
        }
    }

@Override
    public int compareTo(Produto p) {
      if (this.preço < p.getPreço()) {
            return -1;
        }
        if (this.preço > p.getPreço()) {
            return 1;
        }
        return 0;
    }

    
    
    
}
