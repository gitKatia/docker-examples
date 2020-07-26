package com.kat;

public class MyApplication {

	public static void main(String[] args) throws InterruptedException {

		for(int k = 0; k < 100; k++) {
			System.out.println("Execution number " + k);
			Thread.sleep(3000);
		}
	}

}
