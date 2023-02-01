package com.travelocity.userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class DetalleIniciarSesion {

    public static final Target A_INICIAR_SESION = Target.the("enlace iniciar sesion").locatedBy("//a[@data-stid='link-header-account-signin']");
    public static final Target INP_CORREO_ELECTRONICO = Target.the("Input correo electronico").locatedBy("//input[@id='loginFormEmailInput']");
    public static final Target INP_CONTRASENA = Target.the("Input contraseña").locatedBy("//input[@id='loginFormPasswordInput']");
    public static final Target INP_CAJA_SELECCION = Target.the("Caja seleccion mantener sesion abierta").locatedBy("//input[@id='loginFormRememberMeCheck']");
    public static final Target BUT_INICIAR_SESION_FORMULARIO = Target.the("button iniciar sesion formulario").locatedBy("//button[@id='loginFormSubmitButton']");
}
