package myString;

public class MyclassString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi this is me";
		String text = new String("Teshleaf , chennai");
		//lenth

		System.out.println(text.length());
		//charAt
		System.out.println(text.charAt(6));

		//char Array
		System.out.println(text.toCharArray());
		System.out.println(text.toCharArray());

		char[] array = str.toCharArray();
		for ( char  c : array) {
			System.out.println(c);

		}
		//chareit
		System.out.println(str.indexOf("5"));

		//concat
		String ram = "sureshraina";
		String concat = ram.concat("5");
		System.out.println(concat);
			
		
		
		System.out.println(str.concat(text));
		System.out.println(str.concat("").concat(text));

		//upper case & lower case
		System.out.println(str.toLowerCase());
		System.out.println(text.toUpperCase());
		System.out.println(str.toUpperCase());

		//sub string
		String buff = "ramarajan ram";
		//buff.substring(2,4);
		CharSequence subSequence = buff.subSequence(1,5);
		System.out.println(subSequence);
		String substring = buff.substring(0,4);
		System.out.println(substring);
		System.out.println(buff.subSequence(0,5));
		System.out.println(buff.substring(0,4));

		//trim
		
		String buf = "   new world";
		System.out.println(buf);

		System.out.println(buf.trim());

		//split
		//String str1 = "hi this is@me";
		String text1 = new String("Tesh@leaf@chennai");
		String[] split = text1.split("@,2");
		for (String each : split) {
			System.out.println(each);
		}
        //index
		String ra ="ramcmkumaar";
		int indexOf = ra.indexOf("k");
		System.out.println(indexOf);
		int indexOf2 = ra.indexOf("a",3);
		System.out.println(indexOf2);
		
		//repalce
		String am = "vijaykumar";
		String replace = am.replace("v", "r");
		System.out.println(replace);
		
		String am1 ="suryakumar";
		String replaceFirst = am1.replaceFirst("ur", "ku");
		System.out.println(replaceFirst);
		String replace2 = am1.replace("s", "i");
		System.out.println(replace2);
		String replaceAll = am1.replaceAll("kumar", "ram");
		System.out.println(replaceAll);

		StringBuffer buffer = new StringBuffer(am);
		StringBuffer reverse = buffer.reverse();
		System.out.println(reverse);
		
		String ram1 ="you are my world";
		StringBuilder build = new StringBuilder(ram1);
		StringBuilder reverse2 = build.reverse();
		System.out.println(reverse2);
		
		
	
	}

}
