# language: es
Característica: Vuelos redondos
  Yo como viajero
  quiero diseñar vuelos de ida y regreso
  para facilitar mis viajes de paseo

  Escenario: vuelo redondos con opciones por defecto
    Dado Yoimar esta en "Medellin"
    Cuando quiera viajar a "Cancun" por 15 dias
    Entonces debe obtener alguna opcion de vuelo

  @manual
  Escenario: vuelo redondos con opcion clase economica premium
    Dado Diego esta en Medellin
    Cuando quiera viajar a Cancun agregando un hospedaje por 15 dias
    Entonces debe obtener al menos una opcion de viaje

  @manual
  Escenario: vuelo redondo con opcion de agregar auto
    Dado Laura esta en Medellin
    Cuando quiera viajar a Cancun agregando un auto
    Entonces debe obtener alguna opcion de auto

  @manual
  Escenario: vuelo redondo con opcion de agregar hospedaje
    Dado Diego esta en Medellin
    Cuando quiera viajar a Cancun con hospedaje por 8 dias
    Entonces debe obtener alguna opcion de vuelo
    Y debe obtener alguna opcion de hospedaje






