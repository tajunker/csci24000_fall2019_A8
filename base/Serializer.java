import java.io.*;
import java.util.Scanner;

public class Serializer extends PerfectPet implements java.io.Serializable {



	
	public Serializer(String petFirstName, String petLastName, String typeOfPet, int weight, String color, int age, int hunger, int fatigue, int boredom, int thirst) {

		super(petFirstName, petLastName, typeOfPet, weight, color, age, hunger, fatigue, boredom, thirst);

		this.petFirstName = petFirstName;
		this.petLastName = petLastName;
		this.typeOfPet = typeOfPet;
		this.color = color;
		this.age = age;
		this.ageInput = ageInput;
		this.weight = weight;
		this.weightInput = weightInput;
		this.hunger = hunger;
		this.fatigue = fatigue;
		this.thirst = thirst;
		this.boredom = boredom;
		this.choice = choice;
		this.choiceInput = choiceInput;

	}

	void deleteFile() {
		
		System.out.println("\nChecking file...");

		File file = null;
		file = new File("perfect-pet.ser");

		try {
			file.createNewFile();

			System.out.println("\nDeleting file...");

			file.delete();
		} catch(IOException e) {
			System.out.println("\nDeleting file...");			
		}

	
	}


	
	void save() {

		System.out.println("\nSaving your Perfect Pet...");

		try {


			FileOutputStream outputFile = new FileOutputStream("perfect-pet.ser", false);

			ObjectOutputStream outputData = new ObjectOutputStream(outputFile);

			outputData.flush();
			outputFile.flush();

			outputData.writeObject(this);

			outputData.close();

			outputFile.close();

		} catch(IOException ioe) {

			ioe.printStackTrace();

		}

		

	}


