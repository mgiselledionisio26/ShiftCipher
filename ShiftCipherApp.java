package quiz;
import java.util.Scanner;

public class ShiftCipherApp {
	public static void main(String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
	 int shift;
	 String message;
	 
	 System.out.println("Shift Cipher Algorithm Quiz");
	 System.out.println("===========================");
	 System.out.print("How many shifts would you want to use? ");
	 try {
	 shift = sc.nextInt();
	 sc.nextLine(); // Consume the next line
	 } catch (Exception e) {
	 System.out.println("That is not an integer.");
	 System.exit(0);
	 return;
	 }
	 System.out.println("Please enter a message to hit enter to encrypt it.");
	 message = sc.next();
	 sc.close();
	 // Show the Ciphered string
	 // Show the Deciphered string
	 
	
	 ShiftCipher me = new ShiftCipher (message, shift);
	 me.cipher();
	 System.out.println ("Cipher: " + me.getCiphered());
	 me.decipher();
	 System.out.println ("Decipher: " + me.getDeciphered());
	 }
}
