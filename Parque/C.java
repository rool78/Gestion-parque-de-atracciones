
/**
 * Write a description of class C here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C extends Atraccion
{
    //Campos constantes atraccion
    private final int AYUDANTES = 3;
    private final int RESPONSABLES = 1;
    private final double MIN = -1;
    private final double MAX = 1.20;
    private final boolean VIP = false; 

    /**
     * Constructor for objects of class C
     */
    public C()
    {
    ayudantes = getAyudantes();
    responsables = getResponsables();
    altura_max = getAlturaMax();
    double altura_min = getAlturaMin();
    permiteVIP = getPermiteVIP(); 
    }
    /** 
     * Metodo para decir que subclases de usuario permite la atraccion
     */
    public   void usuariosPermitidos(){
        
    }
    /** 
     * getNumero ayudantes
     */
    public  int getAyudantes(){
        return AYUDANTES;
    }
    /** 
     * getNumero responsables
     */
    public  int getResponsables(){
        return RESPONSABLES;
    }
    /** 
     * get altura maxima
     */
    public  double getAlturaMax(){
        return MAX;
    }
    /** 
     * get altura minima
     */
    public  double getAlturaMin(){
        return MIN;
    }
    /** 
     * get permite VIP
     */
    public  boolean getPermiteVIP(){
        return VIP;
    }
}
