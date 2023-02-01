# language: es
Característica: Iniciar sesion

  Escenario: crear una cuenta gratis
    Dado que quiero crear una cuenta gratis
    Cuando quiera registrarme
    Entonces debe obtener el formulario de registro

  @manual
  Escenario: vuelo redondo con opcion clase economica premium
    Dado Diego esta en "MedellÍn"
    Cuando quiera viajar a "Cancún" por 15 dias
    Entonces debe obtener al menos una opcion de viaje

  @manual
  Escenario: vuelo redondo con opcion de agregar auto
    Dado Laura esta en "MedellÍn"
    Cuando quiera viajar a Cancun agregando un auto
    Entonces debe obtener alguna opcion de auto

  @manual
  Escenario: vuelo redondo con opcion de agregar hospedaje
    Dado "Diego" esta en "Medellin"
    Cuando quiera viajar a Cancun con hospedaje por 8 dias
    Entonces debe obtener alguna opcion de vuelo
    Y debe obtener alguna opcion de hospedaje






