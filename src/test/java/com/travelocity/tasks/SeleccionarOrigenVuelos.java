package com.travelocity.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class SeleccionarOrigenVuelos {
    public static Performable para(String origen){
        return Task.where("{0} abre travelocity en vuelos y selecciona origen",
                Open.url("https://www.travelocity.com/es/"),
                Click
                );
    }
}
