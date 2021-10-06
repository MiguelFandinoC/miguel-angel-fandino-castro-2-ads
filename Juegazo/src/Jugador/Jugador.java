/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import personaje.AdaptadorPicaro;
import personaje.Guerrero;
import personaje.Picaro;
import personaje.habilidadesPersonaje;

/**
 *
 * @author Miguel Angel Fandiño Castro
 */
public class Jugador {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bienvenido a la creacion de personajes de OwO.");
        System.out.println("El ultimo paso restante es elegir la clase de tu personaje:");
        System.out.println("\nElige una clase para tu personaje.\n" +
                "1 - Guerrero\n" +
                "2 - Picaro");
        int eleccionRaza = Integer.parseInt(reader.readLine());

        if (eleccionRaza == 1) {
            Guerrero guerr = new Guerrero();
            guerr.creacionPersonaje();
            System.out.println("Estas son las habilidades de tu clase:");
            guerr.ataqueBasico();
            guerr.ataquePesado();
            guerr.vendaje();
            
        } else if (eleccionRaza == 2) {
            Picaro picar = new Picaro();
            picar.creacionPersonaje();
            habilidadesPersonaje picarAdapt = new AdaptadorPicaro(picar);
            picarAdapt.ataqueBasico();
            picarAdapt.vendaje();
            picarAdapt.ataquePesado();
        }
    }
}
