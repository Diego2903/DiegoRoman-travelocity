package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarClaseVuelo;
import com.travelocity.tasks.SeleccionarDestinoVuelos;
import com.travelocity.tasks.SeleccionarDestinoVuelosConHospedaje;
import com.travelocity.tasks.SeleccionarOrigenVuelos;
import com.travelocity.userinterface.DetalleVuelos;
import com.travelocity.userinterface.VuelosEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VuelosRedondosStepDefinitions {

    @Dado("{actor} esta en {string}")
    public void viajeOrigen(Actor actor, String origen) {
        actor.attemptsTo(
            SeleccionarOrigenVuelos.para(origen)
        );
    }

    @Cuando("quiera viajar a {string} por {int} dias desde la fecha actual")
    public void viajeDestinoConDias(String destino, Integer cantDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            SeleccionarDestinoVuelos.destinoYDias(destino, cantDias)
        );
    }

    @Entonces("debe obtener al menos una opcion de vuelo")
    public void viajeObtenerAlgunaOpcion() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Dado("{actor} esta en {string} y desea tomar un vuelo en {string}")
    public void vueloEnClaseEconomicaPremium(Actor actor, String origen, String claseVuelo) {
        actor.attemptsTo(
                SeleccionarOrigenVuelos.para(origen),
                SeleccionarClaseVuelo.en(claseVuelo)
        );
    }
    @Cuando("realice el proceso para viajar a {string} por {int} dias desde la fecha actual")
    public void viajeDestino(String destinoViaje, int diasViaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelos.destinoYDias(destinoViaje, diasViaje)
        );
    }
    @Entonces("debe obtener al menos una opcion de vuelo en clase economica premium")
    public void opcionViajeEnClaseEconomica() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Dado("{actor} esta en {string} y desea viajar")
    public void agregarAutoParaEstadia(Actor usuario, String origenUsuario) {
        usuario.attemptsTo(
                SeleccionarOrigenVuelos.para(origenUsuario)
        );
    }
    @Cuando("realice el proceso para viajar a {string} por {int} dias desde la fecha actual con la opcion agregar un auto")
    public void viajeOpcionAgregarAuto(String destinoViaje, Integer cantDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(DetalleVuelos.INP_CHECK_VUELOS).afterWaitingUntilEnabled(),
                SeleccionarDestinoVuelos.destinoYDias(destinoViaje, cantDias)
        );
    }
    @Entonces("debe obtener al menos una opcion de vuelo con auto incluido")
    public void obtenerOpcionVueloYAuto() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Dado("{actor} esta en {string} y desea viajar con hospedaje incluido")
    public void viajeConHospedaje(Actor usuario, String origenUsuario) {
        usuario.attemptsTo(
                SeleccionarOrigenVuelos.para(origenUsuario)
        );
    }
    @Cuando("realice el proceso para viajar a {string} por {int} dias desde la fecha actual con hospedaje por {int} dias")
    public void realice_el_proceso_de_para_viajar_a_cancun_con_hospedaje_por_dias(String destinoVuelo, Integer cantDias, Integer cantDiasHospedaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelosConHospedaje.diasHospedaje(cantDiasHospedaje),
                SeleccionarDestinoVuelos.destinoYDias(destinoVuelo, cantDias)
        );
    }
    @Entonces("debe obtener al menos una opcion de vuelo con hospedaje incluido")
    public void debe_obtener_al_menos_una_opcion_de_vuelo_con_hospedaje_incluido() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

}
