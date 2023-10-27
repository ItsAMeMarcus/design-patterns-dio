package diodesafio.designpattern.model.factory;

import diodesafio.designpattern.model.Carro;
import diodesafio.designpattern.model.product.Moto;

public interface AutomovelFactory {
    public Carro criaCarro();

    public Moto criaMoto();
}
