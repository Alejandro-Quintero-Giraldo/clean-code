package co.com.sofka.openClose;

public class DescuentoMontoFijo implements Descuento {
    protected double montoFijo;

    public DescuentoMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }


    @Override
    public double aplicarDescuento(double precio) {
        return precio - montoFijo;
    }
}
