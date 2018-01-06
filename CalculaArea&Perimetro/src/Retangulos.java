
public class Retangulos extends Quadrilateros {

    public Retangulos(double base, double altura, double base2, double altura2) {
        super(base, altura, base2, altura2);
    }
    
    public double calculaArea(){
        return this.getLado1()*this.getLado2();
    }
    public String toString(){
        System.out.println("-- Dados da Figura --");
        System.out.println("Figura: Retangulo");
        System.out.println("Valor da base: "+this.getLado1()+" Cm");
        System.out.println("Valor da altura: "+this.getLado2()+"Cm ");
        return null;
    }
}
