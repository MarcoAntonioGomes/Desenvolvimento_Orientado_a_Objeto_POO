
package Camisas;

import TiposTecidos.TipoDeTecido;
import Dimensoes.Dimensoes;
import static TiposDeGola.Golas.TiposDeGola.GolaPolo;


public class CamisaPolo extends Camisas{

    public CamisaPolo(String cor,  TipoDeTecido tipoDeTecido, double preco, String marca) {
        super(cor, tipoDeTecido,GolaPolo,preco, marca);
        setDescricaoCamisa("Camisa Gola Polo");
    }

    
   
   
    
}
