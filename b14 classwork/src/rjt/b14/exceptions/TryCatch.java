package rjt.b14.exceptions;

import java.io.File;

public class TryCatch {
	
	public static void main(String[] args) {
		/*File file = new File("abc.txt");
		file.createNewFile();*/
		
		
		
		try {
			System.out.println("opened some files and n/w connection");
			int b[] = new int[5];
			
			b[5] = 10;
			int a = 10/0; // medicine is not available
		} 
		
		
		/*catch(ArithmeticException ae) {//abdul
			System.out.println("arithmetic exception occured");
		}
		catch (ArrayIndexOutOfBoundsException aiobe) {//shiva
			System.out.println("ArrayIndexOutOfBoundsException exception occured");

		}

		catch (Exception e) {//exception handler ansari
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("yang is speaking with abdul");

		}
		*/
		finally {
			//System.out.println("b4 proceeding, closing files and n/w connection");

		}
		System.out.println("b4 proceeding, closing files and n/w connection");

		System.out.println("yang will continue with rest of the program");
	}

}
