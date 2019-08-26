import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Gestor de las atracciones
 *
 * @author (Raul Maza)
 * @version (09/04/19)
 */
public class GestorAtracciones
{
    
    private ArrayList<Atraccion> atracciones;
    private int A, B, C, D, E;
    private int ayudantes;
    private int responsables;
    private int atencion_al_cliente;
    private int RRPP;
    private Scanner lectura;
    private GestorTrabajadores gestor_trabajadores;
    
    /**
     * Constructor for objects of class GestorAtracciones
     */
    public GestorAtracciones()
    {
        gestor_trabajadores = new GestorTrabajadores();
        atracciones = new ArrayList<>();
        lectura = new Scanner(System.in);
        crearAtracciones();
        calculoTipoAtraccion();
        calculoPersonal();
    }
    /**
     * Crea atracciones de diferentes tipos tal como nos indican
     * 4 de A, 6 de B, 4 de C, 3 de D y 7 de E
     * 
     */
    public void crearAtracciones(){
        
        //Añado atracciones tipo A
        for (int i = 0; i < 4 ; i++){
            Atraccion atraccion = new A();
            atracciones.add(atraccion);
        }
        //Añado atracciones tipo B
        for (int i = 0; i < 6 ; i++){
            Atraccion atraccion = new B();
            atracciones.add(atraccion);
        }
        //Añado atracciones tipo C
        for (int i = 0; i < 4 ; i++){
            Atraccion atraccion = new C();
            atracciones.add(atraccion);
        }
        //Añado atracciones tipo D
        for (int i = 0; i < 3 ; i++){
            Atraccion atraccion = new D();
            atracciones.add(atraccion);
        }
        //Añado atracciones tipo E
        for (int i = 0; i < 7 ; i++){
            Atraccion atraccion = new E();
            atracciones.add(atraccion);
        }
        
    }
    /**
     * get size array atracciones
     * 
     * @return int size atracciones
     */
    public int getAtracciones(){
       return atracciones.size(); 
    }
    /**
     * Ayudantes necesarios
     */
    public int getAyudantesNecesarios(){
      
        int total_ayudantes = 0;
        
        for (Atraccion atr : atracciones) {
            
            total_ayudantes+=atr.getAyudantes();
            
        }
        
        return total_ayudantes;
    }
    
