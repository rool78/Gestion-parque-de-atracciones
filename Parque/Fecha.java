import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.Serializable;
/**
 * Clase para obtener la fecha.
 *
 * @author (Raul Maza)
 * @version (21/03/19)
 */
public class Fecha implements Serializable
{
    // instance variables - replace the example below with your own
    private Date fecha;
    private Calendar c1;
    private Calendar c2;
    

    /**
     * Constructor for objects of class Fecha
     */
    public Fecha()
    {
         fecha = new Date();
         c1 = Calendar.getInstance();
         c2 = new GregorianCalendar();
    }

    /**
     * Obtiene la fecha actual del sistema
     *
     * @return  fecha actual
     */
    public Date getFecha()
    {
    return fecha;
    }
    
    /**
     * Obtiene el dia actual
     *
     * @return  dia actual
     */
    public int getDia()
    {
     int dia = c1.get(Calendar.DATE);
     
     return dia;
    }
    
    /**
     * Obtiene el mes actual 
     *
     * @return  mes actual
     */
    public int getMes()
    {
    int mes = c1.get(Calendar.MONTH);
    return mes+1;
    }
    /**
     * Obtiene el año actual 
     *
     * @return  año actual
     */
    public int getYear()
    {
    int year = c1.get(Calendar.YEAR);
    return year;
    }
    /**
     * Obtiene el numero de dias del mes actual
     *
     * @return  int dias mes actual
     */
    public int getDiasMes()
    {
    
    return c1.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
    
    
    
}
