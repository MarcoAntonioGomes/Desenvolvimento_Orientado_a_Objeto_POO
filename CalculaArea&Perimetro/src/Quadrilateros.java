
public abstract class Quadrilateros {
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    public Quadrilateros(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

   
    public double calculaPerimetro(){
        return this.lado1+this.lado2+this.lado3+this.lado4;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getLado4() {
        return lado4;
    }
     
    
}
