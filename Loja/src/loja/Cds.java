
package loja;


public class Cds extends Produto {
 
 private int QtdFaixas;
 
    public Cds(String nome, double preço, int QtdFaixas, int codigo) {
        super(nome, preço,codigo);
        this.QtdFaixas = QtdFaixas;
    }

    public int getQtdFaixas() {
        return QtdFaixas;
    }

    public void setQtdFaixas(int QtdFaixas) {
        this.QtdFaixas = QtdFaixas;
    }
 @Override
   public String toString(){
        System.out.println("Nome do CD: "+this.getNome());
        System.out.println("Preço R$: "+this.getPreço());
        System.out.println("Quantidade de Faixas: "+this.getQtdFaixas());
        return null;
     }
 
    
}
