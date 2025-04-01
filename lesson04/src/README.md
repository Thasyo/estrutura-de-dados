# COMPLEXIDADE DE ALGORITMOS

## Busca Linear / Busca Sequencial

```
        int[] vetor = new int[8];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.print("\nBuscar número: ");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();

        boolean achou = false;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == buscado){
                achou = true;
                break;
            }
        }

        if(achou){
            System.out.println("Achou");
        }else{
            System.out.println("Não achou");
        }
```

# Análise do código

## Complexidade de Tempo:

A complexidade de tempo de um algoritmo descreve o número de operações que ele realiza em função do tamanho da entrada.

### Passos do Código:

- Preenchimento do vetor: O vetor é preenchido com 8 valores aleatórios, e esse processo ocorre em um loop que vai de i = 0 até i < vetor.length, ou seja, até o índice 7 (no total de 8 iterações). Cada iteração envolve uma operação de geração de número aleatório e atribuição ao vetor.

  - Complexidade: O número de iterações é constante (8), então isso tem complexidade O(1).

- Busca Linear: A parte principal do código é a busca, onde o algoritmo percorre o vetor para verificar se o número buscado está presente. O loop de busca percorre o vetor desde o início até o final, fazendo comparações a cada iteração.

  - No pior caso, o algoritmo pode precisar percorrer o vetor inteiro para encontrar o elemento ou para confirmar que ele não está presente. Isso ocorre quando o elemento procurado está no final do vetor ou não está no vetor de forma alguma.

  - O número de iterações no pior caso é igual ao tamanho do vetor (n), ou seja, O(n).

### Complexidade Total de Tempo:

- O preenchimento do vetor tem complexidade O(1), mas a busca linear tem complexidade O(n), onde n é o número de elementos no vetor.

- Portanto, a complexidade total de tempo é O(n), ou seja, o tempo de execução cresce linearmente conforme o tamanho do vetor.

## Complexidade Espacial

A complexidade espacial descreve o uso de memória do algoritmo.

- O vetor vetor tem um tamanho fixo de 8 elementos (no caso específico do código, mas isso poderia ser modificado conforme necessário).

- Além disso, o algoritmo usa algumas variáveis extras (leitor, buscado, achou, etc.), mas todas são variáveis simples de tipo primitivo e ocupam espaço constante.

Como o tamanho do vetor é fixo (8 elementos), a complexidade espacial é O(1), pois a memória necessária não depende do tamanho do vetor, já que o vetor é alocado estaticamente (com um número fixo de elementos).

## Busca Linear

A busca linear (ou busca sequencial) é um algoritmo de pesquisa simples em que o valor procurado é comparado com cada elemento do vetor até encontrar uma correspondência ou até que todos os elementos tenham sido verificados. Sua principal característica é a simplicidade, mas sua desvantagem está na eficiência, especialmente quando o vetor é grande.

### Características da Busca Linear

- Melhor caso: Quando o elemento buscado está na primeira posição do vetor. Nesse caso, a busca termina imediatamente após a primeira comparação. A complexidade de tempo seria O(1).

- Pior caso: Quando o elemento buscado está na última posição ou não está presente no vetor. O algoritmo precisaria percorrer todo o vetor, o que dá complexidade O(n).

- Caso médio: Em média, o algoritmo fará aproximadamente n/2 comparações, mas isso ainda resulta em O(n), já que a constante é desprezada na análise de complexidade assintótica.
