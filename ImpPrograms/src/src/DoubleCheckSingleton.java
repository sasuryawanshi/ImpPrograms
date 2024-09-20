//The private constructor in Java is used to create a singleton class. A singleton class
//is a class in Java that limits the number of objects of 
//the declared class to one. A private constructor in Java ensures that only one object is created at a time.

public class DoubleCheckSingleton {
	private  static DoubleCheckSingleton instance;

	private DoubleCheckSingleton(){

	}

public DoubleCheckSingleton	getInstance(){
		if(instance == null){
			synchronized (DoubleCheckSingleton.class){
				if(instance == null){
					instance = new DoubleCheckSingleton();
				}			}

		}
    return instance;
}
}