	void load() {

		try {
					
			System.out.println("\nLoading your Perfect Pet...");

			FileInputStream inputFile = new FileInputStream("perfect-pet.ser");
			
			ObjectInputStream inputData = new ObjectInputStream(inputFile);

			PerfectPet savedPet = (PerfectPet) inputData.readObject();

			Scanner scanner = new Scanner(System.in);


			System.out.println("");
			System.out.println("Meet " + savedPet.petFirstName + " " + savedPet.petLastName + " your Perfect Pet.");

			

			
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
	    	System.out.println(savedPet.petFirstName + " is: " + savedPet.age + " years old.");
	    	System.out.println(savedPet.petFirstName + " weighs " + savedPet.weight + " pounds.");
	    	System.out.println(savedPet.petFirstName + " is " + savedPet.color + "ish colored.");
	    	System.out.println("");
	    	System.out.println("");	

	    	this.petFirstName = savedPet.petFirstName;
			this.petLastName = savedPet.petLastName;
			this.typeOfPet = savedPet.typeOfPet;
			this.color = savedPet.color;
			this.age = savedPet.age;
			this.ageInput = savedPet.ageInput;
			this.weight = savedPet.weight;
			this.weightInput = savedPet.weightInput;
			this.hunger = savedPet.hunger;
			this.fatigue = savedPet.fatigue;
			this.thirst = savedPet.thirst;
			this.boredom = savedPet.boredom;
			this.choice = savedPet.choice;
			this.choiceInput = savedPet.choiceInput;

	    
	    	System.out.println("Here is how " + savedPet.petFirstName + " " + savedPet.petLastName + " is feeling today:" + "\n\n1. hunger = " + savedPet.hunger + "%" + "\n2. thirst = " + savedPet.thirst + "%" + "\n3. fatigue = " + savedPet.fatigue + "%" + "\n4. boredom = " + savedPet.boredom + "%" + "\n5. weight = " + savedPet.weight + " pounds");
	    	System.out.println("");
	    	System.out.println("");	

			
			

			String yesNoFlag;
			String choiceToString;

			do {    	
		    	System.out.println("Enter 1 - To feed " + savedPet.petFirstName);
		    	System.out.println("Enter 2 - To give " + savedPet.petFirstName +" something to drink");
				System.out.println("Enter 3 - To tuck " + savedPet.petFirstName +" to sleep");
				System.out.println("Enter 4 - To play with " + savedPet.petFirstName);
				System.out.println("Enter 5 - To exercise with " + savedPet.petFirstName);
				System.out.println("Enter 6 - To save your progress with " + savedPet.petFirstName);
				System.out.println("Enter 7 - To exit");
				System.out.println("");
		    	System.out.println("");

		    	savedPet.choiceInput = scanner.next();

		    	while (savedPet.validateNumber(savedPet.choiceInput) == false ){
					System.out.println("Invalid input, please try again.");
					System.out.println("Enter 1 - To feed " + savedPet.petFirstName);
			    	System.out.println("Enter 2 - To give " + savedPet.petFirstName +" something to drink");
					System.out.println("Enter 3 - To tuck " + savedPet.petFirstName +" to sleep");
					System.out.println("Enter 4 - To play with " + savedPet.petFirstName);
					System.out.println("Enter 5 - To exercise with " + savedPet.petFirstName);
					System.out.println("Enter 6 - To save your progress with " + savedPet.petFirstName);
					System.out.println("Enter 7 - To exit");
					System.out.println("");
			    	System.out.println("");
			    	
			    	savedPet.choiceInput = scanner.next();

			    	if((savedPet.choiceInput.matches("^[a-zA-Z]*$") || savedPet.choiceInput.matches("^[A-Z0-9]+$") || savedPet.choiceInput.isEmpty() || savedPet.choiceInput == " " || savedPet.choiceInput == null || savedPet.choiceInput.matches("^[!@#$%&*()_+=|<>?{}\\[\\]~-]*"))) {
					
						System.out.println("\nYour entry was invalid, please try again.");

						System.out.println("Enter 1 - To feed " + savedPet.petFirstName);
				    	System.out.println("Enter 2 - To give " + savedPet.petFirstName +" something to drink");
						System.out.println("Enter 3 - To tuck " + savedPet.petFirstName +" to sleep");
						System.out.println("Enter 4 - To play with " + savedPet.petFirstName);
						System.out.println("Enter 5 - To exercise with " + savedPet.petFirstName);
						System.out.println("Enter 6 - To save your progress with " + savedPet.petFirstName);
						System.out.println("Enter 7 - To exit");
						System.out.println("");
				    	System.out.println("");

						savedPet.choiceInput = scanner.next();

					}
			 	}

			 	savedPet.choice = Integer.parseInt(savedPet.choiceInput);        	


				if(savedPet.choice == 1) {

					savedPet.feedPet();

		    	}

		    	if(savedPet.choice == 2) {

		    		savedPet.waterPet();

		    	}

		    	if(savedPet.choice == 3) {

		    		savedPet.sleepPet();

		    	}

		    	if(savedPet.choice == 4) {

		    		savedPet.playWithPet();

		    	}

		    	if(savedPet.choice == 5) {

		    		savedPet.exercisePet();

		    	}

		    	if(savedPet.choice == 6) {
	    			this.save();
	    			
		    	}

		    	if(savedPet.choice == 7) {
		    		savedPet.exit();
		    		
		    	}
		    	

		    	System.out.println("\n\nHere is how " + savedPet.petFirstName + " " + savedPet.petLastName + " is feeling now:");
		    	System.out.println("\n1. hunger = " + savedPet.hunger + "%");
		    	System.out.println("2. thirst = " + savedPet.thirst + "%");
		    	System.out.println("3. fatigue = " + savedPet.fatigue + "%");
		    	System.out.println("4. boredom = " + savedPet.boredom + "%");
		    	System.out.println("5. weight = " + savedPet.weight + " pounds");
		    	System.out.println("");
		    	System.out.println("");
		    	System.out.println("Would you like to continue? (y/n)");
		    	System.out.println("Please enter y for yes and n for no.");

		    	this.petFirstName = savedPet.petFirstName;
				this.petLastName = savedPet.petLastName;
				this.typeOfPet = savedPet.typeOfPet;
				this.color = savedPet.color;
				this.age = savedPet.age;
				this.ageInput = savedPet.ageInput;
				this.weight = savedPet.weight;
				this.weightInput = savedPet.weightInput;
				this.hunger = savedPet.hunger;
				this.fatigue = savedPet.fatigue;
				this.thirst = savedPet.thirst;
				this.boredom = savedPet.boredom;
				this.choice = savedPet.choice;
				this.choiceInput = savedPet.choiceInput;

		    	yesNoFlag = scanner.next();

		    	if(yesNoFlag.equalsIgnoreCase("n")) {
		    		message();
		    		System.out.println("Goodbye...\n\n");
		    		System.exit(0);
		    	}


		    	if((savedPet.validateNumber(yesNoFlag) == true) && (yesNoFlag != "y")) {
		    		System.out.println("Would you like to continue? (y/n)");
		    		System.out.println("Please enter y for yes and n for no.");
		    		yesNoFlag = scanner.next();
		    	}



		    	System.out.println("");
	    		System.out.println("");


    			


		    } while (!yesNoFlag.equalsIgnoreCase("n"));
			

			inputData.close();
			inputFile.close();
			


		} catch(Exception e) { 
			System.out.println("Your Perfect Pet was not found.");

			//ioe.printStackTrace(); 

			System.out.println("Goodbye...\n\n");
			System.exit(0);

		} 


	}


	void message() {

		System.out.println("Save progress? (y/n)");
		System.out.println("Please enter y for yes and n for no.");

		Scanner scanner = new Scanner(System.in);

		String yesNoFlag;

		yesNoFlag = scanner.next();

		if(yesNoFlag.equalsIgnoreCase("y")) {

			this.petFirstName = petFirstName;
			this.petLastName = petLastName;
			this.typeOfPet = typeOfPet;
			this.color = color;
			this.age = age;
			this.ageInput = ageInput;
			this.weight = weight;
			this.weightInput = weightInput;
			this.hunger = hunger;
			this.fatigue = fatigue;
			this.thirst = thirst;
			this.boredom = boredom;
			this.choice = choice;
			this.choiceInput = choiceInput;

			save();

		} else {
			System.exit(0);
		}

	}

	


	
}
