
import DiasdaSemana.DiasDaSemana;
import DiasdaSemana.Domingo;
import DiasdaSemana.QuartaFeira;
import DiasdaSemana.QuintaFeira;
import DiasdaSemana.Sabado;
import DiasdaSemana.SegundaFeira;
import DiasdaSemana.SextaFeira;
import DiasdaSemana.TercaFeira;
import java.util.Scanner;


public class appExibeMensagem {

    
    public static void main(String[] args) {
     DiasDaSemana dia1 = new Sabado("traz pinga pra nos Beber");
     DiasDaSemana dia2 = new Domingo("como é bom Dormir!"); 
     DiasDaSemana dia3 = new SegundaFeira("pior dia da Semana");     
     DiasDaSemana dia4 = new TercaFeira(" que preguiça");     
     DiasDaSemana dia5 = new QuartaFeira("chegue logo domingo");     
     DiasDaSemana dia6 = new QuintaFeira("compre a Cachaça que o fds ta chegando...");     
     DiasDaSemana dia7 = new SextaFeira("e o dia mais esperado da semana chegou!!!");
     
        System.out.println("Hojé é "+dia1.getDia()+" "+dia1.getMensagem());
        System.out.println("Hojé é "+dia2.getDia()+" "+dia2.getMensagem());
        System.out.println("Hojé é "+dia3.getDia()+" "+dia3.getMensagem());
        System.out.println("Hojé é "+dia4.getDia()+" "+dia4.getMensagem());
        System.out.println("Hojé é "+dia5.getDia()+" "+dia5.getMensagem());
        System.out.println("Hojé é "+dia6.getDia()+" "+dia6.getMensagem());
        System.out.println("Hojé é "+dia7.getDia()+" "+dia7.getMensagem());
}

}
