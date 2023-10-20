package co.com.sofka.liskovSubstitution;


import co.com.sofka.singleResponsability.Forma;

import java.util.List;

public class CalculadoraArea {

    public double calcularAreaTotal(List<Forma> formas) {
        return formas.stream()
                .map(Forma::calcularArea)
                .reduce(Integer::sum)
                .orElse(0);

    }
}
