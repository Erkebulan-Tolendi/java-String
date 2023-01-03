import java.util.Scanner;

public  class pt9109{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a= sc.nextInt();
		String word ="Hello world";
		char uwEl = word.charAt(a);
		String newWord = word.replace(""+uwEl, "");
		System.out.println(newWord);
		
	}
}

    /*String word ="Hello world";
		char uwEl = word.charAt(2);
		String newWord = word.replace(""+uwEl, "");
		System.out.println(newWord);*/