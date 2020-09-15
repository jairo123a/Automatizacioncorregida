Feature: Ingresar al sitio web hospitales y registrar

Background:
  Given Ingresar a la Página del Sistema de Administración de Hospitales

  Scenario: Ingresar al sitio web y registrar un doctor
    When  Ingrese al menú AGREGAR DOCTOR y crear un nuevo registro.
      |nombre|apellido | telefono |documento           | cedula |
      | jairo|henao    |3013996019|Cédula de ciudadanía|50      |
    Then  Verificar el mensaje de ingreso exitoso del registro para doctor "Datos guardados correctamente."

  Scenario: Ingresar al sitio web y registrar un paciente
    When  Ingrese al menú AGREGAR Un paciente y crear un nuevo registro.
      |nombre|apellido | telefono |documento           | cedula       |
      | jairo|henao    |3013996019|Cédula de ciudadanía|50             |
    Then  Verificar el mensaje de ingreso exitoso para paciente  del registro "Datos guardados correctamente."

  Scenario: Ingresar al sitio web y realizar una cita
    When  Ingrese al menú agendar cita y agregarla.
      |fechacita |documentopaciente | documentodoctor   |observacion          |
      |10/09/2020|50                |50                |una cita automatizada|
    Then  Verificar el mensaje de ingreso exitoso para agendar cita "Datos guardados correctamente."