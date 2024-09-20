package ImpPrograms.exceptionPractice;

public class Parent {
	void m1() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("In m1 parent");
    }

}

class Child extends Parent{
	 void m1() throws IndexOutOfBoundsException
	    {
	        System.out.println("In m1 child");
	    }
	
}

class Test {

    public static void main(String[] args) {
        Parent a=new Child();
        a.m1();
    }
}