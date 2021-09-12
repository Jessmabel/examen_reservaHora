Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: Verificacion de ingreso de sesion
Given Abrir Chrome
When ingresar Username "jessica" y Password "1234"
Then inicia sesion