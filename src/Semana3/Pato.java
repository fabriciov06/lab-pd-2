package Semana3;

public abstract class Pato {
    protected Volable volable;
    protected Cuaqueable cuaqueable;
    
    
    public void setVolable(Volable fb) {
        this.volable = fb;
    }

    public void setCuaqueable(Cuaqueable qb) {
        this.cuaqueable = qb;
    }
    
    public abstract void  mostrar();
    public void RealizarVuelo(){
        volable.volar();
    }
    public void RealizarCuaqueo(){
        cuaqueable.cuaquear();
    }
    
    public void nadar(){
        System.out.println("TODOS LOS PATOS NADAN");
    }
}
