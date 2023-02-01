# language: es
Característica: Crear una cuenta gratis

  Escenario: crear una cuenta gratis
    Dado "Diego" quiera crear una cuenta gratis
    Cuando quiera registrarse
    Entonces debe obtener el formulario de registro

  @manual
  Escenario: formulario de registro completo
    Dado "Diego" tiene todos los campos del formulario completos
    Cuando quiera continuar
    Entonces debe recibir un mensaje de bienvenida







