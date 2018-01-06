
public class appLoveTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Filipe",20);
        Pessoa p2 = new Pessoa("Taina",18);
        
        LoveCalculator amor = new LoveCalculator();
        
        System.out.println("A Compatibilidade de "+p1.getNome()+" com "+p2.getNome()+" é :"+amor.calcularCompatibilidade(p1, p2)+"%");
        
    }
    
}
