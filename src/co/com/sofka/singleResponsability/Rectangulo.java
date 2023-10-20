package co.com.sofka.singleResponsability;

public class Rectangulo extends Forma {

    public Rectangulo(int altura, int ancho) {
        super(altura, ancho);
    }

    @Override
    public int calcularArea() {
        return this.ancho * this.altura;
    }
}
