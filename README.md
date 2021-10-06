# miguel-angel-fandi-o-castro-2-ads
El programa realizado simula la creacion de personajes de un videojuego MMO/RPG. En el que ya se ha hecho la seleccion de elementos como la raza, el atuendo y la faccion del personaje. En el programa el jugador debe seleccionar la clase del personaje. Al digitar 1 elige guerrero y al digitar 2 elige picaro. Una vez realiza su eleccion se le mostraran las distintas habilidades de la clase correspondiente y su respectivo daño/cura. Este programa se realizo en NetBeans 8.2 en lenguaje Java.

## Template 
Elegi este patron ya que queria crear distintos personajes con ciertas caracteristicas definidas en la superclase y unas especificas en las subclases como se puede observar en la clase "Personaje" como la clase del personaje y el arma principal depende de la subclase. (Clase "Guerrero" linea 14-22 y clase "Picaro" linea 11-17). 

## Adapter
Elegi el patron adapter ya que cada clase cuenta con un set de habilidades distintas, sin embargo al utilizar adapter se da la posibilidad de 'adaptar' las habilidades de una clase como el paladin a las de una clase basica como la de un guerrero. Esto se evidencia en la clase AdaptadorPicaro dandole una interfaz al objeto picaro para tener las posibilidades de ser llamado desde las habilidades de la clase guerrero. 
