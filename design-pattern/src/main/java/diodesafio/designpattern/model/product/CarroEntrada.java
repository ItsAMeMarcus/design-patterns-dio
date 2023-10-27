package diodesafio.designpattern.model.product;

import diodesafio.designpattern.model.Carro;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CarroEntrada implements Carro {

    private int velocidade;
    @NonNull
    private boolean motorLigado;

    private int potencia;
    @NonNull
    private boolean setaEsquerdaLigada;
    @NonNull
    private boolean setaDireitaLigada;
    @NonNull
    private String portaMalas;

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
