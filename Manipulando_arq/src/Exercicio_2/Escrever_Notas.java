package Exercicio_2;

import Exercicio_2.Escritor_notas;
import Gravacao.Escritor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Escrever_Notas {

    public static void main(String[] args) throws FileNotFoundException {
        String nome;
        double n1, n2;
        Scanner teclado = new Scanner(System.in);

        Escritor Novoarquivo;
        for (int i = 0; i < 5; i++) {
            FileOutputStream arquivo = new FileOutputStream("arquivo.txt", true);
            System.out.print("Digite o nome: ");
            nome = teclado.next();
            System.out.print("Digite a nota da primeira prova: ");
            n1 = teclado.nextDouble();
            System.out.print("Digite a nota da segunda prova: ");
            n2 = teclado.nextDouble();
            System.out.println("--------------------------------------------------");

            try {
                Novoarquivo = new Escritor_notas(nome, n1, n2, arquivo);
                Novoarquivo.gravar();
            } catch (Exception e) {
                System.out.println("Erro na escrita do arquivo");
            }

        }
       
        
    }

}
