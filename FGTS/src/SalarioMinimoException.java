
public class SalarioMinimoException extends Exception {
    @Override
    public String toString(){
        return "O salário deve ser igual ou superior ao salário minímo"; 
    }
}
