/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3;

/**
 *
 * @author sistemas
 */
public abstract class Pato {
    Volable volable;
    Cuaqueable cuaqueable;
    
    
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
