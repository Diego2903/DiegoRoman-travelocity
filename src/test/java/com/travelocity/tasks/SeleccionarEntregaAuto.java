package com.travelocity.tasks;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterface.DetalleAutos;
import com.travelocity.userinterface.MenuTravelocity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ui.Dropdown;
import org.openqa.selenium.Keys;

public class SeleccionarEntregaAuto {
    public static Performable para(String entregaAuto){
        return Task.where("{0} abre travelocity en autos y selecciona Autos {1}",
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(MenuTravelocity.A_AUTOS),
                Click.on(DetalleAutos.BUT_ENTREGA_AUTO),
                Enter.theValue(entregaAuto).into(DetalleAutos.INP_ENTREGA_AUTO).thenHit(Keys.ENTER)
                );
    }
}
