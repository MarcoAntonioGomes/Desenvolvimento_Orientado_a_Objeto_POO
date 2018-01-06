
package loja;

public class Loja {
  private Produto prod;
  private Produto VetProdutos[];
  private int QtdProdutos;

    public Loja(Produto prod, Produto VetProdutos[], int QtdProdutos) {
        this.prod = prod;
        this.VetProdutos = VetProdutos;
        this.QtdProdutos = QtdProdutos;
    }
    
    public void buscaProdutos(){
        int achou = 0;
        for (int i = 0; i < this.QtdProdutos; i++) {
            if(prod.equals(VetProdutos[i])){
                System.out.println(" O Produto pesquisado foi encontrado na posição "+i+" do vetor");  
                achou=1;
            }
            
        }
        if(achou == 0){
        System.out.println("O Produto pesquisado não foi encontrado...");
        }
    }
    
}
