package runpingpong;

public class RunPingPong implements Runnable {

    private String palavra;
    private int delay;

    public RunPingPong(String oQueFalar, int tempoDelay) {
        this.palavra = oQueFalar;
        this.delay = tempoDelay;
    }

    @Override
    public void run() {
        try{
            for (;;) {
                System.out.println(palavra + " ");
                Thread.sleep(delay);
            }
            }catch(Exception e){
                System.err.println("Erro");
                return;
                }
        }
    

    public static void main(String[] args) {
        Runnable ping = new RunPingPong("ping", 500);
        Runnable pong = new RunPingPong("pong", 1000);
        new Thread(ping).start();
        new Thread(pong).start();
    }

}
