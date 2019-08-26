
/**
 * Write a description of class AtencionAlCliente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AtencionAlCliente extends Trabajador
{
 
    /**
     * Constructor for objects of class AtencionAlCliente
     */
    public AtencionAlCliente(String nombre, String apellido, String DNI)
    {
         super(nombre, apellido, DNI);
    }
    public AtencionAlCliente(){
        sueldo = getSueldo();
    }
    /**
     * Metodo polimorfico, devuelve el sueldo segun el trabajador
     * 
     * @return double sueldo (sueldo base mas el 10%)
     */
    public double getSueldo(){
        return SUELDO_BASE + (SUELDO_BASE * 0.10);
    }

}
