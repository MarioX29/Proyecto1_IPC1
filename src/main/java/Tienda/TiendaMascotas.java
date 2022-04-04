package Tienda;
import Mascotas.Mascota;
import Mascotas.Tier1.Caballo;
import Mascotas.Tier1.Castor;
import Mascotas.Tier1.Escarabajo;
import Mascotas.Tier1.Grillo;
import Mascotas.Tier1.Hormiga;
import Mascotas.Tier1.Mosquito;
import Mascotas.Tier1.Nutria;
import Mascotas.Tier1.Pescado;
import SuperAutoPets.Batalla;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author MarioX27
 */
public class TiendaMascotas {
    protected int oro=10;
         protected String nombreMascota;
         public String[] mascotas = new String[54];
         protected String[] compra = new String[5];
         protected Mascota[] Equipo = new Mascota[5];
          public TiendaMascotas(){
         mascotas[0]="Hormiga";
         mascotas[1]="Pescado";
         mascotas[2]="Mosquito";
         mascotas[3]="Grillo";
         mascotas[4]="Castor";
         mascotas[5]="Caballo";
         mascotas[6]="Nutria";
         mascotas[7]="Escarabajo";
         mascotas[8]="Sapo";
         mascotas[9]="Dodo";
         mascotas[10]="Elefante";
         mascotas[11]="Puerco Espin";
         mascotas[12]="Pavoreal";
         mascotas[13]="Rata";
         mascotas[14]="Zorro";
         mascotas[15]="Araña";
          mascotas[16]="Camello";
         mascotas[17]="Mapache";
         mascotas[18]="Jirafa";
         mascotas[19]="Tortuga";
         mascotas[20]="Caracol";
         mascotas[21]="Oveja";
         mascotas[22]="Conejo";
         mascotas[23]="Lobo";
         mascotas[24]="Buey";
         mascotas[25]="Canguro";
         mascotas[26]="Buho";
         mascotas[27]="Venado";
         mascotas[28]="Loro";
         mascotas[29]="Hipo";
         mascotas[30]="Delfin";
         mascotas[31]="Puma";
         mascotas[32]="Ballena";
         mascotas[33]="Ardilla";
         mascotas[34]="Llama";
         mascotas[35]="Foca";
         mascotas[36]="Jaguar";
         mascotas[37]="Escorpion";
         mascotas[38]="Rino";
         mascotas[39]="Mono";
         mascotas[40]="Cocodrilo";
         mascotas[41]="Vaca";
         mascotas[42]="Chompipe";
         mascotas[43]="Panda";
          mascotas[44]="Gato";
         mascotas[45]="Tigre";
         mascotas[46]="Serpiente";
         mascotas[47]="Mamut";
         mascotas[48]="Leopardo";
         mascotas[49]="Gorila";
         mascotas[50]="Pulpo";
         mascotas[51]="Mosca";
         mascotas[52]="Quetzal";
         mascotas[53]="Camaleon";
    }
        //imprimir lista de mascotas segun numero de tier
         Batalla batalla = new Batalla();
         public void imprimirMascotas(){    
          System.out.println("Lista de Mascotas:");
        for (int i =0 ; i < numeroMascotas(); i++) {           
            nombreMascota = mascotas[indiceAleatorio()];       
            System.out.println((i+1)+" "+nombreMascota);          
        }
}         
           public void comprarMascota(){             
               int i =0;         
              imprimirMascotas();
             Scanner sc = new Scanner(System.in);             
             if (oro>1){
             for (i= 0; i <numeroMascotas(); i++) {       
                 System.out.println("Oro: "+oro);
                 System.out.println("Ingrese nombre de la mascota");
                 compra[i]=sc.next();                  
                          oro=oro-3;
                 nombreMascota= compra[i];   
          }
             }
             else
             {
                     System.out.println("Oro Insuficiente");
             }
             
             System.out.println("Su equipo es");           
             for (int j = 0;  j< numeroMascotas(); j++) {
                 System.out.print(compra[j]+" ");   
                 System.out.println("");        
             }
         System.out.println("----------------------------");         
      generarMascota();
          }                   
               public void comprarMascotaCreativo(){             
               int i =0;         
              imprimirMascotas();
             Scanner sc = new Scanner(System.in);             
             for (i= 0; i <15; i++) {       
                 System.out.println("Ingrese nombre de la mascota");
                 compra[i]=sc.next();      
        
                 nombreMascota= compra[i];   
          }
             System.out.println("Su equipo es");           
             for (int j = 0;  j< numeroMascotas(); j++) {
                 System.out.print(compra[j]+" ");   
                 System.out.println("");        
             }
         System.out.println("----------------------------");         
      generarMascota();
          }                   
            public void generarMascota(){
                 
                for (int j = 0; j < numeroMascotas(); j++) {
                        if (compra[j].equalsIgnoreCase("Hormiga")){
                          Equipo[j]= new Hormiga();
                          Equipo[j].mostrar();
                }
                       else  if (compra[j].equalsIgnoreCase("Pescado")){                  
                             Equipo[j]=new Pescado();
                                 Equipo[j].mostrar();
                }
                         else  if (compra[j].equalsIgnoreCase("Mosquito")){
                             Equipo[j]=new Mosquito();
                             Equipo[j].mostrar();             
                }
                else  if (compra[j].equalsIgnoreCase("Grillo")){
                             Equipo[j]=new Grillo();
                           Equipo[j].mostrar();
                }    
                          else  if (compra[j].equalsIgnoreCase("Castor")){
                             Equipo[j]=new Castor();
                           Equipo[j].mostrar();
                }            else  if (compra[j].equalsIgnoreCase("Caballo")){
                             Equipo[j]=new Caballo();
                           Equipo[j].mostrar();
                }   
                                 else  if (compra[j].equalsIgnoreCase("Nutria")){
                             Equipo[j]=new Nutria();
                           Equipo[j].mostrar();
                }   
                                 else  if (compra[j].equalsIgnoreCase("Escarabajo")){
                             Equipo[j]=new Escarabajo();
                           Equipo[j].mostrar();
                }   
                        
 }         
//                for (Mascota mascota : Equipo) {
//                    System.out.println(mascota);
//                }
    } 
            //cambia el valor del rango, para presentar los valores
         //aleatorios que genera el metodo
            //indiceAleatorio()
         public int rangoTier(){
          int rango = 0;
             switch(batalla.noRonda()){
                  case 1:
                      rango=7;
                  break;
                  case 2 : case 3 :
                     rango =15;
                      break;
                  case 4: case 5: 
                      rango=26;
                      break;
                  case 6: case 7:
                      rango=34;
                      break;
                  case 8: case 9:
                     rango=42;
                      break;
                  case 10: case 11:
                      rango=51;
                      break;
                  case 12:
                  rango=54;
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
            //Establece el valor de mascotas, presentadas en tienda
            //y la longitud del arreglo Equipo[]
            public int numeroMascotas(){
                int animales=0;
                  switch(batalla.noRonda()){
                      case 1: case 2: case 3:
                          animales=3;
                         break;
                          case 4: case 5: case 6:
                          animales=4;
                         break;
                        
                          default: 
                              animales=5;
                  }
            return animales;
            }      
               public void escribirArchivo() {
             Scanner sc = new Scanner(System.in);
         comprarMascota(); 
         System.out.println("Ingrese un path a escribir");
        String path = sc.nextLine();
        File fileDestino = new File(path);
        try {
                     
            PrintWriter printer = new PrintWriter(fileDestino);
                 for (int i = 0; i <numeroMascotas() ; i++) {
                printer.println(
                        String.format(
                                "Nombre: %s, Ataque: %s, Vida: %s",
                                
                                Equipo[i].getNombre(),
                                Equipo[i].getAtaque(),
                                Equipo[i].getVida()
                        
                )
                );
            }
            printer.close();
            System.out.println("Se ha escrito con exito");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que desa escribir no existe");
        }
         }

   
               
}