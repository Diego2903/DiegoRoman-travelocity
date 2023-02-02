package com.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleHospedaje {

    public static final Target BUT_DESTINO = Target.the("button de destino hospedaje").locatedBy("//button[@data-stid='location-field-destination-menu-trigger']");
    public static final Target INP_DESTINO = Target.the("input de destino").locatedBy("//input[@id='location-field-destination']");
    public static final Target SELECCIONAR_CHECK_IN = Target.the("selector de fecha de entrada").locatedBy("//button[@id='d1-btn']");
    public static final Target BUT_LISTO = Target.the("boton listo fecha").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target DIV_SELECCIONAR_NUMERO_PERSONAS = Target.the("boton seleccionar numero de personas").locatedBy("//div[@id='adaptive-menu']");
    public static final Target INP_CANTIDAD_PERSONAS = Target.the("input cantidad personas").locatedBy("//input[@id='adult-input-0']/following-sibling::button");
    public static final Target BUT_LISTO_NUMERO_PERSONAS = Target.the("boton listo numero personas").locatedBy("//button[@data-testid='guests-done-button']");
    public static final Target BUT_BUSCAR = Target.the("button buscar hospedaje").locatedBy("//button[@data-testid='submit-button']");
    public static final Target INP_CHECK_AUTO = Target.the("input seleccionar agregar auto").locatedBy("//input[@id='add-car-switch']");

}


