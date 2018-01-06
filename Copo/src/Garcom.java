
public class Garcom {

   
    public static void main(String[] args) {
        Copo Cp1 = new Copo(500,200,"azul","plastico");
        Copo Cp2 = new Copo(300,300,"preto","metal");
        Copo Cp3 = new Copo(200,100,"rosa","porcelana");
        Copo Cp4 = new Copo(200,0,"transparente","vidro");
        
        
        Cp1.exibirInfo();
        Cp2.exibirInfo();
        Cp3.exibirInfo();
        Cp4.exibirInfo();
        
        System.out.println(" ");
        try{
         Cp2.encher();
        }catch(CopoCheioException e){
            System.out.println("Erro: "+e);
        }
        
        try{
         Cp2.encher();
        }catch(CopoCheioException e){
            System.out.println("Erro: "+e);
        }
        System.out.println(" ");
        try{
         Cp3.esvaziar();
        }catch(CopoVazioException e){
            System.out.println("Erro: "+e);
        }
        
        System.out.println(" ");
        try{
         Cp3.esvaziar();
        }catch(CopoVazioException e){
            System.out.println("Erro: "+e);
        }
        
    }
    
}
