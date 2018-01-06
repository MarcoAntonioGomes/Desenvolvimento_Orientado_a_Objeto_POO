
public class Bicicleta {
    private String tipoderoda;
    private String Cor;
    private String tamanho;
    private String tipodebanco;

    public Bicicleta(String tipoderoda, String Cor, String tamanho, String tipodebanco) {
        this.tipoderoda = tipoderoda;
        this.Cor = Cor;
        this.tamanho = tamanho;
        this.tipodebanco = tipodebanco;
    }

    public String getTipoderoda() {
        return tipoderoda;
    }

    public void setTipoderoda(String tipoderoda) {
        this.tipoderoda = tipoderoda;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipodebanco() {
        return tipodebanco;
    }

    public void setTipodebanco(String tipodebanco) {
        this.tipodebanco = tipodebanco;
    }
    
    public void exibirInfo(){
        System.out.println("Bicicleta com roda do tipo "+this.getTipoderoda()+" na cor "+this.Cor+" de tamanho "+this.tamanho+" com o tipo de banco "+this.getTipodebanco());
    }
    
}
