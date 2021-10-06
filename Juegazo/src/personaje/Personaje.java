
/**
 *
 * @author Miguel Angel Fandiño Castro
 */
package personaje;

public abstract class Personaje{
    public final void creacionPersonaje(){
        
        seleccionFaccion();
        seleccionAtuendo();
        seleccionClase();
        seleccionRaza();
    }
    public abstract void seleccionClase();
    
    
    public void seleccionFaccion() {
        System.out.println("Creando personaje de la Horda");
    }
    public void seleccionAtuendo() {
        System.out.println("Creando atuendo nivel 1");
    }
    public final void seleccionRaza() {
        System.out.println("Creando un elfo de sangre");
    }
}
