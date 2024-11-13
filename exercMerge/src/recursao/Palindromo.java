package recursao;

public class Palindromo {
	public static void main(String[] args) {
		String teste = "anaa";
		if(palindromo(teste, 0, teste.length() - 1) == true) {
			System.out.println("é palindromo");
		}
		else {
			System.out.println("Não é palindromo");
		}
	}
	
	private static boolean palindromo(String s, int inicio, int fim) {
		if (inicio >= fim) {
			return true;
		}

		if (s.charAt(inicio) != s.charAt(fim)) {
			return false;
		}

		return palindromo(s, inicio + 1, fim - 1);
	}
}

