package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {
	private static Scanner questionUser;

	public static void main(String [] args) {
		// Affichage du premier message
		System.out.println("*****  Application Op�rateurs *****\r\n" + 
				"Veuillez saisir le premier nombre�");
		// Récupération du premier nombre tapé
		
		float firstNumber = getNumber();
		// Affichage du deuxieme message
		System.out.println("Veuillez saisir le second nombre�");

		float secondNumber = getNumber();
		// Affiche la phrase pour chaque opération
		showOperation(firstNumber,secondNumber,"+");
		showOperation(firstNumber,secondNumber,"-");
		showOperation(firstNumber,secondNumber,"*");
		showOperation(firstNumber,secondNumber,"/");
		showOperation(firstNumber,secondNumber,"%");
	}
	
	// Fonction permettant d'afficher une phrase pour une opération
	private static void showOperation(float firstNumber, float secondNumber, String string) {

		float result = 0 ;
		String message = "";
		
		// Distinction des cas pour chaque opération
		switch(string) {
		case "+":
			result = firstNumber + secondNumber;
		      break;
		case "-":
			result = firstNumber - secondNumber;
		      break; 
		case "*":
			result = firstNumber * secondNumber;
		      break;
		case "/":
			if(secondNumber != 0) {
				result = firstNumber / secondNumber;
			} else {
				// Distinction extreme de la division par zéro
				message = " \r\n you tried to divise by 0 ? really ? nice try";
			}
		      break;
		case "%":
			if(secondNumber != 0) {
				result = firstNumber % secondNumber;
			} else {
				// Distinction extreme du calcul du modulo par 0
				message = " \r\n you tried to get the modulo from 0 ? you either are testing me or pretty d... curious :p";
			}
		      break;
		default: 
			// Cas impossible sauf évolution du code
			System.out.println("contact Dev : scope 'showOperation'");
		}
		
		//Affichage du message
		if(message == "") {
			System.out.println(firstNumber + " " + string + " " + secondNumber + " = " + result);
		} else {
			// Affichage des cas extremes
			System.out.println(message);
		};
	}

	// Récupération du nombre tapé
	private static float getNumber() {
		questionUser = new Scanner(System.in);
		try {
			return questionUser.nextFloat();
		} catch(Exception e)  {
			// Gestion des cas où l'utilisateur ne rentre pas un nombre
			float random =  (float)(int) (Math.random()*100 +1);
			System.out.println("\r\n you didn't enter a number, we choose "+random+" for you");
			return random;
		}
	}
}
