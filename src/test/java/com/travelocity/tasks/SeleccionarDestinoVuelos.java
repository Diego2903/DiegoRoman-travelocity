package com.travelocity.tasks;

import com.travelocity.userinterface.DetalleVuelos;
import com.travelocity.utils.SelectorDeFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import org.openqa.selenium.Keys;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDestinoVuelos implements Task {

    private String destino;
    private Integer diasViaje;

    public SeleccionarDestinoVuelos(String destino, Integer diasViaje) {
        this.destino = destino;
        this.diasViaje = diasViaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        SelectorDeFechas fechas = new SelectorDeFechas();
        String fechaInicial = fechas.getFechaInicialFormateada();
        String fechaFinal = fechas.getFechaFinalFormateada(diasViaje);

        actor.attemptsTo(
                Click.on(DetalleVuelos.BUT_DESTINO),
                Enter.theValue(this.destino).into(DetalleVuelos.INP_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleVuelos.BUT_ABRIR_FECHAS),
                Click.on(Button.withAriaLabel(fechaInicial)),
                Click.on(Button.withAriaLabel(fechaFinal)),
                Click.on(DetalleVuelos.BUT_LISTO),
                Click.on(DetalleVuelos.BUT_BUSCAR)
        );

    }

    public static Performable destinoYDias(String destino, Integer diasViaje){
        return instrumented(SeleccionarDestinoVuelos.class, destino, diasViaje);
    }
}
