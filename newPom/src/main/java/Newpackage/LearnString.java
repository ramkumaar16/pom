package Newpackage;

public class LearnString {

	public static void main(String[] args) {
		/*StringBuffer sb = new StringBuffer();
		sb.append("RamKumaar");
		System.out.println(sb);
		sb.insert(3, " ");
		System.out.println(sb.reverse());	


		String str = "ramkumaar";
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.charAt(5));
		 for (String each : sp) {
	    	if(each.contains("a")) {
	    		System.out.println(each);
	    	}
	}*/


	String learn = "amazon";
	for (int i = 0; i < learn.length(); i++) {
		char ch = learn.charAt(i);
		if(i%2==0) {
			System.out.println(Character.toLowerCase(ch));
		}
		else {
			System.out.println(Character.toUpperCase(ch));   

		}
	}
}
}
