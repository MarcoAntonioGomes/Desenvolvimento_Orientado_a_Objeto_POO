
public class LoveCalculator {
    
    public int calcularCompatibilidade(Pessoa p1, Pessoa p2){
        int k;
        k = ((p1.getNome().length()+p1.getIdade())-(p2.getNome().length()+p2.getIdade()));
        if(k<0){
            k = k*(-1);
        }
        return 100-k;
    }
            
}
