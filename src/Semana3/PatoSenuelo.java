package Semana3;

public class PatoSenuelo extends Pato{
    
    public void PatoSenuelo(){
        volable= new NoVuela();
        cuaqueable= new CuaqueoMudo();
    }
    
     @Override
     public void mostrar() {
     System.out.println("Yo soy PATO SEÑUELO");  
     
     }
     
}
