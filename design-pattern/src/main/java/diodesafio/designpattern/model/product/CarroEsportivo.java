package diodesafio.designpattern.model.product;

import diodesafio.designpattern.model.Carro;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CarroEsportivo implements Carro {

    private int velocidade;
    @NonNull
    private boolean motorLigado;
    @NonNull
    private boolean setaEsquerdaLigada;
    @NonNull
    private boolean setaDireitaLigada;

    private int potencia;

    private String portaMalas;
    @NonNull
    private boolean modoTurboLigado;

    public void setModoTurboLigado(boolean modoTurboLigado) {
        this.modoTurboLigado = modoTurboLigado;
        System.out.println("Modo turdo ligado: " + isModoTurboLigado());
    }

    @Override
    public void estadoMotor() {
        setMotorLigado(!isMotorLigado());
        System.out.println("Motor ligado: " + isMotorLigado());
    }

    @Override
    public void mostraVelocidade() {
        System.out.println(getVelocidade());
    }

    @Override
    public void acelera() {
        if(isModoTurboLigado()){
            setPotencia(getPotencia() + 10);
        }
        setVelocidade(getVelocidade() + getPotencia());
        System.out.println("Acelerando... Km/h:" + getVelocidade());
    }

    @Override
    public void freia() {
        if(isModoTurboLigado()){
            setPotencia(getPotencia() + 10);
        }
        setVelocidade(getVelocidade() - getPotencia());
        System.out.println("Diminuindo... Km/h:" + getVelocidade());
    }

    @Override
    public void estadoSetaDireita() {
        setSetaDireitaLigada(!isSetaDireitaLigada());
        System.out.println("Seta ligada: " + isSetaDireitaLigada());
    }

    @Override
    public void estadoSetaEsquerda() {
        setSetaEsquerdaLigada(!isSetaEsquerdaLigada());
        System.out.println("Seta ligada: " + isSetaEsquerdaLigada());
    }

    @Override
    public void tamanhoPortaMalas() {
        System.out.println("Tamanho do porta malas: " + getPortaMalas());
    }
}
