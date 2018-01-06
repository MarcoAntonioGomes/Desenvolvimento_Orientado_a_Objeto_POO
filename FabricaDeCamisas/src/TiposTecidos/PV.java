
package TiposTecidos;


public class PV extends TipoDeTecido {

    public PV() {
        super("PV - Poliviscose");
    }
    

    @Override
    public void Descricao() {
        System.out.println("As maiores vantagens da malha PV é o fato das mesmas"
                + " \nserem mais agradáveis no clima frio e o fato de não ser necessário passa-las após a lavagem.");
    }
    
}
