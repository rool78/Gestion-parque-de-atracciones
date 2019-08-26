import java.util.Scanner;
import java.util.InputMismatchException;   //Exepcion de Scanner
/**
 * Clase interfaz donde crearemos metodos de insercion 
 * y visualización de datos.
 *
 * @author (Raul Maza)
 * @version (19/03/19)
 */
public class Interfaz 
{
    
    private Scanner lectura;
    private GestorUsuarios gestorUsuarios;
    private GestorEntradas gestorEntradas;
    private GestorAtracciones gestorAtracciones;
    private Estadisticas estadisticas;
    
    /**
     * Constructor for objects of class Interfaz
     */
    public Interfaz()
    {
        lectura = new Scanner(System.in);
        gestorUsuarios = new GestorUsuarios();
        gestorEntradas = new GestorEntradas();
        gestorAtracciones = new GestorAtracciones();
        estadisticas = new Estadisticas(gestorEntradas.getArray());
       
    }

    /**
     * Pregunta por el numero de entradas que se desean
     * comprar
     *
     * @return    Devuelve el numero de entradas introducido (int)
     */
    public int lecturaNumEntradas()
      {
        boolean error = false;  
        int numero = 0;
        System.out.println("Introduce el numero de entradas a comprar");
        System.out.print(">");
       try {
     numero = lectura.nextInt();

  } catch (InputMismatchException ime){
    error = true;  
    System.out.println("El valor introducido no es valido. ");
    lectura.next();
  }
  if (!error){
  return numero; 
  }else{
      return -1;
    }
  }  
    /**
     * Pregunta por la edad del cliente
     *
     * @return    Devuelve la edad introducida (int)
     */
    public int lecturaEdad()
      {
        boolean error = false;   
        int numero = 0;
        System.out.println("Introduce tu edad");
        System.out.print(">");
       try {
     numero = lectura.nextInt();

  } catch (InputMismatchException ime){
    error = true;   
    System.out.println("El valor introducido no es valido. ");
    lectura.next();
  }
  if (!error){
  return numero; 
  }else{
      return -1;
  }  
}
     /**
     * Pregunta por la altura del cliente
     *
     * @return    Devuelve la altura introducida (double)
     */
    public double lecturaAltura()
    {
        boolean error = false;
        double numero = 0;
        System.out.println("Introduce tu altura");
        System.out.print(">");
       try {
     numero = lectura.nextDouble();

  } catch (InputMismatchException ime){
    error = true;  
    System.out.println("El valor introducido no es valido. ");
    lectura.next();
  }
  if (!error){
  return numero; 
  }else{
    return -1;
    }
  }
    public boolean lecturaVIP()
    {
        boolean VIP = false;
        System.out.println("¿Añadir pase VIP? (s/n)");
        System.out.print(">");
        
     String respuesta = lectura.next();
     if (respuesta .equalsIgnoreCase("S")){
         return VIP = true;
        }
     else{
         return VIP = false;
        } 
  }
  
    public boolean lecturaDiscapacidad()
    {
        boolean discapacidad = false;
        System.out.println("¿Descuento discapacidad funcional?(s/n)");
        System.out.print(">");
        
     String respuesta = lectura.next();
     if (respuesta .equalsIgnoreCase("S")){
         return discapacidad = true;
        }
     else{
         return discapacidad = false;
        } 
  }
  
   public boolean lecturaEstudiante()
    {
        boolean estudiante = false;
        System.out.println("¿Estudiante?(s/n)");
        System.out.print(">");
        
     String respuesta = lectura.next();
     if (respuesta .equalsIgnoreCase("S")){
         return estudiante = true;
        }
     else{
         return estudiante = false;
        } 
  }
  
