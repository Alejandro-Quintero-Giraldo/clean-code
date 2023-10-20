package co.com.sofka.singleResponsability;

public class Circulo extends  Forma {

    private static final double PI = 3.1416;

    public Circulo(int altura, int ancho) {
        super(altura, ancho);
    }

    @Override
    public int calcularArea() {
        return (int) (PI * ancho);
    }
}
