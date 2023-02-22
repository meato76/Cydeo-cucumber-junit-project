Feature: Cucumber Data Tables implementation practices


  Scenario: List of fruits and vegetables I like
    Then use should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |

    #To beautify the pipes above
    #MAC : Command + option + L
    #Windows : control + alt +L

    # Create a new scenario where we list the type of pets we love
    # print out all the string in the List

  Scenario: List of pet types I love
    Then  I will share my favorites
      | Kangal           |
      | Husky            |
      | Golden Retriever |
      | Golden Doodle    |
      | Munchkin         |
      | Ragdoll cat      |
      | Siberian cat     |


  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane         |
      | surname | Doe          |
      | age     | 29           |
      | address | somewhere    |
      | state   | CA           |
      | zipcode | 99999        |
      | phone   | 555-555-5555 |

  @dataTable
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January |
      | February |
      | March |
      | April |
      | May |
      | June |
      | July |
      | August |
      | September |
      | October |
      | November |
      | December |




