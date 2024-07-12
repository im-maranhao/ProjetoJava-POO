package Animais;

public class Cachorro extends Animal {
    //Herança

    //atributos
    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    // construtor default
    // construtor definido pelo usuário

    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito, int tamanhoDoRabo) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeCachorros++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    //métodos

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){

        switch (acao){
            case "carinho" : this.estadoDeEspirito = "Feliz"; break;
            case "vai dormir!" : this.estadoDeEspirito = "Bravo"; break;
            case "pisar na patinha" : this.estadoDeEspirito = "Triste"; break;
            default : this.estadoDeEspirito = "Neutro"; break;
        }
        return this.estadoDeEspirito;

    }

    @Override
    public String toString(){
        return "Cachorro{" +
                "nome'" + nome +   '\'' +
                '}';
    }

    @Override
    //alterar retornar que já foi definido
    public void soar() {
        System.out.println("AU AU!");
    }
}
