
package loja;


public class appLojaTeste {

    public static void main(String[] args) {
        
       Produto VetProdutos[]= new Produto[5];
       VetProdutos[0] = new Cds("Jorge & Mateus",20,12,11111);
       VetProdutos[1] = new Livro("O Romance",15,"Filipe Soares",22222);
       VetProdutos[2] = new Dvds ("O Mestre",10,120,33333);
       VetProdutos[3] = new Cds("Piadas do Luan",15,50,44444);
       VetProdutos[4] = new Livro("Como fazer uma mulher se apaixonar",50,"Filipe Soares",55555);
      
       
        Produto Cd = new Cds("Jorge & Mateus",20,12,55555);
        Loja loja1 = new Loja(Cd,VetProdutos,5);
        
        System.out.println("--- Exibindos Produtos Cadastrados ---");
       for(int i=0; i<5;i++){
           System.out.println("-------------------------------------------------");
           VetProdutos[i].toString();
       }
        System.out.println(" ");
       System.out.println("--- Buscando Produtos Cadastrados ---");
       loja1.buscaProdutos();
       
       java.util.Arrays.sort(VetProdutos);
        System.out.println(" ");
       System.out.println("--- Exibindos Produtos depois de Ordenado por Preço R$ ---");
       for(int i=0; i<5;i++){
           System.out.println("-------------------------------------------------");
           VetProdutos[i].toString();
       }
       
    }
    
}
