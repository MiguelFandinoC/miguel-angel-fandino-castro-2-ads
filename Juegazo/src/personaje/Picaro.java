
/**
 *
 * @author Miguel Angel Fandiño Castro
 */
package personaje;
import java.util.Random;
public class Picaro extends Personaje {
    Random num = new Random();
    @Override
    public void seleccionClase() {
        System.out.println("Seleccionando clase picaro.");
    }
    @Override
    public void armaPrincipal() {
        System.out.println("El arma principal del picaro es la daga.");
    }
    
    public void ataqueSigiloso(){
        int golpe = 10;
        System.out.println("El ataque sigiloso del picaro causa: "+golpe+" puntos de daño.");
    }
    public void roboVida(){
        int roboDeVida = 3;
        System.out.println("El picaro roba: "+roboDeVida+" puntos de vida.");
    }
    public void Robo(){
        int probabilidad = num.nextInt(10)+1;
        System.out.println("El picaro al usar Robo tiene una probabilidad de robar un objeto, por ejemplo si utilizas robo ahora mismo tendria el siguiente efecto:");
        if (probabilidad ==1) {
            System.out.println("El picaro ha robado un objeto ultra raro!");
        }else if (probabilidad >1 && probabilidad <9) {
            System.out.println("El picaro ha robado un objeto comun");
        }else if(probabilidad ==10){
            System.out.println("El picaro no ha robado nada");
        }
    }


}
