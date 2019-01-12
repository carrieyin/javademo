package class_int_copy;

import java.util.Scanner;

public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long sum = 0;
		long number = 0;
		do {  
			System.out.println("input number:");
			number = Long.parseLong(scanner.nextLine());
			sum += number;
		}while(number != 0);
		System.out.println("sum:" + sum);
		scanner.close();
	}

}
