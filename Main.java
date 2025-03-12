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
import java.io.FileNotFoundException;
import java.io.FileWriter; //Import the FileWriter class to write to files
import java.io.IOException; //Import the IOException class to handle errors
import java.util.Scanner; //Import the Scanner class to read text files

public class Main 
{
	public static void main(String[] args) 
	{
		try{
			File inputTxtFile = new File("hr.txt"); // Create a File object
			Scanner txtFileReader = new Scanner(inputTxtFile); // Create a Scanner object
			txtFileReader.close(); // Close the scanner to avoid a resource leak
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	public class Person {
			
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
		
		
		
		/*try
		{	
			FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
			fileWriterOrder.write("testing");
			fileWriterOrder.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}*/
	}
}
