
package Camisas;

import TiposTecidos.TipoDeTecido;
import Dimensoes.Dimensoes;
import TiposDeGola.Golas;


public class CamisaRegata extends Camisas {

    public CamisaRegata(String cor, TipoDeTecido tipoDeTecido, Golas.TiposDeGola GolaDaCamisa, double preco, String marca) {
        super(cor, tipoDeTecido, GolaDaCamisa, preco, marca);
        setDescricaoCamisa("Camisa Regata");
    }

   
    
   
}
