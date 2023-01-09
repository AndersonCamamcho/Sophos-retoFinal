Feature: Yo como usuario de demoqa, deseo escoger una fecha

  Scenario: Escoger fecha
    Given  el usuario quiere configurar fehca
    When  escoja las fechas
    Then  Se mostraran las fechas escogidas