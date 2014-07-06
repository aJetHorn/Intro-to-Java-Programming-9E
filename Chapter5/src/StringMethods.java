/*
 * Java has a lot of built-in methods for String manipulation
 * But, someone had to write them, right? 
 * 
 * I'm going to try to implement some of the methods without calling the String method itself
 * There is really no point to these methods, and most would be silly to ever implement
 * 
 * Most of this is trivial and is 
 */
public class StringMethods {
	public static void main(String args[]){
		
		String testString = "Hello, World!";
		String testSuffix = "ld!";
		final int CHAR_INDEX = 3;
		System.out.println("Length of " + testString + " is " + length(testString));
		System.out.println("Character at " + CHAR_INDEX + " is " + charAt(testString, CHAR_INDEX));
		System.out.println("Does " + testString + " end with \"" + testSuffix + "\"? " + endsWith(testString,testSuffix));
		System.out.println("Hash code: " + hashCode(testString));
		System.out.println("Is the String empty? " + isEmpty(testString));
		System.out.println("To upper case: " + toUpperCase(testString));
		System.out.println("To lower case: " + toLowerCase(testString));
		
	}
	
	
  public static int length(String s){
		return s.toCharArray().length;
	}
  
  public static char charAt(String s, int i){
	  return s.toCharArray()[i];
  }
  
  public static boolean endsWith(String s, String suffix){
	  if (s.length() < suffix.length()){
		  return false;
	  }
	  return s.substring(s.length()-suffix.length(),s.length()).equals(suffix);
  }
  
  //replicates hashCode method
  public static int hashCode(String s){
	  int length = s.length();
	  char[] charArray = s.toCharArray();
	  int hashCode = 0;
	  for (int i = 0; i < length; i++){
		  hashCode = 31 * hashCode + charArray[i];
	  }
	  return hashCode;
  }
  
  public static boolean isEmpty(String s){
	  return s.length() == 0;
  }
  
  public static String toUpperCase(String s){
	  char[] charArray = s.toCharArray();
	  for (int i = 0; i < charArray.length; i++){
		  if (charArray[i] >= 'a' && charArray[i] <= 'z'){
			  charArray[i] = (char)(charArray[i] - 'a' + 'A');
		  }
	  }
	  return new String(charArray);
  }
  
  public static String toLowerCase(String s){
	  char[] charArray = s.toCharArray();
	  for (int i = 0; i < charArray.length; i++){
		  if (charArray[i] >= 'A' && charArray[i] <= 'Z'){
			  charArray[i] = (char)(charArray[i] - 'A' + 'a');
		  }
	  }
	  return new String(charArray);
  }


  
}
