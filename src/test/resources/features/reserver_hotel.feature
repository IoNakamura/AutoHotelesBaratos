@Regresion
Feature: Automation of the scenarios of the website TiquetesBaratos

  @RunnerTags
  Scenario: complete successful hotel registration
    Given that Christian wants to reserver one hotel in the page tiquetesbaratos
    When he insert the data in the website
      | Cartagena, Colombia | Christian Camilo | Guzman | Chch@gmail.com | Chch@gmail.com | 57 | 12345667 | 3125346434 | 1037638324 |
    Then He should see successfully messege ¡Paga a tiempo y asegura tu viaje!