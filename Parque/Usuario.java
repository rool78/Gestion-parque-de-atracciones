import java.util.ArrayList;
import java.io.Serializable;
/**
 * Clase para generar los clientes del parque
 *
 * @author (Raul Maza)
 * @version (19/03/19)
 */
public abstract class Usuario extends Persona implements Serializable
{
    
   
    private double altura;
    private boolean VIP;
    private boolean discapacidad;
    private boolean estudiante;
    private boolean carnet_joven;
    private boolean descuento_familiar;
    
    protected final int BASE_VIP = 50;      //Precio base entrada VIP
    
    
    
    

    /**
     * Constructor for objects of class Cliente
     */
    public Usuario(int edad, double altura, boolean VIP, boolean discapacidad, boolean estudiante, boolean carnet_joven)
    {
      this.edad = edad;
      this.altura = altura;
      this.VIP = VIP;
      this.discapacidad = discapacidad;
      this.estudiante = estudiante;
      this.carnet_joven = carnet_joven;
      descuento_familiar = false;
    }

    /**
     * Obtener edad del cliente
     *
     * @return    int edad
     */
    public int getEdad()
    {
     return edad;       
    }
        /**
     * Obtener altura del cliente
     *
     * @return   double altura
     */
    public double getAltura()
    {
     return altura;       
    }
     /**
     * Obtener VIP
     *
     * @return    boolean VIP
     */
    public boolean getVIP()
    {
     return VIP;       
    }
      /**
     * Obtener estudiante
     *
     * @return    boolean estudiante
     */
    public boolean getEstudiante(){
        
        return estudiante;
    }
       /**
     * Obtener carnet_joven
     *
     * @return    boolean carnet_joven
     */
    public boolean getCarnetJoven(){
        
        return carnet_joven;
    }
      /**
     * Obtener descuento_familiar
     *
     * @return    boolean descuento_familiar
       */
    public boolean getFamiliar(){
        
        return descuento_familiar;
    }
     /**
     * Obtener discapacidad
     *
     * @return    boolean discapacidad
     */
    public boolean getDiscapacidad(){
        
        return discapacidad;
    }
     /**
     * Obtener descuento Edad (metodo polimorfico despendiendo de la subclase
     * devuelve un porcentaje u otro)
     *
     * @return int descuento (porcentaje)
     */
    public abstract int getDescuentoEdad();
    
     /**
     * Obtener descuento VIP(metodo polimorfico despendiendo de la subclase
     * devuelve un PRECIO u otro)
     *
     * @return double precio a sumar del pase VIP (euros)
     */
    public abstract double getPrecioVIP();
    /**
     * Obtenemos el tipo de la subclase en forma de String
     *
     * @return String Tipo de la subclase
     */
    public abstract String getTipo();
     /**
     * Aplicar como descuento_familiar
     *
     * 
       */
    public void setFamiliar(){
        
        descuento_familiar = true;
        
    }
    
}
