
public class Circulo  implements Geometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaPerimetro() {
        return (2*3.14)*(this.getRaio());
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calculaArea() {
        return (3.14)*(this.raio*this.raio);
    }
    
    public String toString(){
        System.out.println("-- Dados da Figura --");
        System.out.println("Figura: Circulo");
        System.out.println("Valor do raio: "+this.getRaio()+ " Cm");
        return null;
    }
    
}
