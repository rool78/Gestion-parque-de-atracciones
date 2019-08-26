import java.util.ArrayList;
/**
 * Write a description of class GestorUsuarios here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GestorUsuarios
{
    // instance variables - replace the example below with your own
    private ArrayList<Usuario> usuarios;

    /**
     * Constructor for objects of class GestorUsuarios
     */
    public GestorUsuarios()
    {
        // initialise instance variables
        usuarios = new ArrayList<>();
    }
    /**
     * Instancia la subclase de usuario dependiendo de la edad
     */
    public void creaUsuario(int edad, double altura, boolean VIP, boolean discapacidad, boolean estudiante, boolean carnet){
            if (edad >= 13 && edad <= 64){
                Adulto adulto = new Adulto(edad,altura,VIP,discapacidad, estudiante, carnet);
                usuarios.add(adulto);      
                }
            if (edad >= 3 && edad <= 12){
                Kid kid = new Kid(edad,altura,VIP,discapacidad, estudiante, carnet);
                usuarios.add(kid);
            }
            if (edad <= 2){
                Bebe bebe = new Bebe(edad,altura,VIP,discapacidad, estudiante, carnet);
                usuarios.add(bebe);
            }
            if (edad >= 65){
                Senior senior = new Senior(edad,altura,VIP,discapacidad, estudiante, carnet);
                usuarios.add(senior);
            }
    }
    /** Devuelve un usuario del ArrayList pasandole un indice
     * 
     */
    public Usuario getUsuarioArray(int i){
        return usuarios.get(i);
    }
    /**
     * Metodo .size del ArrayList
     */
    public int sizeUsuarios(){
        return usuarios.size();
    }
    /**
     * Devuelve el ultimo usuario del ArrayList
     */
    public Usuario verUltimo(){
        return usuarios.get(usuarios.size()-1);
    }
    /**
     * Settea el atributo descuento_familia pasandole un indice
     */
    public void setFamilia(int i){
        usuarios.get(i).setFamiliar();
    }
}
