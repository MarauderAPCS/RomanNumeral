import java.util.Scanner;
public class RomanNumeral {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
	    System.out.print("Enter a Roman Numeral for me to convert : ");//prompt user for input
	    String input = key.nextLine().toUpperCase();//record given Roman numeral
	    
	    int Output = 0;//prepare output int
	    int prev = 0;//prepare previous number int 
		char[] rn = { 'I', 'V', 'X', 'L', 'C', 'D', 'M'};//array for Roman numerals
	    int[] an = { 1, 5, 10, 50, 100, 500, 1000};//array for values of Roman numerals
	    for(int i = input.length()-1;i>=0;i--) {//for length of the input, starting at the last value in the string
    		char currentchar = input.charAt(i);//get the last character
	    	for(int j = an.length-1;0<=j;j--) {//for the length of the array, starting at the last value in the array
	    		if(currentchar == rn[j]) {//if the current character from the user's input is in the Roman numeral array
	    			if(prev>an[j]) {//handler for things such as IV where you must subtract the first number from the second
			    		prev = (-1*an[j]);	//do the subtraction if required
		    		}else {
		    			prev = an[j];//if no subtraction is required just set the previous number to the current one and move on
		    		}
	    			Output += prev;//add the previous number to output
		    		//System.out.println(prev);//this is just a debug line to make sure the conversion is correct feel free to uncomment to see how it's working
	    		}
	    	}
    	}
	    System.out.println("Your Roman Numeral converted to " + Output);//show user the result
	}

}
