package com.travelocity.tasks;

import com.travelocity.userinterface.DetalleVuelos;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Link;


public class SeleccionarClaseVuelo {
    public static Performable en(String claseVuelo){
        return Task.where("{0} abre travelocity en vuelos y selecciona clase {1}",
                    Click.on(DetalleVuelos.DIV_SELECCIONAR_CLASE_VUELO),
                    Click.on(Link.withText(claseVuelo))
                );
    }
}
