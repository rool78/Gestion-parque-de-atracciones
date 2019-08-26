import java.io.*;

public class Serializadora {

    private ObjectInputStream lector;
    private ObjectOutputStream escritor;
    
    
    public void escribirObjeto(Object objeto,String nombreFichero){
        try{
            escritor=new ObjectOutputStream(new FileOutputStream(nombreFichero));
            escritor.writeObject(objeto);
        }   catch (FileNotFoundException e){
                e.printStackTrace();
        }   catch (IOException e){
                e.printStackTrace();
        } 
    }
    
    
    public Object leerObjeto(String nombreDelArchivo){
        Object retorno=null;
        try{
            lector=new ObjectInputStream(new FileInputStream(nombreDelArchivo));
            retorno=lector.readObject();
        }   catch (FileNotFoundException e){
                e.printStackTrace();
        }   catch (IOException e){
                e.printStackTrace();
        }   catch (ClassNotFoundException e){
                e.printStackTrace();
        }
        return retorno; 
    }
    
}
