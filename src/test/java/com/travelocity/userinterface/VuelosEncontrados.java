package com.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleVuelos {
    public static final Target BUT_ORIGEN = Target.the("input de origen").locatedBy("//button[@data-stid='location-field-leg1-origin-menu-trigger']");
    public static final Target INP_ORIGEN = Target.the("input de origen").locatedBy("//input[@id='location-field-leg1-origin']");
    public static final Target BUT_DESTINO = Target.the("button de origen").locatedBy("//button[@data-stid='location-field-leg1-destination-menu-trigger']");
    public static final Target INP_DESTINO = Target.the("input de destino").locatedBy("//input[@id='location-field-leg1-destination']");
    public static final Target SELECCIONAR_DATE_REGRESO = Target.the("selector fecha de regreso").locatedBy("////button[@id='d2-btn']");
    public static final Target DATE_REGRESO = Target.the("fecha de regreso").locatedBy("//button[@data-day='17']");

}
