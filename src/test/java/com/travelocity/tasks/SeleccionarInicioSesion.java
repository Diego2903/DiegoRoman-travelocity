package com.travelocity.tasks;

import com.travelocity.userinterface.DetalleIniciarSesion;
import com.travelocity.userinterface.HeaderTravelocity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarInicioSesion implements Task {


    private String correo;
    private String contrasena;

    public SeleccionarInicioSesion(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Holi");
              actor.attemptsTo(
                      Click.on(HeaderTravelocity.DIV_INICIAR_SESION),
                      Click.on(DetalleIniciarSesion.A_INICIAR_SESION)
//                      Click.on(DetalleIniciarSesion.INP_CORREO_ELECTRONICO),
//                      Enter.theValue(this.correo).into(DetalleIniciarSesion.INP_CORREO_ELECTRONICO).thenHit(Keys.ENTER),
//                      Click.on(DetalleIniciarSesion.INP_CONTRASENA),
//                      Enter.theValue(this.contrasena).into(DetalleIniciarSesion.INP_CONTRASENA).thenHit(Keys.ENTER),
//                      Click.on(DetalleIniciarSesion.BUT_INICIAR_SESION_FORMULARIO)
              );
        System.out.println("chao");
    }

    public static Performable correoContrasena(String correo, String contrasena){
        return instrumented(SeleccionarInicioSesion.class, correo, contrasena);
    }
}
