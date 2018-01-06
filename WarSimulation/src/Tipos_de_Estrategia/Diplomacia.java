
package Tipos_de_Estrategia;

import WarSiimulation.Estrategia;


public class Diplomacia extends Estrategia{

    @Override
    public void exibirTipoEstretgia() {
        System.out.println("Diplomacia");
    }

    @Override
   public void Iniciar(){
        recuarTropas();
        proporCooP();
    }
    @Override
    public void Concluir(){
        Desarmar();
    }
    public void recuarTropas(){
        System.out.println("Recuando Tropas");
    }
    public void proporCooP(){
        System.out.println("Propondo Cooperação Econômica");
    }
    public void Desarmar(){
        System.out.println("Desarmar Inimigo");
    }
  
    
}
