
package threads;


public class Threads_mostraNumeros implements Runnable {
  private int id;
  private int delay;

    public Threads_mostraNumeros(int id, int delay) {
        this.id = id;
        this.delay = delay;
    }
   
  
    @Override
    public void run() {
        try{
            for(int i=0;i<10000;i++){
                System.out.println("Programa "+id+" :"+i);
                Thread.sleep(delay);
            }
                    
        }catch(Exception e){
            System.err.println("Erro");
            return;
        }
        
        
    }
     public static void main(String[] args) {
        Runnable T1 = new Threads_mostraNumeros (1,2000);
        Runnable T2 = new Threads_mostraNumeros (2,1000);
        new Thread(T1).start();
        new Thread(T2).start();
    }
}
