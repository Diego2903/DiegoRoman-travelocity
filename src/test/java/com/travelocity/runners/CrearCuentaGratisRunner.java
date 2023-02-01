package com.travelocity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/iniciarsesion/crear_una_cuenta_gratis.feature",
        glue = {"com.travelocity.stepdefinitions"}
)
public class CrearCuentaGratisRunner {}