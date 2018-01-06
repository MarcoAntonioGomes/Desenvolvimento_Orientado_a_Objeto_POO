
public class DVD {
   //Obs DVD Musical
    private String nomedocantor;
    private int ano;
    private int numerodefaixas;
    private float preço;

    public String getNomedocantor() {
        return nomedocantor;
    }

    public void setNomedocantor(String nomedocantor) {
        this.nomedocantor = nomedocantor;
    }

    public DVD() {
    }

    public DVD(String nomedocantor, int ano, int numerodefaixas, float preço) {
        this.nomedocantor = nomedocantor;
        this.ano = ano;
        this.numerodefaixas = numerodefaixas;
        this.preço = preço;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumerodefaixas() {
        return numerodefaixas;
    }

    public void setNumerodefaixas(int numerodefaixas) {
        this.numerodefaixas = numerodefaixas;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
    
    public void exibirInfo(){
        System.out.println("Nome do Cantor: "+this.getNomedocantor());
        System.out.println("Ano do DVD: "+this.getAno());
        System.out.println("Numero de Faixas: "+this.getNumerodefaixas());
        System.out.println("Preço R$: "+this.getPreço());
    }
}
