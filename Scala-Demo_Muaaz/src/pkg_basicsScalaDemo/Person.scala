package pkg_basicsScalaDemo

case class Person(name: String, age:Int)

def personGreetings(person: Person): String = s"Hi ${person.name}, Your age is ${person.age}"