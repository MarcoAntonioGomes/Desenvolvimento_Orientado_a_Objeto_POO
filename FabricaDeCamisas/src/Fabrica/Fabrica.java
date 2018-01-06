package Fabrica;


import Camisas.Produto;
import Dimensoes.Dimensoes;
import java.util.ArrayList;
import java.util.List;


public class Fabrica {
    private int quantPessoas;
    private int quantMaquinas;
    private Pedidos pedido;

    public Fabrica(int quantPessoas, int quantMaquinas, Pedidos pedido) {
        this.quantPessoas = quantPessoas;
        this.quantMaquinas = quantMaquinas;
        this.pedido = pedido;
    }

    
    
    
     
    public int  calcularPrazodeEntrega(){
        int prazo;
        prazo = ((getQuantMaquinas()*getPedido().getQtdTotal())/getQuantPessoas());
        return prazo;
    }

    public int getQuantPessoas() {
        return quantPessoas;
    }

    public int getQuantMaquinas() {
        return quantMaquinas;
    }

    public Pedidos getPedido() {
        return pedido;
    }

   
    
}
