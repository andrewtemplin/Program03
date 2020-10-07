package edu.ilstu;

import java.util.Scanner;

public class Cypher {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		char cipherText [] = {'c','s','i','m','u','y','l','a','n','g','p','w','z','f','r','x','b','v','h','d','t','e','j','q','k','o'};
		char plainText [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String quit3 = "Thank you for using the Normal Encrypter!";
		
		int i = 0;
		
		while (i != 1) {
		printMenu();
		String choice = scan.nextLine();
		
		
		switch (choice) {
			case "1":
				System.out.println("Enter Message to Encypt:");
				String input1 = scan.nextLine();
				encode(input1, cipherText, plainText);
				break;
			case "2":
				System.out.println("Enter Message to Decrypt:");
				String input2 = scan.nextLine();
				decode(input2, cipherText, plainText);
				break;
			case "3":
				System.out.println(quit3);
				System.exit(0);
				i++;
				break;
			default:
				System.out.println("Enter valid choice");
				break;
		}
				
		}
	
		
		

	}
	
	private static void printMenu() {
		System.out.println("Welcome to the Normal Encrypter!");
		System.out.println();
		System.out.println("You may: ");
		System.out.println("	1.) Encrpyt a message");
		System.out.println(" 	2.) Decrpyt a message");
		System.out.println(" 	3.) Quit");
		System.out.println();
		System.out.println("Please enter choice (1, 2, or 3): ");
	}
	
	private static void encode(String input, char[] cipher, char[] plain) {
		input = input.toLowerCase();
		char[] inputChar = new char[input.length()];
		for (int i = 0; i < input.length(); i++){
			inputChar[i] = input.charAt(i);
		}
		
		char[] encryption = new char[inputChar.length];
		for (int i = 0; i < inputChar.length; i++) {
			for (int j = 0; j < plain.length; j++) {
				if (inputChar[i] == plain[j]) {
					encryption[i] = cipher[j];
					break;
				}
				if (inputChar[i] == ' ' || inputChar[i] == '!' || inputChar[i] == '@' || inputChar[i] == '#' ||
						inputChar[i] == '$' || inputChar[i] == '%' || inputChar[i] == '^' || inputChar[i] == '&' ||
						inputChar[i] == '*' || inputChar[i] == '(' || inputChar[i] == ')' || inputChar[i] == '-' ||
						inputChar[i] == '_' || inputChar[i] == '=' || inputChar[i] == '+') {
					encryption[i] = inputChar[i];
					break;
				}
			}
		}
		System.out.println(encryption);
	}
	
	private static void decode(String input, char[] cipher, char[] plain) {
		input = input.toLowerCase();
		char[] inputChar = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			inputChar[i] = input.charAt(i);
		}
		
		char[] decryption = new char[inputChar.length];
		for (int i = 0; i < inputChar.length; i++) {
			for (int j = 0; j < cipher.length; j++) {
				if (inputChar[i] == cipher[j]) {
					decryption[i] = plain[j];
					break;
					
				}
				if (inputChar[i] == ' ' || inputChar[i] == '!' || inputChar[i] == '@' || inputChar[i] == '#' ||
						inputChar[i] == '$' || inputChar[i] == '%' || inputChar[i] == '^' || inputChar[i] == '&' ||
						inputChar[i] == '*' || inputChar[i] == '(' || inputChar[i] == ')' || inputChar[i] == '-' ||
						inputChar[i] == '_' || inputChar[i] == '=' || inputChar[i] == '+') {
					decryption[i] = inputChar[i];
					break;
				
				}
			}
		}
		System.out.println(decryption);
	}

}
