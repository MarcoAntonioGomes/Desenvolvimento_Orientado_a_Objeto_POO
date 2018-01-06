
package javaapplication22;


public class Projeto {
    public String nome_da_pessoa;
    public String projeto;

    public Projeto(String nome_da_pessoa, String projeto) {
        this.nome_da_pessoa = nome_da_pessoa;
        this.projeto = projeto;
    }

    public Projeto() {
    }
    
    
    public boolean verificaNome(int nome) throws HeitoException{
 
        if(nome != 1)
           return true;
        else
           throw  new HeitoException (); 
        
    }
    
}
