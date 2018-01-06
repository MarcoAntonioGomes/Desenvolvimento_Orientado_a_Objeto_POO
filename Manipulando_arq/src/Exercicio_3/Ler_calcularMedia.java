package Exercicio_3;

import Exercicio_3.Ler_calcular_media;
import Leitura.Leitor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ler_calcularMedia {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream notas = new FileOutputStream("notas.txt", true);
        FileInputStream arq = new FileInputStream("arquivo.txt");
        Leitor ler_notas;

        try {
            ler_notas = new Ler_calcular_media(arq, notas);
            ler_notas.ler();

        } catch (IOException e) {
            System.out.println("Erro na escrita do arquivo");
        }
        System.out.println("GRAVAÇÃO REALIZADA COM SUCESSO!!!");
    }

}
