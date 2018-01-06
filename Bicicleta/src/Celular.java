
public class Celular {
    private int numero;
    private float preco;
    private String modelo;
    private int ano;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Celular(int numero, float preco, String modelo, int ano) {
        this.numero = numero;
        this.preco = preco;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Celular() {
    }
    
    public void exibirInfo(){
        System.out.println("Modelo do Celular: "+this.getModelo());
        System.out.println("Ano : "+this.getAno());
        System.out.println("Numero: "+this.getNumero());
        System.out.println("Preço:  R$"+this.getPreco());
    }
    
    
}
