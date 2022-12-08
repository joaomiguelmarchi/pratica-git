package pratica3;

/**
 * 
 * @author João Miguel
 *
 */

public class MainGit {

	public static void main(String[] args) {
	
	}
	/**
	 * 
	 * Pega um vetor e multiplica todos os elementos
	 * desse vetor e retorna um novo vetor.
	 * 
	 * @param vetor
	 * @return a
	 */
	
	public Double[] multiplicaVetor(Double[] vetor) {
		Double[] a = new Double[vetor.length];
		for (int i=0;i<a.length; i++) {
			a[i] = vetor[i] * vetor[i];
		}
		return a;
	}
}