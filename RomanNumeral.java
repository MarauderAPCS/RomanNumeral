import java.util.Scanner;
public class RomanNumeral {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
	    System.out.print("Enter a number for me to convert to Roman Numerals: ");
	    int input = key.nextInt();
	    
	    String RomanOutput = "";
		String[] rn = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
	    int[] an = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
	    for(int i =an.length-1;0<=i;i--) {
    		while (input >= an[i]) {
    		RomanOutput += rn[i];
	        input -= an[i];
    		}
    	}
	    System.out.println("Your Roman Numeral is " + RomanOutput);
	}

}
