package Mascotas;

/**
 *
 * @author MarioX27
 */
public class Mascota {
    protected String nombre;
    protected int ataque;
    protected int vida;
    protected int habilidad;
    protected String tipo;
    protected String efectoactivo; 
    protected int nivel;
    protected int tier;
    public Mascota() {

    }

    public Mascota(String nombre, int ataque, int vida, int habilidad, String tipo, String efectoactivo, int nivel, int tier) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.habilidad = habilidad;
        this.tipo = tipo;
        this.efectoactivo = efectoactivo;
        this.nivel = nivel;
        this.tier = tier;
    }
    	public void mostrar(){
		System.out.println("Nombre: "+nombre+" Nivel: "+nivel+" Vida: "+vida+" Tipo: "+tipo+" Nivel: "+nivel+" Tier: "+tier);
       
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }
    
    
  public int Ataque(){
    return ataque+habilidad;
    }                      
    public void daño_recibido(int salud){
            this.vida-=salud;
	}         
           public int verVida() {
        return vida;
    }
}
