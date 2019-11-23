import java.util.*;
import java.util.Scanner;

public class PerfectPetApplication {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		PerfectPet pet = new PerfectPet();

		String yesNoFlag;
		String choiceToString;

		
		System.out.println("");
		System.out.println("Meet " + pet.petFirstName + " " + pet.petLastName + " your new Perfect Pet.");

		
		System.out.println("");
    	System.out.println("");
		System.out.println(" ,_     _");
        System.out.println(" |\\\\_,-~/");
        System.out.println(" / _  _ |    ,--.");
        System.out.println("(  @  @ )   / ,-'");
        System.out.println(" \\  _T_/-._( (");
        System.out.println(" /         `. \\");
        System.out.println("|         _  \\ |");
        System.out.println(" \\ \\ ,  /      |");
        System.out.println("  || |-_\\__   /");
        System.out.println(" ((_/`(____,-'");
    	System.out.println("");
    	System.out.println("");	
    	System.out.println(pet.petFirstName + " is: " + pet.age + " years old.");
    	System.out.println(pet.petFirstName + " weighs " + pet.weight + " pounds.");
    	System.out.println(pet.petFirstName + " is " + pet.color + "ish colored.");
    	System.out.println("");
    	System.out.println("");	
    	System.out.println("Here is how " + pet.petFirstName + " " + pet.petLastName + " is feeling today:" + "\n\n1. hunger = " + pet.hunger + "%" + "\n2. thirst = " + pet.thirst + "%" + "\n3. fatigue = " + pet.fatigue + "%" + "\n4. boredom = " + pet.boredom + "%" + "\n5. weight = " + pet.weight + " pounds");
    	System.out.println("");
    	System.out.println("");	
		
		do {    	
	    	System.out.println("Enter 1 - To feed " + pet.petFirstName);
	    	System.out.println("Enter 2 - To give " + pet.petFirstName +" something to drink");
			System.out.println("Enter 3 - To tuck " + pet.petFirstName +" to sleep");
			System.out.println("Enter 4 - To play with " + pet.petFirstName);
			System.out.println("Enter 5 - To exercise with " + pet.petFirstName);
			System.out.println("Enter 6 - To save your progress with " + pet.petFirstName);
			System.out.println("Enter 7 - To exit");
			System.out.println("");
	    	System.out.println("");

	    	pet.choiceInput = scanner.next();

	    	while (pet.validateNumber(pet.choiceInput) == false ){
				System.out.println("Invalid input, please try again.");
				System.out.println("Enter 1 - To feed " + pet.petFirstName);
		    	System.out.println("Enter 2 - To give " + pet.petFirstName +" something to drink");
				System.out.println("Enter 3 - To tuck " + pet.petFirstName +" to sleep");
				System.out.println("Enter 4 - To play with " + pet.petFirstName);
				System.out.println("Enter 5 - To exercise with " + pet.petFirstName);
				System.out.println("Enter 6 - To save your progress with " + pet.petFirstName);
				System.out.println("Enter 7 - To exit");
				System.out.println("");
		    	System.out.println("");
		    	
		    	pet.choiceInput = scanner.next();

		    	if((pet.choiceInput.matches("^[a-zA-Z]*$") || pet.choiceInput.matches("^[A-Z0-9]+$") || pet.choiceInput.isEmpty() || pet.choiceInput == " " || pet.choiceInput == null || pet.choiceInput.matches("^[!@#$%&*()_+=|<>?{}\\[\\]~-]*"))) {

					System.out.println("\nYour entry was invalid, please try again.");

					System.out.println("Enter 1 - To feed " + pet.petFirstName);
			    	System.out.println("Enter 2 - To give " + pet.petFirstName +" something to drink");
					System.out.println("Enter 3 - To tuck " + pet.petFirstName +" to sleep");
					System.out.println("Enter 4 - To play with " + pet.petFirstName);
					System.out.println("Enter 5 - To exercise with " + pet.petFirstName);
					System.out.println("Enter 6 - To save your progress with " + pet.petFirstName);
					System.out.println("Enter 7 - To exit");
					System.out.println("");
			    	System.out.println("");

					pet.choiceInput = scanner.next();

				}
		 	}

		 	pet.choice = Integer.parseInt(pet.choiceInput);        	


			if(pet.choice == 1) {

				pet.feedPet();

	    	}

	    	if(pet.choice == 2) {

	    		pet.waterPet();

	    	}

	    	if(pet.choice == 3) {

	    		pet.sleepPet();

	    	}

	    	if(pet.choice == 4) {

	    		pet.playWithPet();

	    	}

	    	if(pet.choice == 5) {

	    		pet.exercisePet();

	    	}

	    	
	    	if(pet.choice == 6) {
	    		Serializer serializer = new Serializer(pet.petFirstName, pet.petLastName, pet.typeOfPet, pet.weight, pet.color, pet.age, pet.hunger, pet.fatigue, pet.boredom, pet.thirst);	
	       		serializer.save();


	    		
	    	}

	    	if(pet.choice == 7) {
	    		pet.exit();

	    	}


	    	

	    	System.out.println("\n\nHere is how " + pet.petFirstName + " " + pet.petLastName + " is feeling now:");
	    	System.out.println("\n1. hunger = " + pet.hunger + "%");
	    	System.out.println("2. thirst = " + pet.thirst + "%");
	    	System.out.println("3. fatigue = " + pet.fatigue + "%");
	    	System.out.println("4. boredom = " + pet.boredom + "%");
	    	System.out.println("5. weight = " + pet.weight + " pounds");
	    	System.out.println("");
	    	System.out.println("");
	    	System.out.println("Would you like to continue? (y/n)");
	    	System.out.println("Please enter y for yes and n for no.");

	    	yesNoFlag = scanner.next();

	    	if(yesNoFlag.equalsIgnoreCase("n")) {
	    		Serializer serializer = new Serializer(pet.petFirstName, pet.petLastName, pet.typeOfPet, pet.weight, pet.color, pet.age, pet.hunger, pet.fatigue, pet.boredom, pet.thirst);
	    		serializer.message();
	    		System.out.println("Goodbye...\n\n");
	    		System.exit(0);
	    	}


	    	if((pet.validateNumber(yesNoFlag) == true) && (yesNoFlag != "y")) {
	    		System.out.println("Would you like to continue? (y/n)");
	    		System.out.println("Please enter y for yes and n for no.");
	    		yesNoFlag = scanner.next();
	    	}



	    	System.out.println("");
    		System.out.println("");


	    } while (!yesNoFlag.equalsIgnoreCase("n")); 

 	    
	}


}














