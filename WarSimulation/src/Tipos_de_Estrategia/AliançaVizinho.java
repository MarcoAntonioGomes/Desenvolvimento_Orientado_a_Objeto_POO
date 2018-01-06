
package Tipos_de_Estrategia;

import WarSiimulation.Estrategia;


public class AliançaVizinho extends Estrategia{

    @Override
    public void exibirTipoEstretgia() {
      System.out.println("Aliança com Vizinho");
    }
    @Override
   public void Iniciar(){
        atacarNorte();
        vizinhoSul();
    }
    @Override
    public void Concluir(){
        dividirBeneficio();
        dividirCusto();
    }
    public void atacarNorte(){
        System.out.println("Atacar pelo norte");
    }
    public void vizinhoSul(){
        System.out.println("Vizinho atacar pelo Sul");
    }
    public void dividirBeneficio(){
        System.out.println("Dividir Benefícios");
    }
    public void dividirCusto(){
        System.out.println("Dividir Custos de Reconstrução");
    }
    
    
}
