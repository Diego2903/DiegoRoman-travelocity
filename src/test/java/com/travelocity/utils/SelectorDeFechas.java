package com.travelocity.utils;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;


public class SelectorDeFechas {

    SimpleDateFormat formato = new SimpleDateFormat("d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));

    public String getFechaInicialFormateada() {
        Date fechaInicial = new Date();
        return formato.format(fechaInicial);
    }

    public String getFechaFinalFormateada(Integer diasViaje) {
        Date fechaInicial = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(fechaInicial);
        c.add(Calendar.DATE, diasViaje);
        Date fechaFinal = c.getTime();
        return formato.format(fechaFinal);
    }

}


