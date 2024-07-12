package Lojas;

import Animais.Animal;
import Animais.Cachorro;

public class Petshop {

    // Polimorfismo - Capacidade de um objeto poder ser referênciado de várias formas, Não quer dizer que o objeto
    // fica se transformando, pelo contrário, o objeto nasce de um tipo e morre naquele tipo.
    // O que pode mudar é a maneira como nós referênciamos ele

    // Classe de referência != classe real

    // Todo gato é um animal, mas nem todo animal é um gato!


    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo!");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado!");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Ficou com saudades!");
    }

}
