#ifndef SERIALIZER_H
#define SERIALIZER_H

#include <string>

class Serializer {

	public:

		Serializer();
		Serializer(std::std::string petFirstName, std::std::string petLastName, std::string typeOfPet, int weight, std::string color, int age, int hunger, int fatigue, int boredom, int thirst);
		
		~Serializer();

		void deleteFile();
		void save();
		void load();
		void message();


	private:
			

};

#endif 