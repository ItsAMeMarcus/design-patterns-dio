package diodesafio.designpattern.model.factory;

import diodesafio.designpattern.model.product.Celular;
import diodesafio.designpattern.model.product.FoneSemFioEntrada;

public interface EletronicosFactory {
    public Celular criaCelular();

    public FoneSemFioEntrada criaFone();
}
