import java.util.ArrayList;
/**
 * Clase principal del parque de atracciones.
 *
 * @author (Raul Maza)
 * @version (26/03/19)
 */
public class Parque
{
    // Instancias sin importancia para crear diseño clases (grafico)
    
    
    //Variables parque
    private Interfaz interfaz;
    private Serializadora serializador;

    /**
     * Constructor for objects of class Parque
     */
    public Parque()
    {
        
        interfaz = new Interfaz(); 
        serializador = new Serializadora();
     
       // if (serializador.leerObjeto("ficheroDatos.dat") != null){
       // interfaz = (Interfaz) serializador.leerObjeto("ficheroDatos.dat");
       //}
    }
    /**
     * main
     */
    public static void main (String [] args) {
        
        Parque parque = new Parque();
        
        parque.interfaz.menuPrincipal();
        
       // parque.serializador.escribirObjeto(parque.interfaz, "ficheroDatos.dat");
        
        

        }
}
