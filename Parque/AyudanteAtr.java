
/**
 * Write a description of class AyudanteAtr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AyudanteAtr extends Trabajador
{
    

    /**
     * Constructor for objects of class AyudanteAtr
     */
    public AyudanteAtr(String nombre, String apellido, String DNI)
    {
         super(nombre, apellido, DNI);
    }
    public AyudanteAtr(){
        sueldo = getSueldo();
    }
    /**
     * Metodo polimorfico, devuelve el sueldo segun el trabajador
     * 
     * @return double sueldo
     */
    public double getSueldo(){
        return SUELDO_BASE;
    }

}
