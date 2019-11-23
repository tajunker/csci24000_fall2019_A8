import java.io.*;
import java.util.Scanner;
import java.util.*;

public class PerfectPet implements java.io.Serializable {

	String petFirstName;
	String petLastName;
	String typeOfPet;
	String color;
	
	String ageInput;
	int age;

	String weightInput;
	int weight;


	int hunger = 40;
	int fatigue = 40;
	int boredom = 40;
	int thirst = 40;
	
	String choiceInput;
	int choice;

	String yesNoFlag;
	int flag1 = 1;

	public PerfectPet() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Would you like to load a saved pet? (y/n)");
		System.out.println("Please enter y for yes and n for no.");

		yesNoFlag = scanner.next();

		do {

			
			if(yesNoFlag.equalsIgnoreCase("y")) {

				while(flag1 == 1) {
					Serializer serializer = new Serializer(this.petFirstName, this.petLastName, this.typeOfPet, this.weight, this.color, this.age, this.hunger, this.fatigue, this.boredom, this.thirst);

					serializer.load();
					
					flag1 = 0;
				}
			
			} 

			if((yesNoFlag.matches("^[a-zA-Z]*$") || yesNoFlag.matches("^[A-Z0-9]+$") || yesNoFlag.isEmpty() || yesNoFlag == " " || yesNoFlag == null || yesNoFlag.matches("^[!@#$%&*()_+=|<>?{}\\[\\]~-]*")) && !yesNoFlag.equalsIgnoreCase("y") && !yesNoFlag.equalsIgnoreCase("n")) {
		
				System.out.println("\nYour entry was invalid, please try again.");

				System.out.println("Would you like to load a saved pet? (y/n)");
				System.out.println("Please enter y for yes and n for no.");

				yesNoFlag = scanner.next();



			}

			if(yesNoFlag.equalsIgnoreCase("n")) { 

				this.typeOfPet = "Cat";

				System.out.println("What would you like to name your new " + typeOfPet + "?");
				System.out.println("Please enter first name: ");
				this.petFirstName = scanner.next();
				while (validateAlphabetical(this.petFirstName) == false ){
					System.out.println("Invalid input, please try again.");
					System.out.println("Please enter first name: ");
					this.petFirstName = scanner.next();
				}
							
				System.out.println("Please enter last name: ");
		        this.petLastName = scanner.next();
		        while (validateAlphabetical(this.petLastName) == false ){
					System.out.println("Invalid input, please try again.");
					System.out.println("Please enter last name: ");
					this.petLastName = scanner.next();
				}


				System.out.println("Please enter " + petFirstName + "'s age: ");
				this.ageInput = scanner.next();
			    while (validateNumber(this.ageInput) == false ){
					System.out.println("Invalid input, please try again.");
					System.out.println("Please enter " + petFirstName + "'s age: ");
					this.ageInput = scanner.next();
				}
				this.age = Integer.parseInt(ageInput);     


				System.out.println("Please enter " + petFirstName + "'s weight: ");
				this.weightInput = scanner.next();
				while (validateNumber(this.weightInput) == false ){
					System.out.println("Invalid input, please try again.");
					System.out.println("Please enter " + petFirstName + "'s weight: ");
					this.weightInput = scanner.next();
				} 				
				this.weight = Integer.parseInt(weightInput);


				System.out.println("Please enter " + petFirstName + "'s color: ");
				this.color = scanner.next();
				while (validateAlphabetical(this.color) == false ){
					System.out.println("Invalid input, please try again.");
					System.out.println("Please enter " + petFirstName + "'s color: ");
					this.color = scanner.next();
				}

			}

			

		} while(!yesNoFlag.equalsIgnoreCase("n"));

	}


	public PerfectPet(String petFirstName, String petLastName, String typeOfPet, int weight, String color, int age, int hunger, int fatigue, int boredom, int thirst) {

		this.petFirstName = petFirstName;
		this.petLastName = petLastName;
		this.typeOfPet = typeOfPet;
		this.weight = weight;
		this.color = color;
		this.age = age;
		this.hunger = hunger;
		this.fatigue = fatigue;
		this.boredom = boredom;
		this.thirst = thirst;

	}


	void feedPet() {
		
		if(hunger >= 25) {
			
			hunger = hunger - 5;
			weight = weight + 1;

		} else {

			System.out.println(petFirstName + " isn't hungry at the moment...");
			hunger = hunger + 1;

		}

		if(weight >= 20) {
			System.out.println("Your pet is getting fat, you should excersize your pet...");
		}

	}


	void sleepPet() {

		if(fatigue >= 25) {
			
			fatigue = fatigue - 5;

		} else {

			System.out.println(petFirstName + " isn't sleepy at the moment...");
			fatigue = fatigue + 1;

		}

	}


	void playWithPet() {

		if(boredom >= 25) {
			
			boredom = boredom - 5;
			fatigue = fatigue + 5;

		} else {

			System.out.println(petFirstName + " isn't bored at the moment...");
			fatigue = fatigue + 1;

		}

	}


	void exercisePet() {

		if(weight >= 1) {
			
			weight = weight - 1;

		} 

		else {

			System.out.println(petFirstName + " has lost too much weight, you should feed your pet...");

		}


	}


	void waterPet() {

		if(thirst >= 25) {
			
			thirst = thirst - 5;

		} else {

			System.out.println(petFirstName + " isn't thirsty at the moment...");
			thirst = thirst + 1;

		}

	}


	boolean validateAlphabetical(String stringOfCharacters) {

		return stringOfCharacters.matches( "^[a-zA-Z]*$" );
	}


	boolean validateNumber(String number) {

		return number.matches( "^[A-Z0-9]*" );
	}


	void exit() {
		
		Serializer serializer = new Serializer(this.petFirstName, this.petLastName, this.typeOfPet, this.weight, this.color, this.age, this.hunger, this.fatigue, this.boredom, this.thirst);
		serializer.save();
		System.out.println(petFirstName + " will miss you. Come back soon...");
		System.out.println("Goodbye...\n\n");
		System.exit(0);

	}







}