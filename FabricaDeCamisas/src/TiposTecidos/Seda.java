
package TiposTecidos;


public class Seda extends TipoDeTecido{

    public Seda() {
        super(" Seda ");
    }

    @Override
    public void Descricao() {
        System.out.println("O tecido de seda é conhecido pela sua maciez, brilho, beleza e luxuosa aparência. "
                + "É um dos tecidos mais caros e que oferece ao seu usuário conforto em qualquer estação do ano."
                + " Mantém o corpo fresco no verão e quente no inverno. É o tecido natural mais vendido em todo o mundo. ");
    }
    
}
