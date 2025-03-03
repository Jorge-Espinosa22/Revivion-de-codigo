
package org.generation;
import java.util.Scanner; //Importamos la libreria para el usor de Scanner

public class Codigo4 {

public static void main (String[] args){ //Agregarmos el metodo main para poder probarla

	
Scanner eleccionj1 = new Scanner( System.in); // Agregamos System.in para poder obetener informacion de la consola
Scanner eleccionj2 = new Scanner( System.in);// Se les cambio el nombre a algo mas descriptivo

String j1 = eleccionj1.nextLine();//Las subi y junte para tener mas orden en el codigo
String j2 = eleccionj2.nextLine(); 


//Se agrego un while para poder validar la entrada, si no ponen tijeras, piedra o papel se 
//repetira el mensaje hasta que pongan uno correcto
//Jugador1
while(true) {
System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
if(j1.equals("tijeras") || j1.equals("piedra")|| j1.equals("papel")){
break;
}
else {System.out.println("Entrada no valida");}
};


//Igual que arriba se agrega un while para la validacion de la entrada.
//Jugador2
while(true) {
System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");//Tenia otra vez jugador 1,se cambia a jugador 2
 if(j2.equals("tijeras") || j2.equals("piedra")|| j2.equals("papel")){
	 break;
	 }
	 else {System.out.println("Entrada no valida");}
	 };


if (j1 == j2) {
  System.out.println("Empate");
} else {
  int ganador = 2;  //Se cambia el nombre a algo mas descriptivo como ganador
  switch(j1) {
    case "piedra":
      if (j2.equals("tijeras")) {
        ganador = 1;
      }
      break;
    case "papel":
      if (j2.equals("piedra")) {
        ganador = 1;
  }
      break;
    case "tijeras"://Le falto la s en tijeras
      if (j2.equals("papel")) {
        ganador = 1;
      }
      break;
    default:
    	ganador = 2;//Si no cumple con las anteriores gana el jugador 2
  }
  System.out.println("Gana el jugador " + ganador);
}

}
}
  

