package diodesafio.designpattern.model.product;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class FoneSemFioEntrada implements FoneSemFio {

    private boolean foneLigado;

    private boolean foneConectado;

    private int bateria;

    private int consumo;

    private int volume;

    private QUALIDADE qualidade;

    @Override
    public void estadoFone() {
        setFoneLigado(!isFoneLigado());
        System.out.println("Fone ligado: " + isFoneLigado());
    }

    @Override
    public void mostrarBateria() {
        if(isFoneLigado()){
            System.out.println("Porcentagem de bateria:" + getBateria());
        }
        else{
            System.out.println("Ligue o fone");
        }
    }

    @Override
    public void estadoConexao() {
        if(isFoneLigado()){
            setFoneConectado(!isFoneConectado());
            System.out.println("Fone conectado: " + isFoneConectado());
        }
        else{
            System.out.println("Ligue o fone");
        }
    }

    @Override
    public void aumentaVolume() {
        if(validador()){
            setVolume(getVolume() + 1);
            System.out.println("Diminuindo... Volume:" + getVolume());
        }
    }

    @Override
    public void abaixaVolume() {
        if(validador()){
            setVolume(getVolume() - 1);
            System.out.println("Diminuindo... Volume:" + getVolume());
        }
    }

    @Override
    public void modoEconomia() {
        if(validador()){
            setQualidade(QUALIDADE.RUIM);
            setConsumo(25);
            System.out.println("Ligando modo de economia de bateria... Qualidade do Audio:" + getQualidade());
        }
    }

    @Override
    public boolean validador() {
        if(!isFoneLigado()){
            System.out.println("Ligue o Fone");
            return false;
        }
        else if(!isFoneConectado()){
            System.out.println("conecte o fone");
            return false;
        }
        return true;
    }
}
