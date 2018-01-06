/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_grafica_aula_1;
import javax.swing.JFrame;
/**
 *
 * @author Marco
 */


public class Interface_Grafica_Aula_1 extends JFrame{
    public Interface_Grafica_Aula_1 (String titulo){
    super(titulo);
    this.setSize(400,400);;
    this.setVisible(true);
    }
    public static void main(String[] args) {
    Interface_Grafica_Aula_1 tela = new Interface_Grafica_Aula_1("POOE II");
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}