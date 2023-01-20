package com.travelocity.tasks;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterface.DetalleVuelos;
import com.travelocity.userinterface.MenuTravelocity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

public class SeleccionarOrigenVuelos {
    public static Performable para(String origenName){
        return Task.where("{0} abre travelocity en vuelos y selecciona origen {1}",
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(MenuTravelocity.A_VUELOS),
                Click.on(DetalleVuelos.BUT_ORIGEN),
                Enter.theValue(origenName).into(DetalleVuelos.INP_ORIGEN).thenHit(Keys.ENTER)
                );
    }
}
