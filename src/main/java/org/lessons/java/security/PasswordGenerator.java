package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome");
		String userName = inputUser.nextLine();
		
		System.out.println("Inserisci il tuo cognome");
		String userSurname = inputUser.nextLine();
		
		System.out.println("Inserisci il tuo colore preferito");
		String userColor = inputUser.nextLine();
		
		System.out.println("Inserisci il giorno della tua nascita");
		int userDay = inputUser.nextInt();
		
		System.out.println("Inserisci il mese della tua nascita");
		int userMonth = inputUser.nextInt();
		
		System.out.println("Inserisci l'anno della tua nascita");
		int userYear = inputUser.nextInt();
		
		int userAge = (userDay + userMonth + userYear);
		
		String password = (userName+"-"+userSurname+"-"+userColor+"-"+userAge);
		
		System.out.println("La password generata è: " + password);

	}

}
