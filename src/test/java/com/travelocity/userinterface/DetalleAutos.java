package com.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleAutos {
    public static final Target BUT_ENTREGA_AUTO = Target.the("button de entrega auto").locatedBy("//button[@data-stid='location-field-locn-menu-trigger']");
    public static final Target INP_ENTREGA_AUTO = Target.the("input entrega auto").locatedBy("//input[@id='location-field-locn']");
    public static final Target BUT_DEVOLUCION_AUTO = Target.the("button de Devolucion auto").locatedBy("//button[@data-stid='location-field-loc2-menu-trigger']");
    public static final Target INP_DEVOLUCION_AUTO = Target.the("input devolucion auto").locatedBy("//input[@id='location-field-loc2']");
    public static final Target SELECCIONAR_FECHA_ENTREGA = Target.the("selector de fecha de entrega").locatedBy("//button[@id='d1-btn']");
    public static final Target SELECCIONAR_FECHA_DEVOLUCION = Target.the("selector fecha devolucion").locatedByFirstMatching("//button[@data-day='17']");
    public static final Target BUT_LISTO_FECHAS = Target.the("button listo fechas").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target SELECT_HORA_ENTREGA = Target.the("select de horas de entrega").locatedBy("//select[@aria-label='Hora de entrega']");
    public static final Target SELECT_HORA_DEVOLUCION = Target.the("select de horas de devolucion").locatedBy("//select[@aria-label='Hora de devolución']");
    public static final Target BUT_BUSCAR_AUTOS = Target.the("boton buscar autos").locatedBy("//button[@data-testid='submit-button']");
    public static final Target INP_CHECK_AUTO = Target.the("input check de auto").locatedBy("//input[@id='aarp-checkbox-toggle']/../..");
}
