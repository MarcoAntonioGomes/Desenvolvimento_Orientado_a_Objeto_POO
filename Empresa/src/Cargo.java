
public abstract class Cargo {
    public double salario;
    public Imposto imposto;

    public Cargo(double salario, Imposto imposto) {
        this.salario = salario;
        this.imposto = imposto;
    }
    

  
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
