package diodesafio.designpattern.model.factory;

import diodesafio.designpattern.model.Carro;
import diodesafio.designpattern.model.product.CarroEntrada;
import diodesafio.designpattern.model.product.Moto;

public class EntradaFactory implements AutomovelFactory {
    @Override
    public Carro criaCarro() {
        Carro carro = CarroEntrada.builder()
                .motorLigado(false)
                .potencia(1)
                .portaMalas("Pequeno")
                .setaDireitaLigada(false)
                .setaEsquerdaLigada(false)
                .build();
        return carro;
    }

    @Override
    public Moto criaMoto() {
        return null;
    }
}
