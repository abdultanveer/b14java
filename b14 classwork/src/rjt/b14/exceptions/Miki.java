package rjt.b14.exceptions;

import java.io.IOException;

public class Miki {
	
	public void m() {
		
			try {
				n();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("io exception handled in m");
			}
		
	}
	public void n() throws IOException {

		o();
		System.out.println("io exception propogated in n");

		//as n is not handling, it'll fwd m
	}
	public void o() throws IOException {
		System.out.println("io exception occurs  in o");

		throw new IOException();
		//int a = 10/0;
		//since o isn't handling exception
		//it will forward that exception to n
	}


	public static void main(String[] args) {
		/*Miki mikiGuo = new Miki();
		mikiGuo.m();*/
		Abdul a = new Abdul();
		//a.finalize();
		a.eat();
		 a = null; //stricken out chap 2 in table of contents
		 System.gc();
		try {
			Abdul.validate(15);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
