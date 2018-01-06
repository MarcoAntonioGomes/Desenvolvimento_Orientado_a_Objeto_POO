/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangulo;
import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class Triangulo {

    double LadoA;
    double LadoB;
    double LadoC;

    public double Calcular_Perimetro(double x, double y, double z) {
        return x + y + z;
    }

    public double Calcular_Area(double x, double y, double z) {
        double p;
        double a;

        p = (x + y + z) / 2;
       a =  Math.sqrt((p*((p - x) * (p - y) * (p - z))));
        return a;
    }

    public double Getladomaior(double x, double y, double z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        }
        else{
            return z;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       Triangulo ObjTriangulo = new Triangulo(); 
       System.out.println("Calculo do Perimetro - Area - Lado Maior de um triangulo\n ");
      System.out.print("Informe o tamanho do  LADO A do Triangulo em Cm: ");
       ObjTriangulo.LadoA = entrada.nextDouble();
       System.out.print("Informe o tamanho do LADO B do Triangulo em Cm: ");
       ObjTriangulo.LadoB = entrada.nextDouble();
       System.out.print("Informe o tamanho do LADO C do Triangulo: em Cm ");
       ObjTriangulo.LadoC = entrada.nextDouble();
       System.out.println("\n O perimêtro do Triangulo é: "+ObjTriangulo.Calcular_Perimetro(ObjTriangulo.LadoA,ObjTriangulo.LadoB,ObjTriangulo.LadoC)+"Cm");
       System.out.println("\n A área do Triangulo é: "+ObjTriangulo.Calcular_Area(ObjTriangulo.LadoA,ObjTriangulo.LadoB,ObjTriangulo.LadoC)+" Cm²");
       System.out.println("\n O Maior lado possuí: "+ObjTriangulo.Getladomaior(ObjTriangulo.LadoA,ObjTriangulo.LadoB,ObjTriangulo.LadoC)+ " Cm");
    }


}

