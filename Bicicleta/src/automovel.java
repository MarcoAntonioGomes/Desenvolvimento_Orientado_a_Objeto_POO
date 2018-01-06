
public class automovel {
 private String cor;
 private String modelo;
 private int ano;
 private float preco;

    public automovel() {
    }

    public automovel(String cor, String modelo, int ano, float preco) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
 
    public void exibirInfo(){
        System.out.println("Carro modelo "+this.getModelo()+", ano "+this.getAno()+", na cor "+this.getCor()+" como o preço de R$ "+this.getPreco());
    }

}
