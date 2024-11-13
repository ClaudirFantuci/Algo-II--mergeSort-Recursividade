package recursao;

public class SomarArray {

    // EXERC 2
	public static void main(String[] args) {
		int [] teste1 = {0,1,2,3,4,5,6};
		int [] teste2 = {10,10,10,10,10,10,10};
		
		int resultado1 = somaArray(teste1, 0);
		int resultado2 = somaArray(teste2, 0);
		System.out.println(resultado1);
		System.out.println(resultado2);
	}
    public static int somaArray(int[] array, int indice) {
        if (indice == array.length) {
            return 0;
        }
        return array[indice] + somaArray(array, indice + 1);
    }
    
}
