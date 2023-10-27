package diodesafio.designpattern.model.product;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CelularEntrada implements Celular {

    private List<String> notificacoes;
    @NonNull
    private boolean celularLigado;

    private boolean lanternaLigada;
    @NonNull
    private boolean telaBloqueada;
    @NonNull
    private boolean wifiLigado;
    @NonNull
    private boolean bluetoothLigado;

    private boolean gravadorLigado;

    @Override
    public void estadoCelular() {
        setCelularLigado(!isCelularLigado());
        System.out.println("Celular ligado: " + isCelularLigado());
    }

    @Override
    public void estadoWifi() {
        if(validador()){
            System.out.println("Ligando Wi-Fi:" + isWifiLigado());
            setCelularLigado(!isCelularLigado());
        }
    }

    @Override
    public void estadoBluetooth() {
        if(validador()){
            System.out.println("Ligando Bluetooth:" + isBluetoothLigado());
            setBluetoothLigado(!isBluetoothLigado());
        }
    }

    @Override
    public void estadoTela() {
        if(validador()){
            setTelaBloqueada(!isTelaBloqueada());
            System.out.println("Tela Bloqueada: " + isTelaBloqueada());
        }
    }

    @Override
    public void verNotificacoes() {
        if(!isCelularLigado()){
            System.out.println("Notificações: ");
            notificacoes.stream().forEach(e -> System.out.println(e));
        }
    }

    @Override
    public void estadoLanterna() {
        if(validador()){
            setLanternaLigada(!isLanternaLigada());
            System.out.println("Lanterna ligada: " + isLanternaLigada());
        }
    }

    @Override
    public void estadoGravador() {
        if(validador()){
            setGravadorLigado(!isGravadorLigado());
            System.out.println("Gravador ligado: " + isGravadorLigado());
        }
    }

    @Override
    public boolean validador() {
        if(!isCelularLigado()){
            System.out.println("Ligue o celular");
            return false;
        }
        else if(!isTelaBloqueada()){
            System.out.println("Desbloqueie o celular");
            return false;
        }
        return true;
    }
}
