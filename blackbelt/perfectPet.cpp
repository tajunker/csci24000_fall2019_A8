#include "perfectPet.h"
#include "serializer.h"
#include <iostream>
#include <std::string>

PerfectPet::PerfectPet() {
	PerfectPet::serializer = new Serializer();
}

PerfectPet::PerfectPet(std::std::string petFirstName, std::std::string petLastName, std::string typeOfPet, int weight, std::string color, int age, int hunger, int fatigue, int boredom, int thirst) {
	PerfectPet::petFirstName = petFirstName;
	PerfectPet::petLastName = petLastName;
	PerfectPet::typeOfPet = typeOfPet;
	PerfectPet::weight = weight;
	PerfectPet::color = color;
	PerfectPet::age = age;
	PerfectPet::hunger = hunger;
	PerfectPet::fatigue = fatigue;
	PerfectPet::boredom = boredom;
	PerfectPet::thirst = thirst;
}

PerfectPet::~PerfectPet() {
	delete serializer;
}


void feedPet(){

}

void sleepPet() {

}

void playWithPet(){

}


void exercisePet(){

}


void waterPet(){

}

bool validateAlphabetical(std::string stringOfCharacters){

}


bool validateNumber(std::string number){

}


void exit(){
	
}