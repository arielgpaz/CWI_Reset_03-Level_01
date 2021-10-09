package ExercicioMario;

//Classe folha (filha)
public class Yoshi extends Personagem {

    // Atributos do Yoshi
    private int velocidade;
    private int quantidadeDeFrutas;

    // Construtor
    public Yoshi(String nome, double altura) {
        this.setNome(nome);
        this.setIdade(150);
        this.setAltura(altura);
        this.setEstamina(80);
        this.velocidade = 10;
        this.quantidadeDeFrutas = 0;
    }

    // Getters and Setters
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getQuantidadeDeFrutas() {
        return quantidadeDeFrutas;
    }

    public void setQuantidadeDeFrutas(int quantidadeDeFrutas) {
        this.quantidadeDeFrutas = quantidadeDeFrutas;
    }

    // Imprimir características
    @Override
    public void imprimeCaracteristicas() {
        System.out.println("------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Estamina: " + this.getEstamina());
        System.out.println("Quantidade de frutas: " + this.getQuantidadeDeFrutas());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("------------------------");
    }

    // HABILIDADES ESPECIAIS

    public void comerFrutas(){
        setQuantidadeDeFrutas(getQuantidadeDeFrutas() + 1);
        if (getQuantidadeDeFrutas() % 2 == 0) {
            setVelocidade(getVelocidade() * 2);
        }
    }

    @Override
    public void crescer(){
        this.setAltura(getAltura() * 1.1);
    }
}