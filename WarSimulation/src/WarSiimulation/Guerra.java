
package WarSiimulation;


public class Guerra {
    String Pais;
    Inimigo NovoInimigo;
    public Guerra(){
        
    }
    public Guerra(String Pais, Inimigo NovoInimigo, Estrategia estrategia) {
        this.Pais = Pais;
        this.NovoInimigo = NovoInimigo;
        this.NovoInimigo.Estrategia=estrategia;
    }

    public String getPais() {
        return Pais;
    }
  
    public boolean verificaTamanhoExercito(int tamanho){
        return(tamanho>10000);
    }
}
