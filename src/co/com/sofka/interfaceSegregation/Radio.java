package co.com.sofka.interfaceSegregation;

public class Radio implements Encendible, Ajustable {
    protected boolean estaEncendido;
    protected int volumen;

    @Override
    public void ajustarVolumen(int ajuste) {
        volumen += ajuste;
    }

    @Override
    public void encender() {
        estaEncendido = true;
    }

    @Override
    public void apagar() {
        estaEncendido = false;
    }
}
