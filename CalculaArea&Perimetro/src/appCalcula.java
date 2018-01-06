import java.util.Scanner;

public class appCalcula {

    public static void main(String[] args) {
        int quant_formas = 0;
        int op;
        double lado, altura, base, raio;

        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Calculando Area e Perimetro de Figuras Geometricas ---");
        System.out.print("Quantas Figuras deseja-se calcular: ");
        quant_formas = teclado.nextInt();
        Object VetGeome[] = new Object[quant_formas];

        for (int i = 0; i < quant_formas; i++) {
            System.out.println("--- Escolha a Figura ---");
            System.out.println("1-Quadrado");
            System.out.println("2-Retangulo");
            System.out.println("3-Circulo");
            System.out.print("Digite sua Opção: ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Digite o Valor do lado do quadrado em Cm: ");
                    lado = teclado.nextDouble();
                    VetGeome[i] = new Quadrados(lado, lado, lado, lado);
                    break;
                case 2:
                    System.out.print("Digite a base do retangulo em Cm: ");
                    base = teclado.nextDouble();
                    System.out.print("Digite a altura do retangulo em Cm: ");
                    altura = teclado.nextDouble();
                    VetGeome[i] = new Retangulos(base, altura, base, altura);
                    break;
                case 3: 
                    System.out.print("Digite o raio do circulo em Cm: ");
                    raio = teclado.nextDouble();
                    VetGeome[i] = new Circulo(raio);
                 break;
                default:
                    System.out.println("Opção inválida...");
                           
            }

        }
        
        System.out.println("---Exibindos Dados das Figuras Informadas---");
        for (int i = 0; i < quant_formas; i++) {
            if(VetGeome[i] instanceof Quadrados){
               VetGeome[i].toString();
               Quadrados quad = (Quadrados)VetGeome[i];
                System.out.println("Perimetro: "+quad.calculaPerimetro()+" Cm");
                System.out.println("Area: "+quad.calculaArea()+ " Cm^2");
            }
            if(VetGeome[i] instanceof Retangulos){
                VetGeome[i].toString();
                Retangulos ret = (Retangulos)VetGeome[i];
                System.out.println("Perimetro: "+ret.calculaPerimetro()+" Cm");
                System.out.println("Area: "+ret.calculaArea()+ " Cm^2");
            }
            if(VetGeome[i] instanceof Circulo){
                VetGeome[i].toString();
                Circulo cir = (Circulo)VetGeome[i];
                System.out.println("Perimetro: "+cir.calculaPerimetro()+" Cm");
                System.out.println("Area: "+cir.calculaArea() + " Cm^2");
            }
        }

    }

}
