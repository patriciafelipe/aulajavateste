package aula;

public class Aulateste {
	public static void main(String args[]) {
		String str = "Isto é uma String do java";
		String xyz = new String("Isto é uma String do java");

		if (str == xyz)
			System.out.println("IGUAL");
		else
			System.out.println("DIFERENTE");

		System.out.println("Tamanho da String:" + str.length());
		System.out.println("SubString:" + str.substring(0, 10));
		System.out.println("Caractere na posição 7:" + str.charAt(7));
	
		String[] palavras = str.split(" ");
		int i = str.indexOf("uma"); 
		if( str.startsWith("Olá") || str.endsWith("Mundo") ) {
			System.out.println();	
		}
		str = str.trim();
		System.out.println(str);
		str = str.replace('a','@');
		System.out.println(str);
		str = str.replaceAll("String","Cadeia de caracteres");
		System.out.println(str);
	}
}