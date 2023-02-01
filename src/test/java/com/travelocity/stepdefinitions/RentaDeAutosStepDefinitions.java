package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarDevolucionAuto;
import com.travelocity.tasks.SeleccionarEntregaAuto;
import com.travelocity.userinterface.AutosEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class RentaDeAutosStepDefinitions {

    @Dado("{actor} esta en {string} y quiera rentar un auto")
    public void origenRenta(Actor actor, String cuidadRenta) {
       actor.attemptsTo(
               SeleccionarEntregaAuto.para(cuidadRenta)
       );
    }
    @Cuando("realiza el proceso de reserva para {int} dias con entrega en {string}")
    public void rentaAuto(Integer diasAlquiler, String devolucion) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDevolucionAuto.diasAlquilerYDevolucionAuto(diasAlquiler,devolucion)
        );

    }
    @Entonces("debe obtener al menos una opcion de auto")
    public void obtenerOpcionAuto() {
        Ensure.that(AutosEncontrados.LIST_AUTOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Dado("{actor} esta en {string} desea rentar un auto aplicando un codigo de descuento")
    public void rentaDeAutoConCodigoDescuento(Actor actor, String opcionAuto) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("realice el proceso para aplicar el descuento")
    public void aplicarDescuento() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debe obtener al menos una opcion con el descuento aplicado")
    public void obtenerOpcionConDescuento() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Dado("{actor} esta en {string} desea rentar un auto con tarifas para socios AARP")
    public void rentaAutoConTarifaDeSocio(Actor actor, String tarifaSocio) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("realice el proceso incluyendo las tarifas")
    public void tarifaSocio() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debe obtener al menos una opcion con las tarifas para socios AARP")
    public void obtenerTarifaSocioAARP() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
