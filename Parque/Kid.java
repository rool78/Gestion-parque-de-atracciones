
/**
 * Write a description of class Kid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kid extends Usuario
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Kid
     */
    public Kid(int edad, double altura, boolean VIP, boolean discapacidad, boolean estudiante, boolean carnet_joven)
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
        
        return 50;
        
    }
       /**
     * Obtener descuento VIP(metodo polimorfico despendiendo de la subclase
     * devuelve un PRECIO u otro)
     *
     * @return double precio a sumar del pase VIP (euros)
     */
    public  double getPrecioVIP(){
        
        return BASE_VIP - (BASE_VIP * 0.50);
        
    }
     /**
     * Obtenemos el tipo de la subclase en forma de String
     *
     * @return String Tipo de la subclase
     */
    public  String getTipo(){
     return "Niño";
    }
}
