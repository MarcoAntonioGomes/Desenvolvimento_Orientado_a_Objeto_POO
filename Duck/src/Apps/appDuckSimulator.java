
package Apps;
import ClassesDeVoo.NaoVoar;
import ClassesDeVoo.VoarComFoguete;
import ClassesDeVoo.Voocomasas;
import Classes_Grasnar.MuteQuack;
import Classes_Grasnar.Quack;
import Classes_Grasnar.Squeak;
import DuckSimulator.Duck;
import TiposDePatos.PatoCabeçaVermelha;
import TiposDePatos.PatoComun;
import TiposDePatos.Pato_borracha;
import TiposDePatos.Pato_marreco;
import java.util.Scanner;

public class appDuckSimulator {
    public static void main(String[] args) {
        int op;
        Duck P1 = new PatoComun();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("------------DuckSimulator-------------");
        System.out.println("Para Criar um pato escolha uma opção: ");
        System.out.println("1 - Criar Pato de Cabeça Vermelha ");
        System.out.println("2 - Criar Pato de Borracha ");
        System.out.println("3 - Criar Pato Marreco "); 
        System.out.println("Opção: "); 
        op = entrada.nextInt();
        switch(op){
            case 1: 
             P1 = new PatoCabeçaVermelha();
            break;
            case 2:
             P1 = new Pato_borracha();
            break;
            case 3:
             P1 = new Pato_marreco();
             break;
            default:
                System.out.println("Opção inválida!!!");
        }
        System.out.println("--------Testando Pato Criado -------------- ");
        System.out.println("Tipo de Pato: ");
        P1.display();
        System.out.println("Tipo de Voo: ");
        P1.performFly();
        System.out.println("Tipo de Grasnar:");
        P1.performQuack();
        
        System.out.println("------------- Alterando o Pato Criado ------------ ");
        System.out.println("Alterando o Tipo de Voo...");
        System.out.println("Escolha um novo tipo de Voo para o Pato: ");
        System.out.println("1 - Este Pato não Voa ");
        System.out.println("2 - Este Pato Voa com asas ");
        System.out.println("3 - Esta pato Voa com foguetes "); 
        System.out.println("Opção: "); 
        op = entrada.nextInt();
        switch(op){
            case 1: 
             P1.setVoo(new NaoVoar());
            break;
            case 2:
              P1.setVoo(new Voocomasas());
            break;
            case 3:
              P1.setVoo(new VoarComFoguete());
           
             break;
            default:
        System.out.println("Opção inválida!!!");
        }
        
        System.out.println("Alterando o Tipo da Grasnar...");
        System.out.println("Escolha um novo tipo de Grasnar: ");
        System.out.println("1 - Pato Mudo ");
        System.out.println("2 - Quack");
        System.out.println("3 - Squeak "); 
        System.out.println("Opção: "); 
        op = entrada.nextInt();
        switch(op){
            case 1: 
             P1.setGrasnar(new MuteQuack());
            break;
            case 2:
             P1.setGrasnar(new Quack());
            break;
            case 3:
            P1.setGrasnar(new Squeak());
             break;
            default:
                System.out.println("Opção inválida!!!");
        }  
        System.out.println("--------Testando Pato Alterado -------------- ");
        System.out.println("Tipo de Pato: ");
        P1.display();
        System.out.println("Tipo de Voo: ");
        P1.performFly();
        System.out.println("Tipo de Grasnar:");
        P1.performQuack();
        }
        
        
    }
    
    

