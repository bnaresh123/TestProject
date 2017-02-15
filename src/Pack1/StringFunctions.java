package Pack1;

public class StringFunctions {
	public static void main(String[] args) {
		String str="the rain have been started";
		//size
		System.out.println("Total chars in the string: "+str.length());
		
		//compare functions
		String str1="The rain have been started";
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		//to get the index of the char
		System.out.println(str.indexOf('d'));
		
		//to get the char of the index
		System.out.println(str.charAt(25));
		System.out.println(str.charAt(4));
		
		//substring
		System.out.println(str.substring(8));  //print 
		System.out.println(str.substring(13));
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,8));
		System.out.println(str.substring(8,13));
	}
}
