
package TiposDeGola;

import Camisas.CamisaNormal;
import Camisas.CamisaPolo;
import Camisas.CamisaRegata;
import static TiposDeGola.Golas.TiposDeGola.GolaBotoes;
import static TiposDeGola.Golas.TiposDeGola.GolaNormalFina;
import static TiposDeGola.Golas.TiposDeGola.GolaNormalLarga;
import static TiposDeGola.Golas.TiposDeGola.GolaPolo;
import static TiposDeGola.Golas.TiposDeGola.GolaV;


public class Golas {
    
    public enum TiposDeGola{
       
        
        GolaV("Gola V",7.00),
        GolaPolo("Gola Polo",15.00),
        GolaNormalFina("Gola Normal Fina",5.00),
        GolaNormalLarga("Gola Normal Larga",5.00),
        GolaBotoes("Gola Com Botões",10.00);
        
        private String tipo;
        private double preco;
        
        TiposDeGola(String tipo, double preco){
         this.tipo = tipo;
         this.preco = preco;
         
         
        }
        @Override
         public String toString() {
        return "\n Tipo de Gola: "+tipo+"\n Preço da Gola R$: "+preco;
       }

        public double getPreco() {
            return preco;
        }
       
         
    }
    
        
}
