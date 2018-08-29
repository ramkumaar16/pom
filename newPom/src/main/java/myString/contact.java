package myString;

public class contact {

	public static void main(String[] args) {
		// concat
		String str = "msDhoni is a finisher";
		String concat = str.concat(" ram");
		System.out.println(concat);
		System.out.println(str.charAt(17));

		//charArray
		String str1 = "vKholi";
		char[] charArray = str1.toCharArray();
		for (char c : charArray) {
			System.out.println(c);
		}
		System.out.println(charArray);

		//chArit
		System.out.println(str1.charAt(3));
		//uppercase
		System.out.println(str1.toUpperCase());
		System.out.println(str.toLowerCase());

		//index
		String str3 = "sureshraina";
		int indexOf = str3.indexOf("h");
		System.out.println(indexOf);
		//split
		String str4 ="teah,leaf,chennai";
		String[] split = str4.split("e",3);
		for (String each : split) {
			System.out.println(each);
		}
		String[] split2 = str4.split("l");
		for (String each2 : split2) {
			System.out.println(each2);
		}
		//index
		String str5 = "suhanakhan";
		int indexOf2 = str5.indexOf("n");
		System.out.println(indexOf2);
		int indexOf3 = str5.indexOf("k");
		System.out.println(indexOf3);
		int indexOf4 = str5.indexOf("a", 5);
		System.out.println(indexOf4);
		System.out.println(str5.indexOf("n", 2));
		
		String str6 ="ramarajan ram";
		String substring = str6.substring(0, 5);
		System.out.println(substring);
		
        




	}


}
