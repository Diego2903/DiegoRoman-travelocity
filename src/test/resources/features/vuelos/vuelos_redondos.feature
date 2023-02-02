# language: es
Característica: Vuelos redondos
  Yo como viajero
  quiero diseñar vuelos de ida y regreso
  para facilitar mis viajes de paseo

  Escenario: vuelo redondo con opciones por defecto
    Dado "Yoimar" esta en "Medellín"
    Cuando quiera viajar a "Cancún" por 15 dias desde la fecha actual
    Entonces debe obtener al menos una opcion de vuelo


  Escenario: vuelo redondo con opcion clase economica premium
    Dado Diego esta en "MedellÍn" y desea tomar un vuelo en "Clase económica Premium"
    Cuando realice el proceso para viajar a "Cancun" por 5 dias desde la fecha actual
    Entonces debe obtener al menos una opcion de vuelo en clase economica premium


  Escenario: vuelo redondo con opcion de agregar auto
    Dado Eliza esta en "Medellin" y desea viajar
    Cuando realice el proceso para viajar a "Cancun" por 8 dias desde la fecha actual con la opcion agregar un auto
    Entonces debe obtener al menos una opcion de vuelo con auto incluido


  Escenario: vuelo redondo con opcion de agregar hospedaje
    Dado "Diego" esta en "Medellin" y desea viajar con hospedaje incluido
    Cuando realice el proceso para viajar a "Cancun" por 8 dias desde la fecha actual con hospedaje por 7 dias
    Entonces debe obtener al menos una opcion de vuelo con hospedaje incluido






