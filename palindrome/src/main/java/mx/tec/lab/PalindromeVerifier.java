package mx.tec.lab;

public class PalindromeVerifier {
	
	public static boolean verify(String input) {
		
		String inputAux = input.replaceAll("\\s", "");
		StringBuilder builder = new StringBuilder();
		
		if(input.length() == 1) {
			
			return true;
		}
		
			
		for(int i = input.length()- 1; i >= 0; i--) {
			
			builder.append(inputAux.charAt(i));
		}
		
		return builder.toString().equals(input);
		
	}

}
