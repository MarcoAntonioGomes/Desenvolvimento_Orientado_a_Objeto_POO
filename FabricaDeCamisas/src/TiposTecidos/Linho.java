
package TiposTecidos;


public class Linho extends TipoDeTecido{

    public Linho() {
        super("Linho");
    }

    @Override
    public void Descricao() {
        System.out.println("Tem a vantagem de ser composto de fibras naturais,"
                + " \nas camisas de linho são perfeitas para os dias de calor,\n pois absorvem bem o suor"
                + " permitindo que o corpo “respire”. Combina melhor com looks casuais e despojados. "
                + "Ao contrário do algodão, retém bem as cores.");
    }
    
}
