package com.travelocity.tasks;


import com.travelocity.userinterface.DetalleAutos;
import com.travelocity.utils.SelectorDeFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDevolucionAuto implements Task{

    private Integer diasAlquiler;
    private String devolucionAuto;

    public SeleccionarDevolucionAuto(Integer diasAlquiler, String devolucionAuto) {
        this.diasAlquiler = diasAlquiler;
        this.devolucionAuto = devolucionAuto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SelectorDeFechas fechas = new SelectorDeFechas();
        String fechaInicial = fechas.getFechaInicialFormateada();
        String fechaFinal = fechas.getFechaFinalFormateada(diasAlquiler);

        actor.attemptsTo(
                Click.on(DetalleAutos.BUT_DEVOLUCION_AUTO),
                Enter.theValue(devolucionAuto).into(DetalleAutos.INP_DEVOLUCION_AUTO).thenHit(Keys.ENTER),
                Click.on(DetalleAutos.SELECCIONAR_FECHA_ENTREGA),
                Click.on(Button.withAriaLabel(fechaInicial)),
                Click.on(Button.withAriaLabel(fechaFinal)),
                Click.on(DetalleAutos.BUT_LISTO_FECHAS),
                Click.on(DetalleAutos.BUT_BUSCAR_AUTOS)
        );
    }

    public static Performable diasAlquilerYDevolucionAuto(Integer diasAlquiler, String devolucionAuto){
        return instrumented(SeleccionarDevolucionAuto.class, diasAlquiler,devolucionAuto);
    }
}
