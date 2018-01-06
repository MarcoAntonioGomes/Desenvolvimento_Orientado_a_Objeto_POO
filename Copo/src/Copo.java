public class Copo {

    private int capacidadeMax;
    private int capacidadeatual;
    private String Cor;
    private String material;
    boolean transbordou = false;
    boolean esvaziou = false;

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public Copo(int capacidadeMax, int capacidadeatual, String Cor, String material) {
        this.capacidadeMax = capacidadeMax;
        this.capacidadeatual = capacidadeatual;
        this.Cor = Cor;
        this.material = material;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public int getCapacidadeatual() {
        return capacidadeatual;
    }

    public void setCapacidadeatual(int capacidadeatual) {
        this.capacidadeatual = capacidadeatual;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void encher() throws CopoCheioException {
        if (this.transbordou != true) {
            this.setCapacidadeatual(this.getCapacidadeatual() + 100);
            if (this.getCapacidadeatual() > this.getCapacidadeMax()) {
                System.out.println("Transbordou");
                transbordou = true;
            }
        } else {
            throw new CopoCheioException();
        }

    }

    public void esvaziar() throws CopoVazioException {
        if (this.esvaziou != true) {
            this.setCapacidadeatual(this.getCapacidadeatual() - 100);
            if (this.getCapacidadeatual() == 0) {
                System.out.println("Secou");
                esvaziou = true;
            }
        }
        else{
            throw new CopoVazioException();
        }
            }

    

    public void exibirInfo() {
        System.out.println("O copo " + this.getCor() + " de " + this.getMaterial() + " armazena ate " + this.getCapacidadeMax() + "ml e atualmente contém  " + this.getCapacidadeatual() + "ml de líquido");
    }
}
