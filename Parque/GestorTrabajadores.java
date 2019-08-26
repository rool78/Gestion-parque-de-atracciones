import java.util.ArrayList;
/**
 * Gestor de los trabajadores.
 *
 * @author (Raul Maza)
 * @version (09/04/19)
 */
public class GestorTrabajadores
{
    private ArrayList<Trabajador> trabajadoresPool;
    private ArrayList<Trabajador> trabajadores;
    
    /**
     * Constructor for objects of class GestorTrabajadores
     */
    public GestorTrabajadores()
    {
        trabajadoresPool = new ArrayList<>();
        trabajadores = new ArrayList<>();
    }
    /**
     * Crear algunos trabajadores de prueba
     */
    public void crearTrabajadoresTest(){
        
        Trabajador r1 = new ResponsableAtr("Raul","Maza","142996");
        Trabajador r2 = new ResponsableAtr("Pepe","Sarabillo","382712");
        Trabajador r3 = new ResponsableAtr("Julia","Garcia","857483");
        Trabajador r4 = new ResponsableAtr("Emma","Maza","947362");
        
        trabajadoresPool.add(r1);
        trabajadoresPool.add(r2);
        trabajadoresPool.add(r3);
        trabajadoresPool.add(r4);
        
        Trabajador a1 = new AyudanteAtr("Gall","Leon","124455");
        Trabajador a2 = new AyudanteAtr("Bruno","Barrabes","2235322");
        Trabajador a3 = new AyudanteAtr("Maria","Bermudes","8746333");
        Trabajador a4 = new AyudanteAtr("Eduardo","Paricio","966748");
        Trabajador a5 = new AyudanteAtr("Raul","Tardio","129382");
        Trabajador a6 = new AyudanteAtr("Cleopatra","La lenta","968473");
        
        trabajadoresPool.add(a1);
        trabajadoresPool.add(a2);
        trabajadoresPool.add(a3);
        trabajadoresPool.add(a4);
        trabajadoresPool.add(a5);
        trabajadoresPool.add(a6);
    }
    /**
     * Acceso al ArrayList trabajadores
     */
    public Trabajador getTrabajadorArray(int indice){
        return trabajadoresPool.get(indice);
    }
    /**
     * Crea los trabajadores segun las atracciones
     */
    public void crearTrabajadores(int rrpp, int ayudantes, int responsables, int atencion_cliente){
        
        for (int i = 0; i < rrpp; i++){
            Trabajador relaciones = new RRPP();
            trabajadores.add(relaciones);
        }
        
        for (int i = 0; i < ayudantes; i++){
            Trabajador ayu = new AyudanteAtr();
            trabajadores.add(ayu);
        }
        
        for (int i = 0; i < responsables; i++){
            Trabajador resp = new ResponsableAtr();
            trabajadores.add(resp);
        }
        
        for (int i = 0; i < atencion_cliente; i++){
            Trabajador aten = new AtencionAlCliente();
            trabajadores.add(aten);
        }
    }
    /**
     * Obtener el ArrayList de trbajadores
     */
    public ArrayList<Trabajador> getArrayTrabajadores(){
        return trabajadores;
    }

   
}
