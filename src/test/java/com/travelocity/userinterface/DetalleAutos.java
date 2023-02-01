package com.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleVuelos {
    public static final Target BUT_ORIGEN = Target.the("button de origen").locatedBy("//button[@data-stid='location-field-leg1-origin-menu-trigger']");
    public static final Target INP_ORIGEN = Target.the("input de origen").locatedBy("//input[@id='location-field-leg1-origin']");
    public static final Target BUT_DESTINO = Target.the("button de destino").locatedBy("//button[@data-stid='location-field-leg1-destination-menu-trigger']");
    public static final Target INP_DESTINO = Target.the("input de destino").locatedBy("//input[@id='location-field-leg1-destination']");
    public static final Target SELECCIONAR_DATE_REGRESO = Target.the("selector de fecha salida").locatedBy("//button[@id='d2-btn']");
    public static final Target DATE_REGRESO = Target.the("calendar fecha regreso").locatedByFirstMatching("//button[@data-day='17']");
    public static final Target BUT_SELECCIONAR_CLASE_VUELO = Target.the("boton seleccionar clase vuelo").locatedBy("//button[@id='preferred-class-input-trigger']");
    public static final Target A_SELECCIONAR_CLASE_VUELO = Target.the("Anchor seleccionar clase vuelo").locatedBy("//*[@id='preferred-class-input']/div/div");
    public static final Target BUT_LISTO = Target.the("boton listo fecha").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target BUT_BUSCAR = Target.the("button buscar vuelos").locatedBy("//button[@data-testid='submit-button']");
    public static final Target INP_CHECK_AUTO = Target.the("Input checkbox agregar auto").locatedBy("//input[@id='add-car-checkbox']");
    public static final Target INP_CHECK_HOSPEDAJE = Target.the("Input checkbox agregar hospedaje").locatedBy("//input[@id='add-hotel-checkbox']");


}
