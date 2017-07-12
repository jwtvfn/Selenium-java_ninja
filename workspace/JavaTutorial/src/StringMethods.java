
public class StringMethods {

	public static void main(String[] args) {
		String str = "Some shit written for test purpose";
		/*String strx = "checking "
				+ "pressing "
				+ "shift + enter "
				+ "and "
				+ "it"
				+ "works";
			*/
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "";
		String str4 = "    space in  and sprace out   ";
		
		System.out.println(str);		
				
		System.out.println(str.length());
		
		System.out.println(str.charAt(2));
		
		System.out.println(str.concat(" append bla bla bla"));
		
		System.out.println("if sentence contains \"shi\" - \n\t\t\t\t"+ str.contains("shi"));
		System.out.println("if sentence contains \"aq\" - "+ str.contains("aq"));
		
		System.out.println("if str starts with \"So\" - " + str.startsWith("So"));
		System.out.println("if str starts with \"shi\" - " + str.startsWith("shi"));
		System.out.println("if str starts with \"shi\" with 5 offset - " + str.startsWith("shi", 5));
		
		System.out.println(str.endsWith("la"));
		System.out.println(str.endsWith("b"));
		
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str2));
		
		System.out.println("Index of \"t\" is: " + str.indexOf("t"));
		System.out.println(str.indexOf("q"));
		
		System.out.println(str.isEmpty());
		System.out.println(str3.isEmpty());
		
		System.out.println("coś tam cos tam");
		System.out.print("i druga linijka, po której trzeba ręcznie dać \"\\n\"\n");
		
		System.out.println(str4.trim());
		
		System.out.println(str.replace("shit", "stuff"));
		System.out.println(str.replace("t", "k"));
		
		System.out.println(str.substring(6, 10));
		System.out.println(str.substring(15));
		System.out.println(str.subSequence(6, 10));
		
		System.out.println(str.toCharArray());

		
		// zarzucić filmik 20 - czas 7:00 przecwiczyć zmianę stringu na tablice znaków i iteracje po niej
		
		char[] charArray = str.toCharArray();
		for (int i=0; i<charArray.length; i++){
			System.out.println("For index: " + i + " the char value is: " + charArray[i]);
		}
		
		
		// sprobować też zrobić iterację po stringu jak w pythonie
		for (int i=0; i<str.length(); i++){
			System.out.println(str.toCharArray()[i]);
		}

		for (int i = 0; i < str.length(); i++){
			System.out.println("String iteration: "+ str.subSequence(i, i+1));
		}
		
		for (int i = 0; i < str.length(); i++){
			System.out.println("String iteration2: "+ str.charAt(i));
		}
				// bezpośrednio się nie da, ale można na bierząco na 3 sposoby :) aczkolwiek raczej bardziej obciązające
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		
		

	}

}
