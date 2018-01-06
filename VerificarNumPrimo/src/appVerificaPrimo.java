import java.util.InputMismatchException;
import java.util.Scanner;

public class appVerificaPrimo {

    public static void main(String[] args) throws maiorQueUmException {
        int numero = 0;
        Numero valor;
        String op = null;
        valor = new Numero();
        Scanner teclado = new Scanner(System.in);
        while ((!"sair".equals(op)) && (!"Sair".equals(op)) && (!"SAIR".equals(op))) {
            numero=0;
            valor.confirma=false;
            while (numero == 0 || valor.confirma == false) {
                System.out.println("                                                       ");
                System.out.print("Digite um numero: ");
                try {
                    numero = teclado.nextInt();
                    valor.verificaMaiorQueUm(numero);
                } catch (InputMismatchException e) {
                    System.out.println("Erro: dado inválido! " + teclado.next());

                } catch (maiorQueUmException a) {
                    System.out.println("Erro: o número deve ser maior que 1");

                }

            }
            valor.setNumero(numero);
            System.out.println("Resultado:                    " + valor.verifcaSeEPrimo());
            System.out.println("                                                       ");
            System.out.println("Deseja consultar mais numeros???");
            System.out.print("Digite qualquer caracter para continuar ou digite SAIR para terminar: ");
            op = teclado.next();
        }
    }

}
