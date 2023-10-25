public class ExeString{
	public static void main(String[] args){
	
		String word= "Alfredo";
		System.out.println(test(word));

	}

	public static char test(String word){
		char letter = word.charAt(0);
		

		return letter.toLowerCase();
	}
}