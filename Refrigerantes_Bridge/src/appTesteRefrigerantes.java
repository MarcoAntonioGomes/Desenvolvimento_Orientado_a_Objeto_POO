
public class appTesteRefrigerantes {

  
    public static void main(String[] args) {
        Refrigerante NovoRefri; 
        Marca NovaMarca; 
        Tamanho NovoTam;
        
        NovaMarca = new CocaCola();
        NovoTam = new Grande();
        
        NovoRefri = new Refrigerante(NovaMarca, NovoTam);
        
        System.out.println("Refrigerante Criado: "+NovoRefri.getMarca().toString());
        System.out.println("Tamanho: "+NovoRefri.getTamanho());
        System.out.println("Capcidade em Litros: "+NovoRefri.getTamanho().getCapacidade());
        
        
    }
    
}
