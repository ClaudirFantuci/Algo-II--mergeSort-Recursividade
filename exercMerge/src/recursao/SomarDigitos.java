package recursao;

public class SomarDigitos {
    // EXERC 5
	public static void main(String[] args) {
		int teste = 12;
		System.out.println(somarDigitos(teste));
	}
    public static int somarDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }

        return (numero % 10) + somarDigitos(numero / 10);
    }

}
