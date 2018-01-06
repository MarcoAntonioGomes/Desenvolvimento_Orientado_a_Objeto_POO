
public class appTesteEmpresa {

  
    public static void main(String[] args) {
        Cargo Func;
        Func = new DBA(2001,new Imposto10_15_porc());
       
        
        System.out.println("Salario do Funcionário.......:"+ Func.getSalario());
        System.out.println("Imposto............: " + Func.imposto.calcularImposto(Func));
        
        
    }
    
}
