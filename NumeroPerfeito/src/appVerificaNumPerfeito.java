import java.util.InputMismatchException;
import java.util.Scanner;

public class appVerificaNumPerfeito {

    public static void main(String[] args) {
        NumeroPerfeito n;
        n = new NumeroPerfeito();
        int num = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Verificando se um numero é perfeito...");
        System.out.print("Digite um numero maior que 0 e menor que 32767: ");
        try {
            num = teclado.nextInt();
            n.verificaNum(num);
        } catch (NumeroInvalidoException e) {
            System.out.println("Erro: " + e);

        } catch (InputMismatchException e) {
            System.out.println("Erro: O Valor inserido é inválido");
        }
        if (n.isVerifica() == true) {
            n = new NumeroPerfeito(num);
            if (n.verificaNumeroPerfeito() == true) {
                System.out.println("O numero digitado é Perfeito");
            }
            else{
                System.out.println("o numero digitado não é Perfeito");
            }
        }

    }

}
