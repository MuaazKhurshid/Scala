package pkg_basicsScalaDemo

object enumDemo{

  enum TrafficLight :
    case Red, Yellow, Green

  import TrafficLight.*
  def drivingSignal(light: TrafficLight): String =
    light match
      case Red => "Stop"
      case Yellow => "Steady"
      case Green => "Go"


  enum triathlon(val metres: Int):
    case Swim extends triathlon(metres = 400)
    case Cycle extends  triathlon(metres = 5000)
    case Run extends triathlon(metres = 2500)

  import triathlon.*
  def triathlonDistanceMeasurement(tri: triathlon):Int = tri match
    case swim @ Swim=> swim.metres
    case cycle @ Cycle => cycle.metres
    case run @ Run => run.metres
}
