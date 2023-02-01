# language: es
Característica: Hospedaje
  Yo como viajero
  quiero realizar mis reservas
  para facilitar mis hospedajes en los lugares que vaya

  Escenario: hospedaje en Cargatena con opciones por defecto
    Dado "Diego" esta en "new york" y desea realizar una reserva en un hotel de la cuidad
    Cuando realice el proceso de reserva por 8 dias para 2 Adultos
    Entonces debe visualizar al menos una opcion de hotel


  Escenario: hospedaje en Cartagena con opcion de agregar auto
    Dado "Fernando" esta en "Cartagena" y desea realizar una reserva de un hotel con auto incluido
    Cuando realice el proceso de reserva por 8 dias para 2 adultos con la opcion de agregar auto
    Entonces debe visualizar al menos una opcion de hotel con auto incluido

  @manual
  Escenario: hospedaje en Cartagena con opcion de agregar vuelo
    Dado "Diego" esta en "Palmira" desea realizar una reserva de hotel en "Cartagena" con opcion de agregar vuelo
    Cuando realice la reserva por 8 dias para 2 adultos con la opcion de agregar un vuelo
    Entonces debe visualizar al menos una opcion de hospedaje con vuelo incluido




