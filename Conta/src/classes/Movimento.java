
package classes;

import contas.Conta;
import excecoes.SaldoInsuficienteException;
import java.util.Date;


public class Movimento {
    
    private Date data;
    private Conta conta;
    private String historico;
    private double valor;
    private double saldoanterior;
    private int operacao;
    
    public Movimento(Date data, Conta conta, String historico, double valor, int operacao){
        this.conta = conta;
        this.historico = historico;
        this.valor=valor;
        this.operacao=operacao;
        this.data=data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldoanterior() {
        return saldoanterior;
    }

    public void setSaldoanterior(double saldoanterior) {
        this.saldoanterior = saldoanterior;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }
    
    public boolean movimentar()throws SaldoInsuficienteException{
        this.saldoanterior = conta.getSaldo();
        if(operacao == Conta.SACAR){
            this.conta.movimentar(this.valor, Conta.SACAR);
            return true;
        }else
            if(operacao == Conta.DEPOSITAR){
                this.conta.movimentar(this.valor, Conta.DEPOSITAR);
                return true;
        }
        return false;
    }
    
}
