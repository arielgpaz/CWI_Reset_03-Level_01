package ExercicioMario;

public class SuperMario {

    public static void main(String[] args) {

        // Instanciando objetos
        //Personagem princesa = new Personagem();
        Mario mario = new Mario("Mário", 40, 1.50);
        Luigi luigi = new Luigi("Luigi", 40, 1.70);
        Yoshi yoshi = new Yoshi("Yoshi", 1.0);

        // ATENÇÃO! Você precisa tirar os comentário do exercício que quiser testar ;)

        // ### Exercício 5 - Ganhar e perder estamina ###
        /*mario.ganharEstamina();
        luigi.ganharEstamina();
        yoshi.ganharEstamina();
        mario.perderEstamina();
        luigi.perderEstamina();
        yoshi.perderEstamina();*/

        // ### Exercício 6 - Revigorar e morrer ###
        /*mario.revigorar();
        luigi.revigorar();
        yoshi.revigorar();
        mario.morrer();
        luigi.morrer();
        luigi.morrer();*/

        // ### Exercício 7 - Saltar ###
        /*mario.saltar();
        luigi.saltar();
        yoshi.saltar();*/

        // ### Exercício 8 - Jogo de coletar moedas ###
        /*Jogo jogar = new Jogo(mario, luigi);
        jogar.imprimirDadosDosPersonagens();
        jogar.jogar();*/

        // ### Exercício 9 - Herança ###
        /*mario.imprimeMontadoYoshi();
        mario.montarNoYoshi(yoshi);
        mario.imprimeMontadoYoshi();
        luigi.voar();
        yoshi.comerFrutas();
        yoshi.comerFrutas();
        yoshi.comerFrutas();*/

        // ### Exercício 10 - Polimorfismo ###
        // Sobreposição
        /*mario.crescer();
        luigi.crescer();
        yoshi.crescer();*/
        // Sobrecarga
        /*mario.saltar(2.0);
        luigi.saltar(0.2);
        yoshi.saltar(1.0);*/

        // Extra - Usar habilidades
        mario.crescer();
        mario.montarNoYoshi(yoshi);
        mario.imprimeMontadoYoshi();
        mario.poderes();
        luigi.crescer();
        luigi.voar();
        luigi.poderes();

        mario.imprimeCaracteristicas();
        luigi.imprimeCaracteristicas();
        yoshi.imprimeCaracteristicas();
    }
}