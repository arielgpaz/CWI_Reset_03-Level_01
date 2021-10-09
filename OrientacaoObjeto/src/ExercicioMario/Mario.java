package ExercicioMario;

import java.util.Scanner;

//Classe folha (filha)
public class Mario extends Personagem{

    // Atributos do Mário
    private int moedasColetadas;
    private int quantidadeDeVidas;
    private Yoshi dinossauro;

    // Construtor
    public Mario(String n, int i, double a) { // Método Construtor
        this.setNome(n);
        this.setIdade(i);
        this.setAltura(a);
        this.setEstamina(80);
        this.moedasColetadas = 0;
        this.quantidadeDeVidas = 1;
    }

    // Getters and Setters
    public void setMoedasColetadas(int moedasColetadas) {
        this.moedasColetadas = moedasColetadas;
    }

    public int getMoedasColetadas() {
        return moedasColetadas;
    }

    public int getQuantidadeDeVidas() {
        return quantidadeDeVidas;
    }

    public void setQuantidadeDeVidas(int quantidadeDeVidas) {
        this.quantidadeDeVidas = quantidadeDeVidas;
    }

    // Imprimir características
    @Override
    public void imprimeCaracteristicas() {
        System.out.println("------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Estamina: " + this.getEstamina());
        System.out.println("Moedas coletadas: " + this.getMoedasColetadas());
        System.out.println("Quantidade de vidas: " + this.getQuantidadeDeVidas());
        System.out.println("------------------------");
    }

    // HABILIDADES ESPECIAIS

    @Override
    public void crescer(){
        this.setAltura(getAltura() * 1.5);
    }

    public void poderes(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Comeu uma flor? (true or false)");
        boolean possuiPoderes = scan.nextBoolean();
        if (possuiPoderes){
            System.out.println("Bora tacar fogo!!!");
        } else {
            System.out.println("Precisamos encontrar uma flor, URGENTE!");
        }
    }

    public void morrer(){
        this.quantidadeDeVidas -= 1;
        revigorar();
        if (quantidadeDeVidas < 0) {
            this.quantidadeDeVidas = 0;
            this.setEstamina(0);
        }
    }

    public void coletarMoeda(){
        this.moedasColetadas += 1;
        if ((moedasColetadas % 10) == 0) {
            this.quantidadeDeVidas += 1;
        }
    }

    public void montarNoYoshi(Yoshi dinossauro) {
        this.dinossauro = dinossauro;
    }
    public void imprimeMontadoYoshi(){
        if (this.dinossauro != null) {
            System.out.println(this.getNome() + " está montado no Yoshi");
        } else {
            System.out.println(this.getNome() + " não está montado no Yoshi");
        }
    }
}