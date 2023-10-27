package diodesafio.designpattern.model.product;

import diodesafio.designpattern.model.Carro;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CarroLuxuoso implements Carro {
    private int velocidade;
    @NonNull
    private boolean motorLigado;
    @NonNull
    private boolean setaEsquerdaLigada;
    @NonNull
    private boolean setaDireitaLigada;

    private int potencia;
    @NonNull
    private String portaMalas;
    @NonNull
    private boolean arCondicionadoLigado = false;
    @NonNull
    private boolean multimidiaLigada = false;

    @Override
    public void estadoMotor() {
        setMotorLigado(!isMotorLigado());
        setArCondicionadoLigado(!isArCondicionadoLigado());
        setMultimidiaLigada(!isMultimidiaLigada());
        System.out.println("Motor ligado: " + isMotorLigado());
        System.out.println("Ar Condicionado ligado: " + isArCondicionadoLigado());
        System.out.println("Multimidia ligada: " + isMultimidiaLigada());
    }

    @Override
    public void mostraVelocidade() {
        System.out.println(getVelocidade());
    }

    @Override
    public void acelera() {
        setVelocidade(getVelocidade() + getPotencia());
        System.out.println("Acelerando... Km/h:" + getVelocidade());
    }

    @Override
    public void freia() {
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
