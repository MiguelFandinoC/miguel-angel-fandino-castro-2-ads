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
public class AdaptadorPicaro implements habilidadesPersonaje{
    Picaro elPicaro;
    
    public AdaptadorPicaro(Picaro pikro){
        elPicaro = pikro;
    }
    @Override
    public void ataqueBasico() {
        elPicaro.ataqueSigiloso();
    }

    @Override
    public void vendaje() {
        elPicaro.roboVida();
    }

    @Override
    public void ataquePesado() {
        elPicaro.Robo();
    }
    
}
