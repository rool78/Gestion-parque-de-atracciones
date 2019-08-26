
/**
 * Write a description of class ResponsableAtr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResponsableAtr extends Trabajador
{
    

    /**
     * Constructor for objects of class ResponsablesAtr
     */
    public ResponsableAtr(String nombre, String apellido, String DNI)
    {
         super(nombre, apellido, DNI);
    }
    public ResponsableAtr(){
        sueldo = getSueldo();
    }
    /**
     * Metodo polimorfico, devuelve el sueldo segun el trabajador
     * 
     * @return double sueldo (sueldo base mas el 15%)
     */
    public double getSueldo(){
        return SUELDO_BASE + (SUELDO_BASE * 0.15);
    }


}
