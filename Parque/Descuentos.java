/**
 * Descuentos aplicados a los clientes.
 *
 * @author (Raul Maza)
 * @version (21/03/19)
 */
public class Descuentos
{


    /**
     * Constructor for objects of class Descuentos
     */
    public Descuentos()
    {

    }

    /**
     * Descuento por edad, niño (3-13) return 50(%)
     * senior (>=65) return 35(%)
     *
     * @param  Cliente 
     * @return    int descuento (en porcentaje)
     */
    public int decuentoEdad(Usuario usuario)
    {
        return usuario.getDescuentoEdad();
    }
    
      /**
     * Descuento segun temporada (usando la fecha del sistema)
     * -Temporada alta -15(%) 1 Enero a 8 Enero, Semana Santa (todo el mes de abril), Agosto y Diciembre.
     * -Temporada baja 15(%) Febrero y Noviembre
     * -Temporada media 0(%)  El resto sera temporada media
     *
     * @param  fecha 
     * @return    int descuento (en porcentaje)
     */
    public int descuentoTemporada(Fecha fecha)
    {
      int descuento = 0;
      
      //Temporada alta
      
      if (( fecha.getMes() == 4 ) || ( fecha.getMes() == 8 ) || ( fecha.getMes() == 12 )){  // Abril, Agosto o Diciembre
          
          return descuento = -15;
          
        }
      
      if (fecha.getDia() >= 1 && fecha.getMes() == 1 && fecha.getDia() <= 8){  // 1 Enero a 8 Enero
          
          return descuento = -15;
          
        }
 
      //Temporada baja
      
      if (fecha.getMes() == 2 || fecha.getMes() == 11){  // Febrero o Noviembre
      
          return descuento = 15;
          
        }
      return descuento;
    }
    /**
     * Precio suplemento VIP en funcion del cliente
     * 
     *
     * @return     double suplementoVIP (euros)
     */
    public double suplementoVIP(Usuario usuario)
    {
        if(usuario.getVIP()){
        return usuario.getPrecioVIP();
        }
        return 0;
    }
    /**
     * Descentos por atributos 
     * 
     *
     * @return     int Descuento acumulado (en porcentaje)
     */
    public int atributos(Usuario usuario)
    {
        int descuento_acumulado = 0;
        
        if(usuario.getEstudiante()){
            descuento_acumulado+=10;
        }
        if(usuario.getCarnetJoven()){
            descuento_acumulado+=10;
        }
        if(usuario.getDiscapacidad()){
            descuento_acumulado+=20; 
        }
        
        return descuento_acumulado;
    }
     /**
     * Calculo precio final aplicando los decuentos
     * TESTEAR Y MEJORAR EL DESCUENTO INFERIOR AL 10%
     * 
     * @return precio final en funcion del usuario (double)
     */
    public double precioFinal(Usuario usuario){
        
        Fecha fecha = new Fecha();
        final double PRECIO_BASE = 60;
        double precio_final = PRECIO_BASE;
        int porcentaje_acumulado = 0;
        
        //Si es un "bebe" el precio es 0
        if(usuario instanceof Bebe){
         return precio_final = 0;   
        }
        
        porcentaje_acumulado = decuentoEdad(usuario);
        porcentaje_acumulado += atributos(usuario);
        porcentaje_acumulado += descuentoTemporada(fecha);
        
        //En un futuro mejora: debe corresponder a que el decuento no sea inferior al 10%
        //EN RELACION DE LA TEMPORADA QUE SEA
        if (porcentaje_acumulado > 90){
         porcentaje_acumulado = 90;   
        }
        
        precio_final += suplementoVIP(usuario);
        
        precio_final = precio_final - (precio_final * porcentaje_acumulado / 100);
        
        return precio_final;
    
    }
    
    
}
