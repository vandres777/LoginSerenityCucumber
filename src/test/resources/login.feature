Feature: Login
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username "standard_user" and password "secret_sauce"
    Then the user should be redirected to the home page

#Autor: Andrés León
  #date: 29/01/2024
  #language: Español

#característica: Iniciar sesión
#  Escenario: Inicio de sesión exitoso con credenciales válidas
#    Dado que el usuario está en la página de inicio de sesión
#    Cuando el usuario ingresa credenciales válidas
#    Entonces el usuario debe ser redirigido a la página de inicio

