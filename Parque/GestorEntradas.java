import java.util.ArrayList;
//import java.io.Serializable;
/**
 * Clase encargada de gestionar la creacion y el manejo de las entradas
 * dispone de un ArrayList de todas las entradas generadas.
 *
 * @author (Raul Maza)
 * @version (09/04/19)
 */
public class GestorEntradas
{
    private ArrayList<Entrada> entradas;
    private Serializadora serializador;

    /**
     * Constructor for objects of class GestorEntradas
     */
    public GestorEntradas()
    {
        entradas = new ArrayList<>();
        serializador = new Serializadora();
        
        
        
        entradas = (ArrayList<Entrada>) serializador.leerObjeto("arrayEntradas.dat");
        
    }

public void crearEntrada(Usuario usuario){
    
    Descuentos descuentos = new Descuentos();
    Fecha fecha = new Fecha();
    
    Entrada entrada = new Entrada(descuentos.precioFinal(usuario),usuario, fecha);
    entradas.add(entrada);
    
    serializador.escribirObjeto(entradas, "arrayEntradas.dat");

    }
     /** Devuelve un usuario del ArrayList pasandole un indice
     * 
     */
    public Entrada getEntradaArray(int i){
        return entradas.get(i);
    }
    /**
     * Metodo .size del ArrayList
     */
    public int sizeEntradas(){
        return entradas.size();
    }    
    /**
     * Devuelve el ArrayList de entradas
     */
    public ArrayList<Entrada> getArray(){
        return entradas;
    }
    /**
     * Pinta en pantalla el ticket de compra
     *
     */
 public void pintaTicket(int indice)
    {
        //Fecha fecha = new Fecha();
        
        Usuario usuario = entradas.get(indice).getUsuario();
        Entrada entrada = entradas.get(indice);
        Fecha fecha = entrada.getFecha();
        
        System.out.println();
        System.out.println("****************************");
        System.out.println(fecha.getFecha());
        System.out.println("PARQUE DE ATRACCIONES");
        
        if (usuario.getVIP()){
            
            System.out.println("----PASE VIP----");
            
        }
        System.out.println("-Tipo: " + usuario.getTipo());
        System.out.println("-Altura: " + usuario.getAltura());
        System.out.println("-Precio: " + (String.format("%.2f", entrada.getPrecio())) );
        System.out.println("ID " + entrada.getID());
        System.out.println("Gracias por su visita.");
        System.out.println("****************************");
        System.out.println();
    } 
    

}
