public class cpt11{
	public static void main(String[] args) {
		String word = "I love Cpp and Cpp";
		String newWord = word.replaceAll("Cpp","JAVA");

		System.out.println("Word "+word);
		System.out.println("NewWord: "+newWord);

		System.out.println();
		System.out.println();

		String newWord2 = word.replaceFirst("Cpp","Java");
		System.out.println("newWord2: "+newWord2);
	}
}