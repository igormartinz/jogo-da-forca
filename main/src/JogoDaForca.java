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

        BancoDePalavras listaDePalavras = new BancoDePalavras();
        palavraSecreta = listaDePalavras.palavraAleatoria();

        /// Cria um array com letras da palavra.
        progresso = palavraSecreta.toCharArray();

        /// Converte todos os valores do array em "_"
        Arrays.fill(progresso, '_');

        /// Utiliza o HashSet para que não exista letras duplicadas.
        letrasErradas = new HashSet<>();

        Scanner scan = new Scanner(System.in);

        while (tentativas < 6 && !resultado()) {
            desenharForca();

            System.out.println("Letras já digitadas: " + this.letrasErradas);
            System.out.println("Palavra Secreta:" + Arrays.toString(this.progresso));
            System.out.print("Digite uma letra:");

            char letra = scan.next().toLowerCase().charAt(0);

            if (palavraSecreta.indexOf(letra) >= 0) {
                atualizarProgresso(letra);
            } else {
                tentativas++;
                letrasErradas.add(letra);
            }
        }

        desenharForca();

        if (resultado()) {
            System.out.println("Parábens, você venceu");
        } else {
            System.out.println("Que pena, você perdeu");
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
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;
            case 1:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |     O");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;
            case 2:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |     O");
                System.out.println("    |     |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;
            case 3:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |     O");
                System.out.println("    |     |\\");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;
            case 4:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |     O");
                System.out.println("    |    /|\\");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;
            case 5:
                System.out.println("\n    *-----*");
                System.out.println("    |     |");
                System.out.println("    |     O");
                System.out.println("    |    /|\\");
                System.out.println("    |    /");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("-------------\n");
                break;

        }
    }
}
