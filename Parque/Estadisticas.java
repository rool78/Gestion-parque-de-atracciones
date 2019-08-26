import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Clase para trabajar con las estadisticas del parque.
 *
 * @author (Raul Maza)
 * @version (10/04/19)
 */
public class Estadisticas
{
    private ArrayList<Entrada> entradas_estadisticas;
    private Scanner lectura;

    /**
     * Constructor for objects of class Estadisticas
     */
    public Estadisticas(ArrayList<Entrada> entradas)
    {
      entradas_estadisticas = entradas;
      lectura = new Scanner(System.in);
    }
    //prueba
    public Estadisticas()
    {
      lectura = new Scanner(System.in);
    }
    /**
     * set Array entradas
     */
    public void actualizarArrayEntradas(ArrayList<Entrada> entradas){
        entradas_estadisticas = entradas;
    }
    /**
     *  Visitas en un año concreto
     *  
     *  @param le pasamos el año en concreto para el que queremos los resultados
     *  @return numero visitas año(int)
     */
    public int visitasFecha(int year){
        
        int contador_visitantes = 0;
        
        for (Entrada var : entradas_estadisticas){
            
            Fecha fecha = new Fecha();
            
            fecha = var.getFecha();
            
            if (fecha.getYear() == year){
                contador_visitantes++;
            }
            
        }
        
        return contador_visitantes;
        
    }
    /**
     *  Visitas en un mes concreto
     *  
     *  @param mes y año
     *  @return numero visitas mes y año(int)
     */
    public int visitasFecha(int mes, int year){
        
        int contador_visitantes = 0;
        
        for (Entrada var : entradas_estadisticas){
            
            Fecha fecha = new Fecha();
            
            fecha = var.getFecha();
            
            if (fecha.getYear() == year && (fecha.getMes() == mes)){
                contador_visitantes++;
            }
            
        }
        
        return contador_visitantes;
        
    }
    /**
     *  Visitas en un dia concreto
     *  
     *  @param dia, mes y año
     *  @return numero visitas dia, mes y año(int)
     */
    public int visitasFecha(int dia, int mes, int year){
        
        int contador_visitantes = 0;
        
        for (Entrada var : entradas_estadisticas){
            
            Fecha fecha = new Fecha();
            
            fecha = var.getFecha();
            
            if ((fecha.getYear() == year) && (fecha.getMes() == mes) && (fecha.getDia() == dia)){
                contador_visitantes++;
            }
            
        }
        
        return contador_visitantes;
        
    }
    /**
     * Precio medio de la entrada dando un año
     * 
     * @param int año
     * 
     * @return double precio medio
     */
    public double precioMedio(int year){
        double precio_medio = 0;
        int contador = 0;
        
        for (Entrada var : entradas_estadisticas){
            
            Fecha fecha = new Fecha();
            
            fecha = var.getFecha();
            
            if ((fecha.getYear() == year)){
                
                precio_medio += var.getPrecio();
                
                contador++;
            }
            
        }
        
        return precio_medio / contador;
    }
     /**
     * Precio medio de la entrada dando un mes
     * 
     * @param int mes, año
     * 
     * @return double precio medio
     */
    public double precioMedio(int mes, int year){
        double precio_medio = 0;
        int contador = 0;
        
        for (Entrada var : entradas_estadisticas){
            
            Fecha fecha = new Fecha();
            
            fecha = var.getFecha();
            
            if (fecha.getYear() == year && (fecha.getMes() == mes)){
                precio_medio += var.getPrecio();
                contador++;
            }
            
        }
        
        return  precio_medio / contador;   
    }
     /**
     * Precio medio de la entrada dando un mes
     * 
     * @param int dia, mes, año
     * 
     * @return double precio medio
     */
    public double precioMedio(int dia, int mes, int year){
        double precio_medio = 0;
        int contador = 0;
        
        for (Entrada var : entradas_estadisticas){
            
            Fecha fecha = new Fecha();
            
            fecha = var.getFecha();
            
            if ((fecha.getYear() == year) && (fecha.getMes() == mes) && (fecha.getDia() == dia)){
                precio_medio += var.getPrecio();
                contador++;
            }
            
        }
        
        return  precio_medio / contador;
        
    }
    /**
     * Menu estadisticas
     */
    public void menuEstadisticas(){
       System.out.println(); 
       System.out.println("Menu estadisticas");
       System.out.println("==================");
       System.out.println("[1]- Visitas");
       System.out.println("[2]- Precios medios"); 
       System.out.println();
       System.out.println("Pulse cualquier otra tecla para salir...");
       
       
       int opcion = lecturaNumero();
       
       switch (opcion){
           case 1: 
                menuVisitas();
                break;
           case 2:
                menuPrecio();
                break;
           default:
                   //System.out.println("Opcion incorrecta...");
                
           
           
       
        }
       }
    /**
     * Menu visitas
     */
    public void menuVisitas(){
       int opcion, pausa; 
       int year, mes, dia, visitas;
        
       System.out.println("Menu visitas");
       System.out.println("==============");
       System.out.println("[1]- Visitas en un año");
       System.out.println("[2]- Visitas en un mes"); 
       System.out.println("[3]- Visitas en un dia");
       System.out.println("[4]- Atrás");
       
       
       opcion = lecturaNumero();
       
       switch(opcion){
               case 1:
               
                   System.out.println("Introduce el año que deseas ver las visitas");
                   
                   year = lecturaNumero();
                       
                   visitas = visitasFecha(year);
                   
                   System.out.println("-Año: " + year + "  -Visitas: " + visitas);
                   
                   System.out.println();
                   System.out.println("Pulse una tecla para ir atrás...");
                   pausa = lecturaNumero();
                   break;
               case 2:
                   
                   System.out.println("Introduce el año que deseas ver las visitas");
                   
                   year = lecturaNumero();
                   
                   System.out.println("Introduce el mes");
                   
                   mes = lecturaNumero();
                       
                   visitas = visitasFecha(mes,year);
                   
                   System.out.println("-Mes / año: " + mes + "/" + year + "  -Visitas: " + visitas);
                   
                   System.out.println();
                   System.out.println("Pulse una tecla para ir atrás...");
                   pausa = lecturaNumero();
                   break;
                case 3:
                    System.out.println("Introduce el año que deseas ver las visitas");
                   
                   year = lecturaNumero();
                   
                   System.out.println("Introduce el mes");
                   
                   mes = lecturaNumero();
                   
                   System.out.println("Introduce el dia");
                   
                   dia = lecturaNumero();
                       
                   visitas = visitasFecha(dia,mes,year);
                   
                   System.out.println("-Dia / mes / año: " + dia + "/" + mes + "/" + year + "  -Visitas: " + visitas);
                   
                   System.out.println();
                   System.out.println("Pulse una tecla para ir atrás...");
                   pausa = lecturaNumero();
                   break;
                case 4:
                   menuEstadisticas();
                   break;
                default:
                   System.out.println("Opcion incorrecta...");
                   
           }
 }
 public void menuPrecio(){
       int opcion, pausa; 
       int year, mes, dia;
       double precio_medio;
    
       System.out.println("Menu precio medio");
       System.out.println("====================");
       System.out.println("[1]- Precio medio de un año");
       System.out.println("[2]- Precio medio de un mes"); 
       System.out.println("[3]- Precio medio de un dia");
       System.out.println("[4]- Atrás");
      
       opcion = lecturaNumero();
       
       switch(opcion){
               case 1:
               
                   System.out.println("Introduce el año que deseas ver el precio medio");
                   
                   year = lecturaNumero();
                       
                   precio_medio = precioMedio(year);
                   
                   System.out.println("-Año: " + year + "  -Precio medio: " + precio_medio );
                   
                   System.out.println();
                   System.out.println("Pulse una tecla para ir atrás...");
                   pausa = lecturaNumero();
                   break;
               case 2:
                   
                   System.out.println("Introduce el año que deseas ver el precio medio");
                   
                   year = lecturaNumero();
                   
                   System.out.println("Introduce el mes");
                   
                   mes = lecturaNumero();
                       
                   precio_medio = precioMedio(mes,year);
                   
                   System.out.println("-Mes / año: " + mes + "/" + year + "  -Precio medio: " + precio_medio );
                   
                   System.out.println();
                   System.out.println("Pulse una tecla para ir atrás...");
                   pausa = lecturaNumero(); 
                   break;
                case 3:
                    System.out.println("Introduce el año que deseas ver el precio medio");
                   
                   year = lecturaNumero();
                   
                   System.out.println("Introduce el mes");
                   
                   mes = lecturaNumero();
                   
                   System.out.println("Introduce el dia");
                   
                   dia = lecturaNumero();
                       
                   precio_medio = precioMedio(dia,mes,year);
                   
                   System.out.println("-Dia / mes / año: " + dia + "/" + mes + "/" + year + "  -Precio medio: " + precio_medio );
                   
                   System.out.println();
                   System.out.println("Pulse una tecla para ir atrás...");
                   pausa = lecturaNumero();
                   break;
                case 4:
                   menuEstadisticas();
                   break;
                default:
                   System.out.println("Opcion incorrecta...");
                   
           }
       
    }
    
    /**
     * Scanner para un entero con excepcion
     *
     * @return    Devuelve un entero
     */
    public int lecturaNumero()
      {
        boolean error = false;  
        int numero = 0;
        System.out.print(">");
       try {
     numero = lectura.nextInt();

  } catch (InputMismatchException ime){
    error = true;  
   // System.out.println("El valor introducido no es valido. ");
    lectura.next();
  }
  if (!error){
  return numero; 
  }else{
      return -1;
    }
  }  
    
    
        
        
}
