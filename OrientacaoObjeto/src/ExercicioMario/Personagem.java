package ExercicioMario;

// Classe raiz
public abstract class Personagem {
    // Atributos comuns para todos personages
    private String nome;
    private int idade;
    private double altura;
    private int estamina;
    private double salto;

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getEstamina() {
        return estamina;
    }
    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
    public double getSalto() {
        return salto;
    }
    public void setSalto(double salto) {
        this.salto = salto;
    }

    public abstract void imprimeCaracteristicas();

    public void perderEstamina(){
        this.estamina = estamina - 10;
        if (this.estamina < 0) {
            this.estamina = 0;
        }
    }

    public void ganharEstamina(){
        this.estamina = estamina + 5;
        if (this.estamina > 100){
            this.estamina = 100;
        }
    }

    public void revigorar(){
        this.estamina = 100;
    }

    public abstract void crescer();

    public void saltar() {
        this.setSalto(0.5 * getAltura());
        System.out.println( this.getNome() + " está saltando " + this.getSalto() + " m. 50% da sua altura.");
    }

    public void saltar(double alturaDoObstaculo){
        this.setSalto(1.5 * alturaDoObstaculo);
        System.out.println( this.getNome() + " está saltando " + this.getSalto() + " m. 50% mais alto que o obstáculo.");
    }
}