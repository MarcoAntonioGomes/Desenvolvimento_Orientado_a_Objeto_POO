package Fabrica;


import Camisas.Camisas;
import Camisas.Produto;


public class Pedidos {
    Cliente cliente;
    Camisas camisa;
    private double custoProd;
    private int qtdTotal;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   

    public double getCustoProd() {
        return custoProd;
    }

    public void setCustoProd(double custoProd) {
        this.custoProd = custoProd;
    }

    public int getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(int qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public Camisas getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisas camisa) {
        this.camisa = camisa;
    }

    public Pedidos(Cliente cliente, Camisas camisa) {
        this.cliente = cliente;
        this.camisa = camisa;
        quantidadeTotal();
        CalculaCustoTotal();
    }
    
   
    public void quantidadeTotal(){
        for(int i=0;i<getCamisa().getDimensoes().size();i++){
            setQtdTotal(getQtdTotal()+getCamisa().getDimensoes().get(i).getQtdCamisa());            
        }
    }
    public void CalculaCustoTotal(){
        setCustoProd(((getCamisa().getPreco()+getCamisa().getGolaDaCamisa().getPreco())*getQtdTotal()));
    }
    public double precoCamisaCgola(){
        return getCamisa().getPreco()+getCamisa().getGolaDaCamisa().getPreco();
    }
}
