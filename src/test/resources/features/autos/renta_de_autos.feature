# language: es
Característica: Renta de autos

  Escenario: renta de autos con opciones por defecto
    Dado "Diego" esta en "Cali" y quiera rentar un auto con entrega a las "1200PM"
    Cuando realiza el proceso de reserva para 8 dias con entrega en "Cali" con hora de devolucion a las "1200PM"
    Entonces debe obtener al menos una opcion de auto

  @manual
  Escenario: renta de autos con codigo de descuento
    Dado "Fernando" esta en "Paris" desea rentar un auto aplicando un codigo de descuento
    Cuando realice el proceso para aplicar el descuento
    Entonces debe obtener al menos una opcion con el descuento aplicado


  Escenario: renta de autos con opcion incluir tarifa para socios
    Dado "Fernan" esta en "Inglaterra" desea rentar un auto con tarifas para socios AARP
    Cuando realice el proceso de reserva para 8 dias con entrega en "Inglaterra" e incluyendo las tarifas
    Entonces debe obtener al menos una opcion con las tarifas para socios AARP








