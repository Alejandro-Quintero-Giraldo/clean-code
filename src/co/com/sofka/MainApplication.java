package co.com.sofka;

import co.com.sofka.liskovSubstitution.CalculadoraArea;
import co.com.sofka.singleResponsability.Rectangulo;
import co.com.sofka.singleResponsability.Circulo;

import java.lang.reflect.Array;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(12, 15);
        Circulo circulo = new Circulo(15, 15);
        CalculadoraArea calculadoraArea = new CalculadoraArea();

        double resultado =  calculadoraArea.calcularAreaTotal(List.of(rectangulo, circulo));
        System.out.println(resultado);

    }
}
