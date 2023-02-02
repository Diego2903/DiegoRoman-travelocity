package com.travelocity.tasks;


import com.travelocity.userinterface.DetalleHospedaje;
import com.travelocity.utils.SelectorDeFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Button;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFechasHospedaje implements Task {

    private Integer diasHospedaje;
    private Integer cantAdultos;


    public SeleccionarFechasHospedaje(Integer numeroDias, Integer cantAdultos) {
        this.diasHospedaje = numeroDias;
        this.cantAdultos = cantAdultos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        SelectorDeFechas fechas = new SelectorDeFechas();
        String fechaInicial = fechas.getFechaInicialFormateada();
        String fechaFinal = fechas.getFechaFinalFormateada(diasHospedaje);

        actor.attemptsTo(
                Click.on(DetalleHospedaje.SELECCIONAR_CHECK_IN),
                Click.on(Button.withAriaLabel(fechaInicial)),
                Click.on(Button.withAriaLabel(fechaFinal)),
                Click.on(DetalleHospedaje.BUT_LISTO),
                Click.on(DetalleHospedaje.DIV_SELECCIONAR_NUMERO_PERSONAS),
                Click.on(DetalleHospedaje.INP_CANTIDAD_PERSONAS),
                Click.on(DetalleHospedaje.BUT_LISTO_NUMERO_PERSONAS),
                Click.on(DetalleHospedaje.BUT_BUSCAR)
        );
    }

    public static Performable diasYCantAdultos(Integer numeroDias, Integer cantAdultos){
        return instrumented(SeleccionarFechasHospedaje.class, numeroDias, cantAdultos);
    }
};
