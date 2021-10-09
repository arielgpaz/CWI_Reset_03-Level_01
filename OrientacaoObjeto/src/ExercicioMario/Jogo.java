package ExercicioMario;
import java.util.Random;

public class Jogo {
    private Mario jogador1;
    private Luigi jogador2;

    public Jogo(Personagem j1, Personagem j2) {
        this.jogador1 = (Mario) j1;
        this.jogador2 = (Luigi) j2;
    }

    public void imprimirDadosDosPersonagens () {
        System.out.println("### Jogador 1 ###");
        this.jogador1.imprimeCaracteristicas();
        System.out.println("### Jogador 2 ###");
        this.jogador2.imprimeCaracteristicas();
    }

    public void jogar(){
        Random aleatorio = new Random();
        int moedas1 = aleatorio.nextInt(30);
        for (int i = 0; i < moedas1; i++) {
            this.jogador1.coletarMoeda();
        }
        int moedas2 = aleatorio.nextInt(30);
        for (int i = 0; i < moedas2; i++) {
            this.jogador2.coletarMoeda();
        }
        System.out.println("O jogador " + this.jogador1.getNome() + " coletou " + this.jogador1.getMoedasColetadas() + " moedas!");
        System.out.println("O jogador " + this.jogador2.getNome() + " coletou " + this.jogador2.getMoedasColetadas() + " moedas!");
    }
}