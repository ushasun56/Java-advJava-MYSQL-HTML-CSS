package reverseswapstring;
import java.util.*;

public class swapreverse {

	public static void main(String[] args)
	{
		
		 String number = "usha";
	        System.out.println("original String: " + number);
	        String reversed = inPlaceReverse(number);
	        System.out.println("reversed String: " + reversed);
	    }

	    /*
	     * Java method to replace a String in place
	     */
	    public static String inPlaceReverse(final String input) {
	        final StringBuilder builder = new StringBuilder(input);
	        int length = builder.length();
	        for (int i = 0; i < length / 2; i++) {
	            final char current = builder.charAt(i);
	            final int otherEnd = length - i - 1;
	            builder.setCharAt(i, builder.charAt(otherEnd)); // swap
	            builder.setCharAt(otherEnd, current);
	        }

	        return builder.toString();
	    }
	
	}


