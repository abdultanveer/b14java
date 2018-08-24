package rjt.b14.exceptions;


public class Abdul {
	
	public void eat()  {
		
	}

	public static void validate(int age)throws InvalidAgeException  {
		if(age >18) {
			System.out.println("welcome to vote");
		}
		else {
			throw new InvalidAgeException();
			//throw new ArithmeticException("not allowed to vote");
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("b4 gc collects this obj it'll execute finalize");
		System.out.println("in this method you'll have to release the "
				+ "resources that you have acquired like close files, close db"
				+ "connections etc");


		System.out.println("abdul's object is about to be cleaned by gc");
	}
}
