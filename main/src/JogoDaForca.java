import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class JogoDaForca {

    private String palavraSecreta;
    private char[] progresso;
    private Set<Character> letrasErradas;
    private int tentativas = 0;

    public void iniciar() {
        System.out.println("\n\n\nSeja bem-vindo ao Jogo da Forca!");
        System.out.println("\nComo jogar: Escolha uma letra até que a palavra se complete, mas cuidado você terá apenas seis chaces!!! \n");
        System.out.print("Escolha o tema:");
        System.out.println("");

        Scanner scan = new Scanner(System.in);
        int tema = scan.nextInt();

        BancoDePalavras listaDePalavras = new BancoDePalavras();
        palavraSecreta = listaDePalavras.palavraAleatoria(tema).toUpperCase();

        /// Cria um array com letras da palavra.
        progresso = palavraSecreta.toCharArray();

        /// Converte todos os valores do array em "_"
        Arrays.fill(progresso, '_');

        /// Utiliza o HashSet para que não exista letras duplicadas.
        letrasErradas = new HashSet<>();


        while (tentativas < 6 && !resultado()) {
            desenharForca();

            System.out.print("Letras já digitadas: ");
            for (char letra : this.letrasErradas) {
                System.out.print(letra + " ");
            }
            System.out.print("\nDigite uma letra:");

            char letra = scan.next().toUpperCase().charAt(0);

            if (palavraSecreta.indexOf(letra) >= 0) {
                atualizarProgresso(letra);
            } else {
                tentativas++;
                letrasErradas.add(letra);
            }
        }

        desenharForca();

        if (resultado()) {
            System.out.println("\n\nParábens, você venceu!");
            System.out.println("A palavra é " + this.palavraSecreta);
        } else {
            System.out.println("\n\nQue pena, você perdeu!");
            System.out.println("A palavra é " + this.palavraSecreta);
        }
    }

    private void atualizarProgresso(char letra) {
        /// Loop que passa em todas as posições do array
        for (int i = 0; i < palavraSecreta.length(); i++) {
            /// Verifica se a letra e igual
            if (palavraSecreta.charAt(i) == letra) {
                progresso[i] = letra;
            }
        }
    }

    private boolean resultado() {
        /// Verifica se a o array e igual a palavra secreta
        return String.valueOf(progresso).equals(palavraSecreta);
    }

    private void desenharForca() {
        switch (tentativas) {
            case 0:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.print("    |             ");
                for (char letra : this.progresso) {
                    System.out.print(letra + "");
                }
                System.out.println("\n    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;
            case 1:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |     O");
                System.out.println("    |");
                System.out.print("    |             ");
                for (char letra : this.progresso) {
                    System.out.print(letra + "");
                }
                System.out.println("\n    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;
            case 2:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |     O");
                System.out.println("    |     |");
                System.out.print("    |             ");
                for (char letra : this.progresso) {
                    System.out.print(letra + "");
                }
                System.out.println("\n    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;
            case 3:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |     O");
                System.out.println("    |     |\\");
                System.out.print("    |             ");
                for (char letra : this.progresso) {
                    System.out.print(letra + "");
                }
                System.out.println("\n    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;
            case 4:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |     O");
                System.out.println("    |    /|\\");
                System.out.print("    |             ");
                for (char letra : this.progresso) {
                    System.out.print(letra + "");
                }
                System.out.println("\n    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;
            case 5:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |     O");
                System.out.println("    |    /|\\");
                System.out.print("    |    /        ");
                for (char letra : this.progresso) {
                    System.out.print(letra + "");
                }
                System.out.println("\n    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;

        }
    }
}
