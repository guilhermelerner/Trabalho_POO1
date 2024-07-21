package entradadados;
import excecoes.NomeJogadorInvalidoException;
import excecoes.NomeJogadorRepetidoException;
import jogodavelha.Jogada;
import jogodavelha.Jogador;
import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static Jogada lerJogada(Jogador jogador, int tamanhoTabuleiro) {
        int linha, coluna;
        while (true) {
            System.out.println("Jogador " + jogador.getSimbolo() + " (" + jogador.getNome() + "), insira sua jogada (linha e coluna de 0 a " + (tamanhoTabuleiro - 1) + "): ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();
            if (linha >= 0 && linha < tamanhoTabuleiro && coluna >= 0 && coluna < tamanhoTabuleiro) {
                break;
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }
        return new Jogada(linha, coluna, jogador);
    }
}