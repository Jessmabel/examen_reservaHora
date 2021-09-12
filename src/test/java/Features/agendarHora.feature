Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: Verificacion de ingreso de sesion
Given Abrir Chrome
When ingresar Username "jessica" y Password "1234"
Then inicia sesion y agenda hora ingresando hora "10:00" y fehca "12/12/2021"