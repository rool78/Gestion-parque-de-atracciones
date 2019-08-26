import java.io.Serializable;
/**
 * Write a description of class Entrada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public  class Entrada implements Serializable
{
    // instance variables - replace the example below with your own
    private double precio;
    private Usuario usuario;
    private int ID;
    static int nextID = 1;
    private Fecha fecha;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(double precio, Usuario usuario,Fecha fecha)
    {
        this.precio = precio;
        this.usuario = usuario;
        this.fecha = fecha;
        ID = nextID;
        nextID++;
        
    }
    /**
     * get Usuario
     */
    public Usuario getUsuario(){
        return usuario;
    }
   /**
     * get Precio
     */
    public double getPrecio(){
        return precio;
    }
    /**
     * get ID
     */
    public int getID(){
        return ID;
    }
    /**
     * get Fecha
     */
    public Fecha getFecha(){
        return fecha;
    }



}