      /**
     * responsables necesarios
     */
    public int getResponsablesNecesarios(){
      
        int total_responsables = 0;
        
        for (Atraccion atr : atracciones) {
            
            total_responsables+=atr.getResponsables();
            
        }
        
        return total_responsables;
    }
    /**
     *  get atencion al cliente (hacer antes calculoPersonal()
     *  
     *  @return int atencion_al_cliente
     */
    public int getAtencionAlCliente(){
     return atencion_al_cliente;    
    }
    /**
     *  get RRPP (hacer antes calculoPersonal()
     *  
     *  @return int RRPP
     */
    public int getRRPP(){
     return RRPP;    
    }
    /**
     *  get total_ayudantes (hacer antes calculoPersonal()
     *  
     *  @return int total_ayudantes
     */
    public int getAyudantes(){
     return ayudantes;    
    }
    /**
     *  get total_responsables (hacer antes calculoPersonal()
     *  
     *  @return int total_responsables
     */
    public int getResponsables(){
     return responsables;    
    }
    /**
     * Calculo personal parque de atracciones
     */
    public void calculoPersonal(){
       ayudantes = getAyudantesNecesarios();
       responsables = getResponsablesNecesarios();
       
       //Calculo atencion al cliente (30% total trabajadores) y RRPP (10% total trabajadores):
       
       int total = ayudantes + responsables;
       
       atencion_al_cliente = (total * 30) / 100;
       
       RRPP = (total * 10) / 100;
       
       //Creamos los trabajadores
       
       gestor_trabajadores.crearTrabajadores(RRPP, ayudantes,responsables,atencion_al_cliente);
       
    }
    /**
     * Calculo tipo atraccion
     */
    public void calculoTipoAtraccion(){
        
        A = 0;
        B = 0;
        C = 0;
        D = 0;
        E = 0;
        
        for (Atraccion var : atracciones){
            
            if (var instanceof A){
                A++; 
            }
            if (var instanceof B){
                B++; 
            }
            if (var instanceof C){
                C++; 
            }
            if (var instanceof D){
                D++; 
            }
            if (var instanceof E){
                E++; 
            }
            
        }
        
    }
    /**
     * Menu gestion atracciones
     */
    public void menuAtracciones(){
        
        int opcion, pausa; 
       
       System.out.println();
       System.out.println("Menu atracciones");
       System.out.println("==================");
       System.out.println("[1]- Atracciones ");
       System.out.println("[2]- Trabajadores ");
       System.out.println("[3]- Gastos trabajadores ");
       System.out.println();
       System.out.println("Pulse cualquier otra tecla para ir atrás...");
      
       opcion = lecturaNumero();
       
       switch(opcion){
               case 1:
               
               System.out.println("Numero de atracciones activas: " + atracciones.size());
               System.out.println("-Tipo A: " + A);
               System.out.println("-Tipo B: " + B);
               System.out.println("-Tipo C: " + C);
               System.out.println("-Tipo D: " + D);
               System.out.println("-Tipo E: " + E);
               System.out.println();
               System.out.println("Pulse una tecla para ir atrás...");
               pausa = lecturaNumero();
               break;
               
               case 2:
               
               int total_trabajadores = ayudantes + responsables + atencion_al_cliente + RRPP;
 
               System.out.println("Numero total de trabajadores: " + total_trabajadores);
               System.out.println("-Ayudantes: " + ayudantes);
               System.out.println("-Responsables: " + responsables);
               System.out.println("-Atenccion al cliente: " + atencion_al_cliente);
               System.out.println("-RRPP: " + RRPP);
               System.out.println();
               System.out.println("Pulse una tecla para ir atrás...");
               pausa = lecturaNumero();
               break;
               
               case 3:
               
               
               menuGastos();
               
               break;
               
               default:
        
    }
}
    /**
     * Menu gastos
     */
    public void menuGastos(){
        int opcion, pausa; 
       
       System.out.println();
       System.out.println("Menu atracciones");
       System.out.println("==================");
       System.out.println("[1]- Gasto anual ");
       System.out.println("[2]- Gasto mensual ");
       System.out.println("[3]- Gasto diario ");
       System.out.println("[4]- Activar / Desactivar atracción ");
       System.out.println();
       System.out.println("Pulse cualquier otra tecla para ir atrás...");
      
       opcion = lecturaNumero();
       
       switch(opcion){
               case 1:
               System.out.println("El gasto de trabajadores anual es de: " + gastoAnual(gestor_trabajadores.getArrayTrabajadores()) + "€");
               
               System.out.println();
               System.out.println("Pulse una tecla para ir atrás...");
               pausa = lecturaNumero();
               break;
               
               case 2:
               System.out.println("El gasto de trabajadores mensual es de: " + gastoMensual(gestor_trabajadores.getArrayTrabajadores()) + "€");
               
               System.out.println();
               System.out.println("Pulse una tecla para ir atrás...");
               pausa = lecturaNumero();
               break;
               
               case 3:
               System.out.println("El gasto de trabajadores diario es de: " + gastoDiario(gestor_trabajadores.getArrayTrabajadores()) + "€");
               
               System.out.println();
               System.out.println("Pulse una tecla para ir atrás...");
               pausa = lecturaNumero();
               
               break;
               
               default:
        
    }
}
    /**
     * Gastos trabajadores anual
     */
    public double gastoAnual(ArrayList<Trabajador> v_trabajadores){
        double gasto = 0;
        final int MESES = 12;
        
        for (Trabajador var : v_trabajadores){
            
            gasto += var.getSueldo();
            
        }
        return gasto * MESES;
    }
     /**
     * Gastos trabajadores mensual
     */
    public double gastoMensual(ArrayList<Trabajador> v_trabajadores){
        double gasto = 0;
        
        for (Trabajador var : v_trabajadores){
            
            gasto += var.getSueldo();
            
        }
        return gasto;
    }
     /**
     * Gastos trabajadores diario
     */
    public double gastoDiario(ArrayList<Trabajador> v_trabajadores){
        Fecha fecha = new Fecha();
        double gasto = 0;
        int dias_mes = fecha.getDiasMes();
        
        for (Trabajador var : v_trabajadores){
            
            gasto += var.getSueldo();
            
        }
        return gasto / dias_mes;
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
    lectura.next();
  }
  if (!error){
  return numero; 
  }else{
      return -1;
    }
  }
}
