package Semana3;

public class SimPato {
    public static void main(String[] args) {
        
        PatoReal p1 = new PatoReal();
        p1.mostrar();
        p1.RealizarCuaqueo();
        p1.RealizarVuelo();
        p1.nadar();
               
        PatoCabezaRoja p2 = new PatoCabezaRoja();
        p2.mostrar();
        p2.RealizarCuaqueo();
        p2.RealizarVuelo();
        p2.nadar();
        
        PatoDeGoma p3 = new PatoDeGoma();
        p3.mostrar();
        p3.RealizarCuaqueo();
        p3.RealizarVuelo();
        p3.nadar();
        
        PatoSenuelo p4 = new PatoSenuelo();
        p4.mostrar();
        p4.RealizarCuaqueo();
        p4.RealizarVuelo();
        p4.nadar();
        
        
    
        
    }
    
}
