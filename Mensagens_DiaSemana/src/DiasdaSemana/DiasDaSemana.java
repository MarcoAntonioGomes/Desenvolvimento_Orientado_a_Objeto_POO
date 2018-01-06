package DiasdaSemana;


public abstract class DiasDaSemana implements Mensagem{
   public String dia;
   public String Mensagem;

  

    public String getDia() {
        return dia;
    }

    public String getMensagem() {
        return Mensagem;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }
   
   
    @Override
    public  String mensagem() {
        return Mensagem;
    }
    
    
}
