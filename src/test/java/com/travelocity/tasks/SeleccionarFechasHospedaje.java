package com.travelocity.tasks;


import com.travelocity.userinterface.DetalleHospedaje;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFechasHospedaje implements Task {

    private Integer numeroDias;
    private Integer cantAdultos;


    public SeleccionarFechasHospedaje(Integer numeroDias, Integer cantAdultos) {
        this.numeroDias = numeroDias;
        this.cantAdultos = cantAdultos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleHospedaje.SELECCIONAR_CHECK_IN),
                Click.on(DetalleHospedaje.SELECCIONAR_CHECK_OUT),
                Click.on(DetalleHospedaje.BUT_LISTO),
                Click.on(DetalleHospedaje.DIV_SELECCIONAR_NUMERO_PERSONAS),
                Click.on(DetalleHospedaje.BUT_LISTO_NUMERO_PERSONAS),
                Click.on(DetalleHospedaje.BUT_BUSCAR)
        );
    }

    public static Performable diasYCantAdultos(Integer numeroDias, Integer cantAdultos){
        return instrumented(SeleccionarFechasHospedaje.class, numeroDias, cantAdultos);
    }
};
