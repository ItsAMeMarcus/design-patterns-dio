package diodesafio.designpattern.model.factory;

import diodesafio.designpattern.model.product.*;

import java.util.List;

public class EntradaFactory implements EletronicosFactory {
    @Override
    public Celular criaCelular() {
        Celular celular = CelularEntrada.builder()
                .bluetoothLigado(false)
                .celularLigado(false)
                .gravadorLigado(false)
                .lanternaLigada(false)
                .telaBloqueada(false)
                .wifiLigado(false)
                .notificacoes(List.of
                        (
                                "Novo Video de DIO no Youtube",
                                "Seus aplicativos precisam de atualização, toque aqui para saber mais",
                                "DIO curtiu o seu comentário no LinkedIn"
                        )
                )
                .build();
        return celular;
    }

    @Override
    public FoneSemFioEntrada criaFone() {
        FoneSemFioEntrada foneSemFioEntrada = FoneSemFioEntrada.builder()
                .foneConectado(false)
                .foneLigado(false)
                .bateria(100)
                .consumo(30)
                .qualidade(QUALIDADE.MEDIA)
                .volume(10)
                .build();
        return foneSemFioEntrada;
    }

}
