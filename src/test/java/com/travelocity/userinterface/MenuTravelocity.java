package com.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MenuTravelocity {
   public static final Target A_VUELOS = Target.the("menu de vuelos").locatedBy("//span[text()='Vuelos']/..");
   public static final Target A_AUTOS = Target.the("menu de autos").locatedBy("//span[text()='Autos']/..");
   public static final Target A_HOSPEDAJE = Target.the("menu de hospedajes").locatedBy("//span[text()='Hospedaje']/..");
}
