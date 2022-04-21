package task6;

import java.util.Scanner;
import java.util.Vector;

public class vectorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec = new Vector<Integer>(20,5);
		
		boolean stop = false;
		int op = 0;
		do {
			Scanner myObj = new Scanner(System.in);
			System.out.print("Enter a Number! = ");
			op  = myObj.nextInt();
			if(vec.contains(op) == false) {
				vec.add(op);
			}else {
				System.out.println(vec);
				System.out.println("Bye! ");
				stop = true;
			}		
			
		} while (stop == false);
	}

}
