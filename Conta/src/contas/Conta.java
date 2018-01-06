/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import classes.pessoa;
import excecoes.SaldoInsuficienteException;

/**
 * A classe <b>Conta</b> define um tipo abstrato para a criação da estrutura de classes bancárias.
 * @author Marco Antônio Gomes
 * @since Out 2016
 * @version 1.0
 */
public abstract class Conta {

    /**
     *O atributo número é usado para referenciar o número da conta.
     */
    protected int numero;

    /**
     *O atributo correntista , do tipo <b>Pessoa</b> é utilizado para referenciar um correntista.
     */
    protected pessoa correntista;                                 

    /**
     * O atributo saldo é usado para referenciar o saldo da conta.
     */
    protected double saldo;
    private static int numerodecontas;
    
    /**
     * Constante que define a operação de saque. 
     */
    public final static int SACAR = 0;

    /**
     * Constante que define a operação de depósito. 
     */
    public final static int DEPOSITAR = 1;
    
    /**
     * Construtor default da classe <b>Conta</b>.<br>
     * <b>uso:</b><br>
     * Conta conta = new ContaComun();<br><br>
     */
    public Conta(){
      incrementarContas();
    }
   /**
     * Construtor sobrecarregado da classe <b>Conta</b>.<br>
     * <b>uso:</b><br>
     * Conta conta = new ContaComun(102541, new pessoa("Fulano","14433344455"),150.00d);<br><br>
     * <b>onde</b><br>
     * @param numero inteiro que identifica o número da conta.
     * @param correntista objeto do tipo <b>Pessoa</b> que identifica o correntista da conta. 
     * @param saldo double que identifica o saldo da conta.
     */
    public Conta(int numero, pessoa correntista, double saldo) {
        this();
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }
    
     
    public final int getNumero(){
        return this.numero;
    }
    public final void setNumero (int numero){
        this.numero = numero;
    }

    public final pessoa getCorrentista() {
        return this.correntista;
    }

    public final void setCorrentista(pessoa correntista) {
        this.correntista = correntista;
    }

    public final double getSaldo() {
        return this.saldo;
    }

    public final void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public final void depositar(double dinheiros){
        this.setSaldo(this.getSaldo()+dinheiros);
        
    }
    public abstract void sacar(double dinheiros) throws SaldoInsuficienteException;
        
    public static void incrementarContas(){
        ++numerodecontas;
    }
    public int getNumeroContas(){
        return Conta.numerodecontas;
    }
    
   public void movimentar(double valor, int operacao)throws SaldoInsuficienteException{
      
       switch (operacao){
           case DEPOSITAR:
               this.depositar(valor);
               break;
           case SACAR:
                this.sacar(valor);
               break;
          
   }
    
   }
}
