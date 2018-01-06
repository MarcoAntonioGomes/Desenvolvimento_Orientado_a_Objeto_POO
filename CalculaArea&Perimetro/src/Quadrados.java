
public class Quadrados extends Quadrilateros{
 

    public Quadrados(double lado1, double lado2, double lado3, double lado4) {
        super(lado1, lado2, lado3, lado4);
        
    }
   public double calculaArea(){
        return this.getLado1()*this.getLado2();
    }
    public String toString(){
        System.out.println("-- Dados da Figura --");
        System.out.println("Figura: Quadrado");
        System.out.println("Valor do lado: "+this.getLado1()+ " Cm");
        return null;
    }
    
}
