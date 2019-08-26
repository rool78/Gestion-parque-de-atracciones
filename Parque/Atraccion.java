import java.util.ArrayList;
/**
 * Clase atraccion.
 *
 * @author (Raul Maza)
 * @version (09/04/19)
 */
public abstract class Atraccion
{
    protected int ayudantes;
    protected int responsables;
    protected double altura_max;
    protected double altura_min;
    protected boolean permiteVIP;

    /**
     * Constructor for objects of class Atraccion
     */
    public Atraccion()
    {   
    }
    /** 
     * Metodo para decir que subclases de usuario permite la atraccion
     */
    public abstract  void usuariosPermitidos();
    /** 
     * getNumero ayudantes
     */
    public abstract int getAyudantes();
    /** 
     * getNumero responsables
     */
    public abstract int getResponsables();
    /** 
     * get altura maxima
     */
    public abstract double getAlturaMax();
    /** 
     * get altura minima
     */
    public abstract double getAlturaMin();
    /** 
     * get permite VIP
     */
    public abstract boolean getPermiteVIP();
   
}
