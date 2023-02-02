package com.travelocity.tasks;

import com.travelocity.userinterface.DetalleVuelos;
import com.travelocity.utils.SelectorDeFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Button;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDestinoVuelosConHospedaje implements Task {

    private Integer diasHospedaje;

    public SeleccionarDestinoVuelosConHospedaje(Integer diasViaje) {
        this.diasHospedaje = diasViaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        SelectorDeFechas fechas = new SelectorDeFechas();
        String fechaInicial = fechas.getFechaInicialFormateada();
        String fechaFinal = fechas.getFechaFinalFormateada(diasHospedaje);

        actor.attemptsTo(
                Click.on(DetalleVuelos.INP_CHECK_HOSPEDAJE).afterWaitingUntilEnabled(),
                Click.on(DetalleVuelos.BUT_SELECCIONAR_CHECK_IN),
                Click.on(Button.withAriaLabel(fechaInicial)),
                Click.on(Button.withAriaLabel(fechaFinal)),
                Click.on(DetalleVuelos.BUT_LISTO_CHECK_IN)
        );

    }

    public static Performable diasHospedaje( Integer diasHospedaje){
        return instrumented(SeleccionarDestinoVuelosConHospedaje.class,  diasHospedaje);
    }
}
