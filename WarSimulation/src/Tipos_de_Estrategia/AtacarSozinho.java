
package Tipos_de_Estrategia;

import WarSiimulation.Estrategia;


public class AtacarSozinho extends Estrategia {

    @Override
    public void exibirTipoEstretgia() {
        System.out.println("Atacar Sozinho");
    }
    @Override
     public void Iniciar(){
        plantarEvidencias();
        lancarBombas();
        derrubarGoverno();
    }
    @Override
    public void Concluir(){
       estabelecerGoverno();
    }
    public void plantarEvidencias(){
        System.out.println("Plantar Eviências falsas");
    }
    public void lancarBombas(){
        System.out.println("Lançar Bombas");
    }
    public void derrubarGoverno(){
        System.out.println("Derrubar Governo");
    }
    public void estabelecerGoverno(){
        System.out.println("Estabelecer Governo amigo");
    }
}
