Feature: Realizacion de casos ingresando nombre de usuario y contraseņa
Scenario: Verificacion de ingreso de sesion
Given Abrir Chrome
When ingresar Username "jessica" y Password "12345"
Then inicia sesion