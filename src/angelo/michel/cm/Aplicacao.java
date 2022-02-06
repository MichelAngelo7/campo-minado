package angelo.michel.cm;

import angelo.michel.cm.modelo.Tabuleiro;
import angelo.michel.cm.modelo.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6,6);
        new TabuleiroConsole(tabuleiro);

    }
}
