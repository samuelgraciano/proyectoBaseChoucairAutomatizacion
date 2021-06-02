# Autor: Samuel R Graciano Cardona

@stories
  Feature: Academy chourcair
    As a user, I want to learn how to automate in screamplay at the choucair Academy
    with the automation course

    @scenario1
    Scenario Outline: Search for a automation course
      Given than samuel wants to learn automation at the academy Choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      When he search for the course on the choucair academy platform
        | strCourse   |
        | <strCourse> |
      Then he finds the course called resourses
        | strCourse   |
        | <strCourse> |

      Examples:
        | strUser    | strPassword   | strCourse                                      |
        | 1128404135 | Choucair2021* | You don't have permission to view courses here |

