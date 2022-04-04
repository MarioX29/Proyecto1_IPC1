/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comida;

import Mascotas.Mascota;

/**
 *
 * @author MarioX27
 */
public class Comida {
    
    protected int ataque;
    protected int vida;

    public Comida(int ataque, int vida) {
        this.ataque = ataque;
        this.vida = vida;
    }
    Mascota mascota =  new Mascota();
    public int obtenerVida(){
    return mascota.getVida();
    }
    
    public int aumentoVida(){
    
      int vidaac=obtenerVida();  
      
    return vida+vidaac;
    }
    public void aplicarAumento(){
    
    mascota.setVida(aumentoVida());
    }
    
    
}
