
package TiposTecidos;


public class Algodao extends TipoDeTecido{

    public Algodao() {
        super("Algodão");
 
    }

    @Override
    public void Descricao() {
       System.out.println(" DESCRIÇÃO DO TECIDO: \n Tem boa aceitação da estampa e é confortável.\n D"
               + "evido ao seu ótimo custo/benefício é bastante \n utilizada para eve"
               + "ntos, como brinde para empresas, turmas e faculdades.");
    }
    
}
