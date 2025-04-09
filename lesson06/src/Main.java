public class Main {
    public static void main(String[] args) {
        // COMPLEXIDADE DE ALGORITMOS - BUBBLE SORT (ORDENAÇÃO) - O(n^2)
        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        long inicio = System.currentTimeMillis();
        long fim;
        //BUBBLE SORT O(n^2): Complexidade Quadrática
        int aux;
        for(int i = 0; i < vetor.length; i++) { // O(n)
            for (int j = i + 1; j < vetor.length; j++) { // O(n)
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        fim = System.currentTimeMillis();

        // Vetor ordenado.
        System.out.println("\nVetor Ordenado:\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }


        //Tempo Para Ordenar vetor
        System.out.println("Tempo para Ordenar Vetor: " + (fim - inicio) + " Milisegundos");
    }
}