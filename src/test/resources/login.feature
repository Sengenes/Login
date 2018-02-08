Feature: Login GitHub

Como usuario,
quiero usar el servicio GitHub
para tener copias de mi código en forma de repositorio.

Scenario: Usuario válido
	Given un usuario registrado en la pagina
	When se ingresa "usuario valido" en campo user
	When se ingresa "password valida" en campo pass
	When se presiona boton de Login
	Then se muestra la pantalla de sesion iniciada

Scenario: Usuario inválido
	Given un usuario no registrado en la pagina
	When se ingresa "usuario invalido" en campo user
	When se ingresa "password invalida" en campo pass
	When se presiona boton de Login
	Then se muestra mensaje de error