package co.com.sofka.openClose;

public class DescuentoPorcentaje implements Descuento{

    protected double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio * (1 - porcentaje / 100) ;
    }
}
