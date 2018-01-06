
package Camisas;


public abstract class Produto {
    private double preco;
    private String marca;

    public Produto(double preco, String marca) {
        this.preco = preco;
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   
    
    
}
