
import pkg_basicsScalaDemo.objectBasicFunctions.*
import pkg_basicsScalaDemo.Person
import pkg_basicsScalaDemo.enumDemo.TrafficLight.Yellow
import pkg_basicsScalaDemo.enumDemo.drivingSignal
import pkg_basicsScalaDemo.enumDemo.triathlon.Swim
import pkg_basicsScalaDemo.enumDemo.triathlonDistanceMeasurement

@main
def main(): Unit = {
  Unit1_Scala_Basics()
//  println(Unit2_Case_Class_Demo())
//  println((greeting_from_inside_function(f_details = Person(name = "Muaaz", age = 26))))
//  println(s"Traffic Light right now is on ${Uni3_enumDemo()}")
//  println(triathlonDistanceMeasurement(Swim))
}


def Unit1_Scala_Basics():Unit =
  println("Programmer's first Words: Hello world!")
  println("Let us try to sum up 2 and 2 with user defined funtion computed in 'BasicFunctionsDemo'")
  println(sum(2, 2))
  println("Great!, Let us try some if else. ")
  println(lightSwitch(switchOn = true))
  println("Awesome! Greeting to coder? Here you Go.")
  println((greetings(name = "Muaaz")))
  println("Thanks! Can we make a party of 20 people?")
  println((partyAtHome(noOfGuests = 20, tentAvailable = true)))
  println("It is sunny outside. No need for umbrella. Few Moments Later.....")
  println(weather(sunny = false))


def Unit2_Case_Class_Demo():String =
  val details:Person = Person(name = "Muaaz", age = 26)
  s"Hello ${details.name}, Your age is ${details.age}"

def greeting_from_inside_function(f_details:Person):String =
  s"Hello ${f_details.name} from inside function, Your age is ${f_details.age}"

def Uni3_enumDemo():String = drivingSignal(Yellow)



