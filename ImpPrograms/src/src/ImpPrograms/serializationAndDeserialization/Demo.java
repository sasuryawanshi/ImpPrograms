package ImpPrograms.serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {
	static final long serialVersionUID=1500000;
	
	public int a;
	public String b;

	// Default constructor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

class TestSerialization {

	public static void main(String[] args) {
		Demo object = new Demo(1, "geeksforgeeks");
		String filename = "E://file.txt";

		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}
	
		 Demo object1 = null;
	 try
     {  
         // Reading the object from a file
         FileInputStream file = new FileInputStream(filename);
         ObjectInputStream in = new ObjectInputStream(file);
          
         // Method for deserialization of object
         object1 = (Demo)in.readObject();
          
         in.close();
         file.close();
          
         System.out.println("Object has been deserialized ");
         System.out.println("a = " + object1.a);
         System.out.println("b = " + object1.b);
     }
      
     catch(IOException ex)
     {
         System.out.println("IOException is caught");
     }
      
     catch(ClassNotFoundException ex)
     {
         System.out.println("ClassNotFoundException is caught");
     }

}}