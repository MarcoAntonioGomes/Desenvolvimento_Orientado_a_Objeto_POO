
package Exercicio_4;


public class Filial {
    private int filial;
    private int cont_vendas;
    private double venda_total;
    private double media;

    public Filial(int filial, int cont_vendas, double venda_total, double media) {
        this.filial = filial;
        this.cont_vendas = cont_vendas;
        this.venda_total = venda_total;
        this.media = media;
    }

    public int getCont_vendas() {
        return cont_vendas;
    }

    public void setCont_vendas(int cont_vendas) {
        this.cont_vendas = cont_vendas;
    }

  

   

    public int getFilial() {
        return filial;
    }

    public void setFilial(int filial) {
        this.filial = filial;
    }

  

   

    public double getVenda_total() {
        return venda_total;
    }

    public void setVenda_total(double venda_total) {
        this.venda_total = venda_total;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
   public double calculaMedia(){
       return getVenda_total()/getCont_vendas();
   }
    
}
