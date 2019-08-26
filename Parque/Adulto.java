
/**
 * Write a description of class Adulto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adulto extends Usuario
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Adulto
     */
    public Adulto(int edad, double altura, boolean VIP, boolean discapacidad, boolean estudiante, boolean carnet_joven)
    {
     super(edad,altura,VIP,discapacidad,estudiante,carnet_joven);
    }
    /**
     * Obtener descuento (metodo polimorfico despendiendo de la subclase
     * devuelve un porcentaje u otro)
     *
     * @return int descuento (porcentaje)
     */
    public int getDescuentoEdad(){
        
        return 0;
        
    }
    /**
     * Obtener descuento VIP(metodo polimorfico despendiendo de la subclase
     * devuelve un PRECIO u otro)
     *
     * @return double precio a sumar del pase VIP (euros)
     */
    public  double getPrecioVIP(){
        
        return BASE_VIP;
        
    }
    /**
     * Obtenemos el tipo de la subclase en forma de String
     *
     * @return String Tipo de la subclase
     */
    public  String getTipo(){
     return "Adulto";
    }
    

}
