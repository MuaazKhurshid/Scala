package pkg_basicsScalaDemo

object objectBasicFunctions {
  def sum(n1: Int, n2: Int): Int = n1 + n2

  def lightSwitch(switchOn: Boolean = false): String = if switchOn then "Light is On!" else "Light is Off!"

  def greetings(name: String = "Stranger"): String = s"Hi $name"

  def partyAtHome(noOfGuests: Integer, tentAvailable: Boolean): String =
    if noOfGuests <= 15 && tentAvailable then "Party Scene Done"
    else if noOfGuests <= 25 && tentAvailable then "We can manage! Scene Done"
    else "Make your pocket empty man!"

  def weather(sunny: Boolean): String =
    sunny match
      case true => "Damn, Bring my sunglasses!"
      case false => "Damn, Raining Again, Umbrella please!"
}
