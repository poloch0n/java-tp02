package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {
	private static Scanner questionUser;

	public static void main(String [] args) {
		// Affichage du premier message
		System.out.println("*****  Application Opérateurs *****\r\n" + 
				"Veuillez saisir le premier nombre…");
		// Récupération du premier nombre taper
		
		int firstNumber = getNumber();
		// Affichage du deuxieme message
		System.out.println("Veuillez saisir le second nombre…");

		int secondNumber = getNumber();
		showOperation(firstNumber,secondNumber,"+");

		showOperation(firstNumber,secondNumber,"-");
		showOperation(firstNumber,secondNumber,"*");
		showOperation(firstNumber,secondNumber,"/");
		showOperation(firstNumber,secondNumber,"%");
	}
	
	private static void showOperation(int firstNumber, int secondNumber, String string) {

		float result = 0 ;
		
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
			result = firstNumber / secondNumber;
		      break;
		case "%":
			result = firstNumber % secondNumber;
		      break;
		default: System.out.println("error intern, contact dev");
		}
		//show message
		System.out.println(firstNumber + " " + string + " " + secondNumber + " = " + result);
	
	}

	private static int getNumber() {
		questionUser = new Scanner(System.in);
		return questionUser.nextInt();
	}
	
}
