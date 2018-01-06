
package fibonacci;


public class NumerioInvalidoException extends Exception {
     @Override
     public String toString(){
        return " A quantidade deve estar entre 3 e 92! "; 
    }
}
