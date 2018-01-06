
public class Refrigerante {
    private Marca marca;
    private Tamanho tamanho;

    public Marca getMarca() {
        return marca;
    }

    public Refrigerante(Marca marca, Tamanho tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setCapacidade(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
