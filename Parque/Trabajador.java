
/**
 * Write a description of class Trabajador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class  Trabajador extends Persona
{
    protected double sueldo;
    protected final double SUELDO_BASE = 950;

    /**
     * Constructor for objects of class Trabajador
     */
    public Trabajador(String nombre, String apellido, String DNI)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }
    public Trabajador(){
        sueldo=getSueldo();
    }
    /**
     * Metodo polimorfico, devuelve el sueldo segun el trabajador
     * 
     * @return double sueldo
     */
    public abstract double getSueldo();

}
