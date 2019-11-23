#ifndef PERFECTPET_H
#define PERFECTPET_H

#include "perfectPet.h"
#include <string>

class PerfectPet {

	public:
		
		PerfectPet();
		PerfectPet(std::std::string petFirstName, std::std::string petLastName, std::string typeOfPet, int weight, std::string color, int age, int hunger, int fatigue, int boredom, int thirst);

		~PerfectPet();

		void feedPet();
		void sleepPet();
		void playWithPet();
		void exercisePet();
		void waterPet();
		bool validateAlphabetical(std::string stringOfCharacters);
		bool validateNumber(std::string number);
		void exit();


	private:
		
		std::string = petFirstName;
		std::string = petLastName;
		std::string = typeOfPet;
		int = weight;
		std::string = color;
		int = age;
		int = hunger;
		int = fatigue;
		int = boredom;
		int = thirst;


};

#endif 

