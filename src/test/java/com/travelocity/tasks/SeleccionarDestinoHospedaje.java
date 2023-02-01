package com.travelocity.tasks;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterface.DetalleHospedaje;
import com.travelocity.userinterface.DetalleVuelos;
import com.travelocity.userinterface.MenuTravelocity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

public class SeleccionarDestinoHospedaje{
    public static Performable para(String destinoName){
        return Task.where("{0} abre travelocity en vuelos y selecciona hospedaje {1}",
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(MenuTravelocity.A_HOSPEDAJE),
                Click.on(DetalleHospedaje.BUT_DESTINO),
                Enter.theValue(destinoName).into(DetalleHospedaje.INP_DESTINO).thenHit(Keys.ENTER)
        );
    }
};
