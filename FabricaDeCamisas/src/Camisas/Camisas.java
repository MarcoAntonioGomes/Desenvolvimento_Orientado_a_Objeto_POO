
package Camisas;

import TiposTecidos.TipoDeTecido;
import Dimensoes.Dimensoes;
import TiposDeGola.Golas;
import java.util.ArrayList;
import java.util.List;


public  class Camisas extends Produto {
    private String cor;
    private String descricaoCamisa;
    
    private List<Dimensoes> dimensoes;
     
    private TipoDeTecido tipoDeTecido;
    private Golas.TiposDeGola GolaDaCamisa;

    public Camisas(String cor, TipoDeTecido tipoDeTecido, Golas.TiposDeGola GolaDaCamisa, double preco, String marca) {
        super(preco, marca);
        this.cor = cor;
        this.dimensoes= new ArrayList<>();
        this.tipoDeTecido = tipoDeTecido;
        this.GolaDaCamisa = GolaDaCamisa;
    }

    public void setDescricaoCamisa(String descricaoCamisa) {
        this.descricaoCamisa = descricaoCamisa;
    }

    public String getCor() {
        return cor;
    }

    public String getDescricaoCamisa() {
        return descricaoCamisa;
    }

   

    public TipoDeTecido getTipoDeTecido() {
        return tipoDeTecido;
    }

    public Golas.TiposDeGola getGolaDaCamisa() {
        return GolaDaCamisa;
    }

    public void setGolaDaCamisa(Golas.TiposDeGola GolaDaCamisa) {
        this.GolaDaCamisa = GolaDaCamisa;
    }
   
   public void addDimensao(Dimensoes medidas){
       this.dimensoes.add(medidas);
   }    
   
    @Override
   public String toString() {
   return "Descrição da Camisa: "+this.getDescricaoCamisa()+" \n Marca: "+this.getMarca()
           +"\n Cor: "+this.getCor()+"\n "+getTipoDeTecido().toString()+" "+getGolaDaCamisa().toString()+getDimensoes().toString();

  }

    public List<Dimensoes> getDimensoes() {
        return dimensoes;
    }

    
   
}
