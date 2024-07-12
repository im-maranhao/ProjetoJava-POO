package Animais;

public class Passaro extends Animal {
    //Herança

    static int numeroDePassaros;

    public Passaro(String nome, String cor, int altura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;

        numeroDePassaros++;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome'" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("fiuuuuu");
    }
}