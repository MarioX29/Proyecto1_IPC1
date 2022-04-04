package Tienda;
import SuperAutoPets.Batalla;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author MarioX27
 */
public class TiendaComida {
    protected String nombreComida;
         protected String[] Comida;
         public String[]  comida = new String[18];
         String[] compraComida = new String[5];
          //imprimir lista de mascotas segun numero de tier
         Batalla batalla = new Batalla();
         
         public TiendaComida(){
            comida[0]="Manzana";
            comida[1]="Naranja";
            comida[2]="Miel";
            comida[3]="Pastelito";
            comida[4]="HuesoCarne";
            comida[5]="Pastilla";
            comida[6]="Ajo";
            comida[7]="Ensalada";
            comida[8]="Enlatada";
            comida[9]="Pera";
            comida[10]="Chile";
            comida[11]="Chocolate";
            comida[12]="Sushi";
            comida[13]="Melon";
            comida[14]="Hongo";
            comida[15]="Pizza";
            comida[16]="Carne";
            comida[17]="Gelatina";
         }
    
         public void imprimirComida(){
             System.out.println("Lista de comida");
             for (int i = 0; i < 2; i++) {
                 nombreComida= comida[indiceAleatorio()];
                 System.out.println(nombreComida);
             }
         }
         public void comprarComida(){
             int i =0;
             imprimirComida();
             Scanner sc= new Scanner(System.in);
             for (int j = 0; j < 2; j++) {
                 System.out.println("Ingrese nombre de la comida");
                 compraComida[i]=sc.next();
                nombreComida=compraComida[i];      
             }  
             System.out.println("A que mascota quiere aplicar:");
            
                 
             }
      
         
            //cambia el valor del rango, para presentar los valores
         //aleatorios que genera el metodo
            //indiceAleatorio()
         public int rangoTier(){
          int rango = 0;
             switch(batalla.noRonda()){
                  case 1:
                      rango=3;
                  break;
                  case 2 : case 3 :
                     rango =6;
                      break;
                  case 4: case 5: 
                      rango=10;
                      break;
                  case 6: case 7:
                      rango=13;
                      break;
                  case 8: case 9:
                     rango=15;
                      break;
                  case 10: case 11:
                      rango=17;
                      break;
                  case 12:
                  rango=18;
                      break;
          }
                   return rango;
          }
                 //se genera un indice aleatorio para 
            //el arreglo de mascotas que se presentan en tienda
            //el indice no se debe repetir, se crea una condicional
            public int indiceAleatorio(){
                int cantidad=5;
                int j=0;        
                int valorAleatorio=0;
            int arreglo[] =  new int[cantidad];
                    arreglo[j]=(int)(Math.random()*rangoTier());
                    for (j = 1; j < cantidad; j++) {
                    arreglo[j]=(int)(Math.random()*rangoTier());
                        for (int k = 0; k < j; k++) {
                            if (arreglo[j]==arreglo[k]) {
                                j--;
                            }   
                        }
                }
                for (int i = 0; i < cantidad; i++) {
                    valorAleatorio= arreglo[i];
                }
                return valorAleatorio;
            }    
}
