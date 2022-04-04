/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperAutoPets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author MarioX27
 */
public class LecturaVersus {

    public LecturaVersus() {
        
        
       
}
  public void leer(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el path del archivo");
        String path = sc.nextLine();
        File file = new File(path);
        try {
            Scanner scArchivo = new Scanner(file);
            while (scArchivo.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(String.format("Nombre: %s, Vida: %s", linea, linea.length()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
  
  }
  

        
        
    }

        