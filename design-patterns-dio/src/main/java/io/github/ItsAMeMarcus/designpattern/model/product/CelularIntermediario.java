package diodesafio.designpattern.model.product;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class CelularIntermediario implements Celular {

    private List<String> notificacoes;
    private boolean celularLigado;
    private boolean lanternaLigada;
    private boolean telaBloqueada;
    private boolean wifiLigado;
    private boolean bluetoothLigado;
    private boolean gravadorLigado;
    private boolean cronometroLigado;

    public void Cronometro() throws InterruptedException {
        if(validador()){
            setCronometroLigado(!isCronometroLigado());
            System.out.println("Timer setado para um minuto");
            wait(60000);
            System.out.println("Fim do timer");
            setCronometroLigado(!isCronometroLigado());
        }
    }

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
        if(isCelularLigado()){
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
