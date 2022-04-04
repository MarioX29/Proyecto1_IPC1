/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperAutoPets;
import Tienda.TiendaComida;
import Tienda.TiendaMascotas;
import java.util.Scanner;

/**
 *
 * @author MarioX27
 */
public class Juego {
    private Scanner scanner = new Scanner(System.in);
    private int opcion;
    LecturaVersus lectura = new LecturaVersus();
    public void mostrarMenu(){
      System.out.println("SUPER AUTO PETS");
        System.out.println("*Musica de fondo");
        System.out.println("1.-Modo Arena:");
        System.out.println("2.-Modo Versus:");
        System.out.println("3.-Modo Creativo:");
        System.out.println("4.-Salir del Juego ");
        
          
        opcion = scanner.nextInt();
        {
        
           switch (opcion) {
            case 1:    
                      System.out.println("Modo Arena");
                      menuBatallas();                  
                break;
            case 2:
                System.out.println("Modo Versus");
                            menuBatallas();
                            
                break;
            case 3:
                System.out.println("Modo Creativo");
                    menuBatallas();
                break;
            case 4:
                System.out.println("Adios...");
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
}
    } 
    public void menuBatallas(){
        
        
        
        
        int op;
        do {
 
          System.out.println("1.- Comprar Mascotas");
        System.out.println("2.- Comprar Comida");
        System.out.println("3.- Cambiar Orden");
        //aumentar el nivel de la mascota
        System.out.println("4.- Fusionar");
        //se recibe el oro conforme el nivel de la mascota
        System.out.println("5.- Vender");
 
        System.out.println("6.- Empezar Batalla");
      
               if (opcion==2){
            System.out.println("7.- Escribir Archivo");
                   System.out.println("8.- Leer Archivo");
        }
                 System.out.println("9.- Atras");
         op = scanner.nextInt();
        TiendaMascotas tMascota = new TiendaMascotas();
        TiendaComida tComida = new TiendaComida();
       switch(op){
               case 1:                
                   if(op==0)
                   {
                       tMascota.comprarMascotaCreativo();
                   }
                   else{
                   
                   tMascota.comprarMascota(); 
                   }
             
               break;
               case 2:
                   System.out.println("Comprar Comida");
                       tComida.comprarComida();
                   break;
               case 3:
                   System.out.println("Cambiar Orden");
                   tComida.toString();
                    break;                   
               case 4:
                   System.out.println("Fusion");
                   break;
               case 5:
                   System.out.println("Vender");
                   break;
               case 6:
                   System.out.println("Batallaa");
                   break;
               case 7:
                    System.out.println("Escribir Archivo");
                   tMascota.escribirArchivo();
                  
                   break;
               case 8:  
                   System.out.println("Leer Archivo");
                  lectura.leer();
                  
                   break;
               case 9:
                    mostrarMenu();
                    break;
                  
       }
        } while (op!=6);
     
    }
}