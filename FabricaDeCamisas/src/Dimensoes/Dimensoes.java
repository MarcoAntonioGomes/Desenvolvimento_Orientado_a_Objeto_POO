
package Dimensoes;


public abstract class  Dimensoes {
    private String nomeTamanho;
    private int tamOmbro, tamBarra, tamPeito, altura, QtdCamisa;
    
    public Dimensoes(String nomeTamanho, int qtd) {
        this.nomeTamanho = nomeTamanho;  
        this.QtdCamisa = qtd;
    }

    public int getTamOmbro() {
        return tamOmbro;
    }

    public int getTamBarra() {
        return tamBarra;
    }

    public int getTamPeito() {
        return tamPeito;
    }

    public int getAltura() {
        return altura;
    }

    public int getQtdCamisa() {
        return QtdCamisa;
    }
    
   
    
    public Dimensoes(String nomeTamanho,int tamOmbro, int tamBarra, int tamPeito, int altura, int quant) {
        this.nomeTamanho = nomeTamanho;
        this.tamOmbro = tamOmbro;
        this.tamBarra = tamBarra;
        this.tamPeito = tamPeito;
        this.altura = altura;
        this.QtdCamisa = quant;
    }
    
    public String getNomeTamanho() {
        return nomeTamanho;
    }
    

 

   
     public String toString() {
   return "\n-------------------------\n Dimensoes: \n Modelo: "+getNomeTamanho()+"\n Medida no Ombro (cm): "+getTamOmbro()+"\n Medida da Barra:(cm) "+getTamBarra()+""
           + "\n Medida do Peito (cm): "+getTamPeito()+"\n Altura (cm): "+getAltura();

  }    
}
