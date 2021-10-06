/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

/**
 *
 * @author Miguel Angel Fandiño Castro
 */
public class Guerrero extends Personaje implements habilidadesPersonaje{

    @Override
    public void seleccionClase() {
        System.out.println("Seleccionando clase guerrero.");
    }
    
    @Override
    public void armaPrincipal() {
        System.out.println("El arma principal del guerrero es la espada larga");
    }
    

    @Override
    public void ataqueBasico() {
        int golpe = 3;
        System.out.println("El ataque basico del guerrero causa: "+golpe+" puntos de daño.");
    }

    @Override
    public void vendaje() {
        int curacion = 1;
        System.out.println("El vendaje  del guerrero regenera: "+curacion+" puntos de vida.");
    }

    @Override
    public void ataquePesado() {
        int habilidad = 6;
        System.out.println("El golpe pesado del guerrero causa: "+habilidad+" puntos de daño.");
    }


    
}
