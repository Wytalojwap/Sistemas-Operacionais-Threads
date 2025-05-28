import java.util.ArrayList;
import java.util.Random;

public class MyRunnable implements Runnable {
	int i;
	int[] vetorOriginal;

	public MyRunnable(int i, int[] vetorOriginal) {
		this.i = i;
		this.vetorOriginal = vetorOriginal;
	}

	// 01 - a - Preencha um vetor de tamanho 1000 com número inteiros positivos aleatórios
	public static int[] gerarNumerosAleatorios() {
		Random rand = new Random();
		int[] numeros = new int[1000];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(1000) + 1;
		}
		return numeros;
	}

	@Override
	public void run() {
		int tamanhoIntervalo = vetorOriginal.length / 10;
		int inicio = i * tamanhoIntervalo;
		int fim;

		if (i == 9) {
			fim = vetorOriginal.length;
		} else {
			fim = inicio + tamanhoIntervalo;
		}

		ArrayList<Integer> multiplos = new ArrayList<>();
	
	//01 - b - preencha um novo vetor com os múltiplos de 3 e 7 do primeiro vetor
		for (int idx = inicio; idx < fim; idx++) {
			int num = vetorOriginal[idx];
			if (num % 3 == 0 && num % 7 == 0) {
				multiplos.add(num);
			}
		}
	
	//01 - c - imprima o vetor resultante na tela
		System.out.println("Thread " + i + ": quantidade de múltiplos = " + multiplos.size());
		for (int j = 0; j < multiplos.size(); j++) {
			System.out.println("Thread " + i + " - Elemento " + j + ": " + multiplos.get(j));
		}
	}
}
