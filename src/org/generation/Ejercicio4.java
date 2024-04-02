/*Este codigo es un juego de piedra, papel o tijeras
 * donde se pide al usuario ingresar especificamente  piedra, papel o tijeras
 * esto gracias al System.in (solo basta con colocarlo una vez)
 * Por medio de un Switch se muestra los casos y dependiendo
 * de la respuesta, esto se imprime en la consola.
 * Se ocupa un if, para el caso de que sea un empate
 * */


package org.generation;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
   // Scanner s2 = new Scanner();
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String j2 = s.nextLine();
    
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      
      switch(j1) {
      
      case "piedra":
    	  if (j2 == "tijeras") {
            g = 1;
          }//casepiedra
    	  break;

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }//casepapel
          break;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }//casetijera
          break;
        default:
      }//switch
      System.out.println("Gana el jugador " + g);
    }//else
	}//main
}//classEjercicio4