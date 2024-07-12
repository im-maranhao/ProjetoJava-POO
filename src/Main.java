import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex","Preto", 5,7.5, "Feliz", 1);
        Gato gato1 = new Gato("Mel", "Marrom", 5);
        Passaro passaro1 = new Passaro("Blue", "azul", 1, 0.5);

        System.out.println("Soar dos animais: ");
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        System.out.println("-----------------");

        Petshop petshop = new Petshop(); //Contrutor padrão 'DEFAULT'

        System.out.println("Ações no Petshop: ");
        petshop.darBanho(cachorro1);
        System.out.println("O cachorro está " + cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println("O gato está " +gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println("O cachorro está " +cachorro1.getEstadoDeEspirito());
    }
}