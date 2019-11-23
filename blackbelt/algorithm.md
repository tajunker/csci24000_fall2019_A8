# Goals:
This project is designed to help you practice a number of aspects of object-oriented programming, specifically the construction of an abstract data type (or two), inheritance from an abstract class or interface, and data persistence through object serialization.  

# Overview:
You are creating a 'virtual pet' program.  The pet object will have a number of attributes, representing the state of the pet.  You will need to create some entity to represent attributes in general, and you will also need to create some specific attributes.  You will then create a generic pet class (or interface) which has these specific attributes.  Finally you will make at least one subclass of the pet class which will be a specific type of pet, and at least one instance of that class.

# Input:
User inputs text for various variables like pet name last name, type of pet, weight, age and other information. Once that information is entered you can interact with the program and your Perfect Pet selecting an input from a menu. Each time you interact with the pet information is updated and saved to an output file. 

# Output: 
- Data is saved to a .ser file
- Data .ser is read from the output file which loads the program with the pet information
- The outputed file allows user to save pet information.

# Steps:
For this program we have one main function called PerfectPetApplications(). We also make use of two other boolean functions called validateAlphabetical() and validateNumber(), along with exit(), load(), save(), message(), and deleteFile(). The class PerfectPet has multiple methods as well feedPet(), sleepPet(), playWithPet(), exercisePet(), waterPet() which allows you to interact to with your pet.

- PerfectPetApplications(): This program has a main function in PerfectPetApplications()
- validateAlphabetical(): Validates if string is alphabetical
- validateNumber(): Validates if string is number
- exit(): exits the program
- load(): loads pet
- save(): saves pet
- message(): prints message to ask if user wants to save pet before calling save() function to save pet.
- deleteFile(): Deletes files that were created
- feedPet(): Feeds pet and lowers hunger level
- sleepPet(): Puts pet to sleep and lowers fatigue level
- playWithPet(): Plays with pet and lowers boredom level
- exercisePet(): Excersises pet and lowers pet weight
- waterPet(): Gives pet water and lowers pet thirst
- This program allows you to save your progress which saves a Pet object to a .ser file and allows you to read from object to load previously saved data.
- Finally we close all files and exit program
- All of this can be compiled with the makefile provided, which also clean and run commands.