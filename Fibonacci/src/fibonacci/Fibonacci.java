package fibonacci;

public class Fibonacci {
    public  int w[];
    public int n;
    boolean verifica;

    public Fibonacci() {
    }
    

    public Fibonacci(int n) {
        this.w = new int[n];
        this.n = n;
        this.w[0]=1;
        this.w[1]=1;
        
    }
     
     
    public int seqFibonacci(int n,int cont) {
          
        if (cont!=n) {
            w[cont] = w[cont - 1] + w[cont - 2]; 
            seqFibonacci(n,++cont);
        }
        return 0;
        
    }
    public void mostrarSeq(){
        System.out.println("Exibindo Sequencia de Fibonacci... ");
        for(int cont=0;cont<this.n;cont++){
            System.out.print(" "+w[cont]);
        }
        System.out.println(" ");
    }
    
    public void verificaNumero(int numero)throws NumerioInvalidoException{
       if((numero > 3)&&(numero < 92)){
           this.verifica = true;
       }
       else{
       throw new NumerioInvalidoException();
       }
    }
    
}
