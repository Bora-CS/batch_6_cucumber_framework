
Feature: Add Experience and Add Education to User Profile

  Scenario: User Logs In
    Given User is on Home Page
    When User clicks on Login Button
    Then User enters <email> and <password>
    | john.test@gmail.com   |  Test123 |
    | john.test1@gmail.com  | Test1234 |
    
  Scenario: User Adds Experience 
    When User clicks Add Experience Button
    Then User Adds <jobTitle> <company> <location> <fromDate> <toDate> and <jobDescription> to Experience
    
  Scenario: User Adds Experience 
    When User clicks Add Education Button
    Then User Adds <school> <degreeCertificate> <fieldOfStudy> <fromDate> <toDate> and <programDescription> to Education

    Examples: 
      | jobTitle |  company |    location   | fromDate |  toDate  |               jobDescription               |
      | teacher  | BoraTech | Annandale, VA | 08-01-21 | 08-25-21 |    quality instruction and mild judgement  |
      |instructor| Hogwarts |  SixFlags, FL | 08-25-21 |          | dark arts magic, cult leader, serpent play |

 			|     school     |  degreeCertificate |  fieldOfStudy | fromDate |  toDate  |              programDescription            |
      |   CodingBat    |                    |      Java     | 10-01-14 | 09-10-16 |         practice practice practice         |
      |Voldemort's Lair|  darkest darkness  | the dark arts | 06-15-95 | 05-02-13 | dark arts magic, cult leader, serpent play |

