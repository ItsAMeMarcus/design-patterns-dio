package diodesafio.designpattern.model.factory;

import diodesafio.designpattern.model.product.*;

import java.util.List;

public class IntermediarioFactory implements EletronicosFactory {
    @Override
    public Celular criaCelular() {
        Celular celular = CelularIntermediario.builder()
                .bluetoothLigado(false)
                .notificacoes(List.of
                        (
                            "Novo Video de DIO no Youtube",
                            "Seus aplicativos precisam de atualização, toque aqui para saber mais",
                            "DIO curtiu o seu comentário no LinkedIn"
                        )
                )
                .celularLigado(false)
                .gravadorLigado(false)
                .lanternaLigada(false)
                .telaBloqueada(false)
                .wifiLigado(false)
                .build();
        return celular;
    }

    @Override
    public FoneSemFioEntrada criaFone() {
        FoneSemFioEntrada foneSemFioEntrada = FoneSemFioEntrada.builder()
                .foneConectado(false)
                .foneLigado(false)
                .bateria(100)
                .consumo(25)
                .qualidade(QUALIDADE.BOA)
                .volume(10)
                .build();
        return foneSemFioEntrada;
    }

}
