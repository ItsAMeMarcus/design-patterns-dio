package diodesafio.designpattern.model.factory;

import diodesafio.designpattern.model.Carro;
import diodesafio.designpattern.model.product.CarroEntrada;
import diodesafio.designpattern.model.product.CarroEsportivo;
import diodesafio.designpattern.model.product.Moto;

public class EsportivoFactory implements AutomovelFactory{
    @Override
    public Carro criaCarro() {
        Carro carro = CarroEsportivo.builder()
                .motorLigado(false)
                .potencia(1)
                .portaMalas("Pequeno")
                .setaDireitaLigada(false)
                .setaEsquerdaLigada(false)
                .modoTurboLigado(false)
                .build();
        return carro;
    }

    @Override
    public Moto criaMoto() {
        return null;
    }
}
