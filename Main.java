/*
Alexander S. Carson
3/12/2025
Purpose: This program is designed to read in a file of data and output a file of data.
prepared for CSCI 2251.
Sources:
*/
/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?
Composition(Has-A relationship)
Q2: Color and Red are related
by which, Inheritance or Composition?
Inheritance(Is-A relationship)
Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
Inheritance(Is-A relationship)
Q4: Furniture and Desk are related
by which, Inheritance or Composition?
Inheritance(Is-A relationship)
Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
Composition(Has-A relationship)
*/
import java.io.File; //Import the File class to read files
import java.io.FileNotFoundException; //Import this class to handle errors
import java.io.FileWriter; //Import the FileWriter class to write to files
import java.io.IOException; //Import the IOException class to handle errors
import java.util.Scanner; //Import the Scanner class to read text files

public class Main
{
	public static void main(String[] args) {

		try {
			FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
			fileWriterOrder.write("testing");
			fileWriterOrder.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}
	}
	//Defines the person class
	public class Person {
		private String name;
		private int height;
		private int weight;
		//Constructor for the person class
		public Person(String name, int height, int weight) {
			this.name = name;
			this.height = height;
			this.weight = weight;
		}
		//Returns the string representation of the person class
		@Override
		public String toString() {
			return "Person{name='" + this.name + "', height=" + height + ", weight=" + weight + "}";
		}
	}
	// Defines the person list interface
	public interface PersonList {
		void add(Person new_person); // Adds a person to the list
		Person get(int index); // Returns the person at the given index
	}

	class PersonSet implements PersonList {
		private ArrayList<Person> personList;

		public PersonSet() {
			this.personList = new ArrayList<>();
		}
	}
}
		/*
		// Don't overcomplicate the data
		// reading. After skipping the
		// first row, you can use the 
		// following to read a row of
		// character info, assuming your
		// Scanner is named "fileReader"
		String name = fileReader.next();
		double height = fileReader.nextDouble();
		double weight = fileReader.nextDouble();
		*/


