
package TiposTecidos;


public abstract class TipoDeTecido {
    private String tecido;
  

    public TipoDeTecido(String tecido) {
        this.tecido = tecido;
        
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public abstract void Descricao();
        
    public String toString() {
     return "Tipo de Tecido: "+this.getTecido();
}
}
