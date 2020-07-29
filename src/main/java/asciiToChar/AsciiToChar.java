package asciiToChar;

import java.util.Scanner;

public class AsciiToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("****Converting ASCII Numbers to chars****");
		System.out.println("Please enter a series of ASCII numbers seperated by ',' and it will convert to chars");
		String input = scanner.nextLine();
		
		String[] strAscii = input.split("\\,");
		
		for(String ascii : strAscii) {
			System.out.print((char)(Integer.parseInt(ascii.trim())));
		}

	}

}
