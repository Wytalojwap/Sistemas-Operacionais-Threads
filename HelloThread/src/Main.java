public class Main {
	public static void main(String[] args) {

	// 01 - Preenchimento do novo vetor em paralelo por 10 trheads...
		int[] vetorOriginal = MyRunnable.gerarNumerosAleatorios();

		for (int i = 0; i < 10; i++) {
			new Thread(new MyRunnable(i, vetorOriginal)).start();
		}
	}
}
