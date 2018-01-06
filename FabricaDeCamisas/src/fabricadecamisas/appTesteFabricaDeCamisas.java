
package fabricadecamisas;

import Fabrica.Cliente;
import Camisas.CamisaPolo;
import Camisas.Camisas;
import Dimensoes.Dimensoes;
import Dimensoes.GG;
import Dimensoes.M;
import Dimensoes.P;
import Fabrica.Fabrica;
import Fabrica.Pedidos;
import TiposDeGola.Golas;
import TiposTecidos.Algodao;
import TiposTecidos.TipoDeTecido;


public class appTesteFabricaDeCamisas {

    
    public static void main(String[] args) {
       Camisas camisa; 
       
       Cliente cliente = new Cliente("José Maria Braga","11122233344");
       Pedidos novoPedido;
       Fabrica novaConfeccao;
       
       TipoDeTecido tecido = new Algodao();
       
       Dimensoes dimensoes = new GG(20);
        
        Golas.TiposDeGola gola;
       
       camisa = new CamisaPolo("Azul",tecido,20,"Adidas");
       camisa.addDimensao(dimensoes);
       dimensoes = new M(5); 
       camisa.addDimensao(dimensoes);
       dimensoes = new P(10);
       camisa.addDimensao(dimensoes);
        
       
        System.out.println(""+camisa.toString());
        System.out.println("-----------------------------------");
        tecido.Descricao();
        
        novoPedido = new Pedidos(cliente,camisa);
        novaConfeccao = new Fabrica(20,5,novoPedido);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" Cliente: "+cliente.getNome()+" CPF: "+cliente.getCpf());
        System.out.println(" Quantidade de Camisas a Produzir: "+novoPedido.getQtdTotal());
        System.out.println(" Custo de Confecção por Peça: "+novoPedido.precoCamisaCgola());
        System.out.println(" Custo Total de Confecção: R$"+novoPedido.getCustoProd());
        System.out.println(" Prazo de Entrega: "+novaConfeccao.calcularPrazodeEntrega()+" dias");
    }
    
}
