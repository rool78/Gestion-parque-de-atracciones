
/**
 * Write a description of class RRPP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RRPP extends Trabajador
{
   

    /**
     * Constructor for objects of class RRPP
     */
    public RRPP(String nombre, String apellido, String DNI)
    {
         super(nombre, apellido, DNI);
    }
    public RRPP(){
        sueldo = getSueldo();
    }
    /**
     * Metodo polimorfico, devuelve el sueldo segun el trabajador
     * 
     * @return double sueldo (sueldo base mas el 20%)
     */
    public double getSueldo(){
        return SUELDO_BASE + (SUELDO_BASE * 0.20);
    }

}
