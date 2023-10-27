package diodesafio.designpattern.model.factory;

import diodesafio.designpattern.model.Carro;
import diodesafio.designpattern.model.product.CarroEntrada;
import diodesafio.designpattern.model.product.CarroLuxuoso;
import diodesafio.designpattern.model.product.Moto;

public class LuxuosoFactory implements AutomovelFactory{
    @Override
    public Carro criaCarro() {
        Carro carro = CarroLuxuoso.builder()
                .motorLigado(false)
                .potencia(1)
                .portaMalas("Grande")
                .setaDireitaLigada(false)
                .setaEsquerdaLigada(false)
                .arCondicionadoLigado(false)
                .multimidiaLigada(false)
                .build();
        return carro;
    }

    @Override
    public Moto criaMoto() {
        return null;
    }
}
