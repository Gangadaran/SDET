package week2;

;

public class LearnString {
	
	

	public static void main(String[] args) {
	
		String name = "Gangadaran";  // String litral
		String str = new String("Gangadaran"); // String object
		StringBuilder sb = new StringBuilder("Meena");
		char[] array = {'G','A','N','G','A'};
		
		char a =name.charAt(1);
		int codePointAt = name.codePointAt(0); // return the asccii value
		int codePointBefore = name.codePointBefore(1); // return the asccii value
		int comp= name.compareTo(str); // Compares this string to the specified string.
		int compareToIgnoreCase = name.compareToIgnoreCase(str);
		String concat = name.concat(str); //Concatenates the specified string to the end of this string
		boolean contains = name.contains("n"); //Returns true if this string contains the specified sequence of characters.
		boolean contentEquals = name.contentEquals(sb); //  to check whether the content of a String is equal to the content of a specified StringBuffer or StringBuilder object.
		String copyValueOf = name.copyValueOf(array); // Copies the specified characters into a new string.
		boolean endsWith = name.endsWith("n"); //Returns true if this string ends with the specified suffix.
		boolean equals = name.equals(str);
		boolean equalsIgnoreCase = name.equalsIgnoreCase(str);
	//  String format = name.format("Name: %s, aget: %s, job: %s"); // Returns a formatted string using the specified format string and arguments.
		int hashCode = name.hashCode(); // Returns the hash code for this string.
		int indexOf = name.indexOf('a'); // Returns the index of the first occurrence of the specified character in this string.
		int indexOf2 = name.indexOf("G"); // Returns the index of the first occurrence of the specified substring in this string.
		int indexOf3 = name.indexOf('a', 2); // Returns the index of the first occurrence of the specified character in this string, starting at the specified index.
		int indexOf4 = name.indexOf("n", 3); // Returns the index of the first occurrence of the specified substring in this string, starting at the specified index.
		String intern = name.intern(); // Returns the canonical representation for the string object.
		boolean empty = name.isEmpty(); // Returns true if this string is empty.
		int lastIndexOf = name.lastIndexOf('a'); // Returns the index of the last occurrence of the specified character in this string.
		int lastIndexOf2 = name.lastIndexOf('a', 5); // Returns the index of the last occurrence of the specified character in this string, starting at the specified index.
		int lastIndexOf3 = name.lastIndexOf("a"); // Returns the index of the last occurrence of the specified string in this string.
		int lastIndexOf4 = name.lastIndexOf("a", 5); // Returns the index of the last occurrence of the specified string in this string, starting at the specified index.
		int length = name.length(); //Returns the length of this string
		boolean matches = name.matches("^[A-Z][a-z]+\\s[A-Z][a-z]+!$"); // Returns true if this string matches the specified regular expression.
		String replace = name.replace('a', 'D'); // Replaces all occurrences of the specified old character with the specified new character.
		String replaceAll = name.replaceAll("d", "s"); // Replaces all occurrences of the specified regular expression with the specified replacement string.
		String replaceFirst = name.replaceFirst("a", "f"); //  Replaces the first occurrence of the specified regular expression with the specified replacement 
		String[] split = name.split("a"); // Splits this string around matches of the specified regular expression.
		boolean startsWith = name.startsWith("G"); // Returns true if this string starts with the specified prefix.
		String substring = name.substring(2);
		String substring2 = name.substring(2, 3);
		String lowerCase = name.toLowerCase();
		String upperCase = name.toUpperCase();
		String trim = name.trim(); // Removes all leading and trailing whitespace from this string.
		char[] charArray = name.toCharArray(); // Returns a character array containing the characters of this string.
		String string = name.toString(); // Returns a string representation of this object.
		String valueOf = String.valueOf(str);
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(valueOf);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
