/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Carro {

    public float Comsumo;
    public float qtdCombustivel;

    public Carro(float com, float qtdcomb) {
        Comsumo = com;
        qtdCombustivel = qtdcomb;
    }

    public float getNivelCombus() {
        return qtdCombustivel;
    }

    public void Andar(float distancia) {
        if (getNivelCombus() == 0) {
            System.out.println("Erro! Impossivel andar com o tanque vazio!!!");
        } else {
            qtdCombustivel = qtdCombustivel - (distancia / Comsumo);
        }
    }

    public void Abastecer(float qtdLitros) {

        qtdCombustivel = qtdCombustivel + qtdLitros;
    }

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        Carro ObjCarro = new Carro(17, 0);
        System.out.println("Testando a Classe Carro" + "\nPara andar abasteça o Carro \nInforme a quantidade de Combustivel a colocar no tanque(LITROS): ");
        ObjCarro.Abastecer(Entrada.nextFloat());
        System.out.println("Para Andar digite a distancia do percurso: km ");
        ObjCarro.Andar(Entrada.nextFloat());
        System.out.println("O Nivel de Combustivel após o percurso é: " + ObjCarro.getNivelCombus() + " Litros");

    }

}