    public boolean lecturaCarnetJoven()
    {
        boolean carnet = false;
        System.out.println("¿Carnet joven?(s/n)");
        System.out.print(">");
        
     String respuesta = lectura.next();
     if (respuesta.equalsIgnoreCase("S")){
         return carnet = true;
        }
     else{
         return carnet = false;
        } 
  }
  /**
   * Acceso a estadisticas
   */
  public void accesoEstadisticas(){
      
      estadisticas.actualizarArrayEntradas(gestorEntradas.getArray());
      
      estadisticas.menuEstadisticas();
      
      System.out.println();
      
      menuPrincipal();
      
    }
    /**
   * Acceso a gestion de atracciones
   */
  public void accesoAtracciones(){
      
      gestorAtracciones.menuAtracciones();
      
      System.out.println();
      
      menuPrincipal();
      
    }
  /**
   * Dibujamos el menu principal
   */
  public void menuPrincipal(){
      
       System.out.println("Menu Parque de atracciones");
       System.out.println("=============================");
       System.out.println("[1] - Comprar entradas");
       System.out.println("[2] - Estadisticas"); 
       System.out.println("[3] - Gestion atracciones"); 
       System.out.println();
       System.out.println("Pulse cualquier otra tecla para salir...");
       
      
       int opcion = estadisticas.lecturaNumero();
       
       switch (opcion){
       
       case 1:
           comprarEntradas();
           break;
        
       case 2:
            accesoEstadisticas();
            break;
       case 3:
            accesoAtracciones();
            break;
       default:
       
       System.out.println("Hasta pronto, gracias!!");
       
      }
    }
  /**
   * Pedimos por pantalla el numero de entradas que desean comprar,
   * pedimos por pantalla los datos de los usuarios (altura, edad...),
   * posteriormente se usa la clase GestorEntradas para crear los 
   * usuarios en funcion de la edad (ver clase) y almacena los usuarios en
   * un ArrayList propio de la clase gestor usuarios
   * 
   * @return    Devuelve el numero de entradas que desean comprar (int)
   *
   */
  public int pedirEntradas()
    {   
        int numero_entradas = 0;
        
        System.out.println();
        System.out.println("BIENVENIDO AL SISTEMA DE COMPRA DE ENTRADAS");
        System.out.println("============================================");
        System.out.println();
        //Pregunramos el numero de entradas que desean comprar
        
        numero_entradas = lecturaNumEntradas();
        int contador_adultos = 0;
        int contador_kids = 0;
        
        //Solo continuamos si la entradas que han pedido son > 0
        
        if (numero_entradas > 0){
        
        for (int i = 0; i < numero_entradas; i++){
            
            System.out.println("-Por favor, introduce los datos de la entrada nº" + (i+1));
            
            //Leemos datos de usuario
            int edad = lecturaEdad();
            double altura = lecturaAltura();
            boolean VIP = lecturaVIP();
            boolean discapacidad = lecturaDiscapacidad();
            boolean estudiante = lecturaEstudiante();
            boolean carnet = lecturaCarnetJoven();
            
            //En este punto vemos que si se ha introducido la edad o la altura mal, no continuamos con el proceso y devolvemos un -1
            
            // Capturamos el error -1 tanto si se ha introducido mal la altura como si se ha introducido mal la edad
            
            if (altura == -1 || edad == -1){
             return -1;   
            }
            
            //Creamos el usuario en funcion de la edad 
            
            gestorUsuarios.creaUsuario(edad, altura, VIP, discapacidad, estudiante, carnet);
            
            //Ver si se aplica familia numerosa
 
            if (gestorUsuarios.verUltimo() instanceof Adulto){
             contador_adultos++;   
            }
            
            if (gestorUsuarios.verUltimo() instanceof Kid){
             contador_kids++;   
            }
            
            if (contador_adultos == 2 && contador_kids == 2){
           
             //Se aplica el descuento familiar a las ultima 4 entradas (han sido 2 adultos y 2 kids)
             int index = gestorUsuarios.sizeUsuarios() - 1;
             for (int j = 0; j < 4; j++){
                 
                 gestorUsuarios.setFamilia(index-j);
                 
                }
             
             contador_adultos = 0;
             contador_kids = 0;
                
            }
           
        }
    }
            return numero_entradas;
    }  
    /** Metodo para realizar la compra de las entradas, utilizamos el metodo pedirEntradas,
     *  posteriormente vamos a crear la entradas con la clase GestorEntradas
     */
  public void comprarEntradas(){
      
      int entradas_pedidas = pedirEntradas();
      
      //Creamos las entradas que tendran como campo los ultimos usuarios generados
      
      //El buble for recorre los ultimos usuarios generados y se los asigna al constructor de 
      //las entradas.
      
      if (entradas_pedidas > 0){   //Solo actuamos si el valor de entradas pedidas es coherente...
      
      int indice = 0;
      
      for (int i = 0; i < entradas_pedidas ; i++){
      
          indice = (gestorUsuarios.sizeUsuarios() - 1) - i;
          
      gestorEntradas.crearEntrada(gestorUsuarios.getUsuarioArray(indice));
            
     }
     
     //Imprimimos los tickets
     
     indice = 0;
     
      for (int i = 0; i < entradas_pedidas ; i++){
      
          
            indice = (gestorEntradas.sizeEntradas() - 1) - i;
            
      gestorEntradas.pintaTicket(indice);
            
     }
    }
     //Volvemos al menu principal
     
     menuPrincipal();
     

    }
    
  /** Metodo para realizar las diferentes lecturas del usuario
   * 
   */
    public void lecturas(int edad, double altura, boolean VIP, boolean discapacidad,boolean estudiante, boolean carnet){
        
     edad = lecturaEdad();
     altura = lecturaAltura();
     VIP = lecturaVIP();
     discapacidad = lecturaDiscapacidad();
     estudiante = lecturaEstudiante();
     carnet = lecturaCarnetJoven();
        
        
    }
    
}