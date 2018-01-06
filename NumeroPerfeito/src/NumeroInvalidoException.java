
public class NumeroInvalidoException extends Exception {
      @Override
      public String toString(){
        return " A quantidade deve ser maior que 0 e menor que  32767!"; 
    }
}
