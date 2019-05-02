package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {
	private static Scanner questionUser;

	public static void main(String [] args) {
		// Affichage du premier message
		System.out.println("*****  Application Op�rateurs *****\r\n" + 
				"Veuillez saisir le premier nombre�");
		// R�cup�ration du premier nombre taper
		
		float firstNumber = getNumber();
		// Affichage du deuxieme message
		System.out.println("Veuillez saisir le second nombre�");

		float secondNumber = getNumber();
		showOperation(firstNumber,secondNumber,"+");

		showOperation(firstNumber,secondNumber,"-");
		showOperation(firstNumber,secondNumber,"*");
		showOperation(firstNumber,secondNumber,"/");
		showOperation(firstNumber,secondNumber,"%");
	}
	
	private static void showOperation(float firstNumber, float secondNumber, String string) {

		float result = 0 ;
		String message = "";
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
				message = " \r\n you tried to divise by 0 ? really ? nice try";
			}
			
		      break;
		case "%":
			if(secondNumber != 0) {
				result = firstNumber % secondNumber;
			} else {
				message = " \r\n you tried to get the modulo from 0 ? you either are testing me or pretty d... curious :p";
			}
		      break;
		default: System.out.println("error intern, contact dev");
		}
		//show message
		if(message == "") {
			System.out.println(firstNumber + " " + string + " " + secondNumber + " = " + result);
		} else {
			System.out.println(message);
		};
	}

	private static float getNumber() {
		questionUser = new Scanner(System.in);
		try {
			return questionUser.nextFloat();
		} catch(Exception e)  {
			float random =  (float)(int) (Math.random()*100 +1);
			System.out.println("\r\n you didn't enter a number, we choose "+random+" for you");
			return random;
		}
	}
}
