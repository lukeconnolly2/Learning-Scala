import scala.collection.*
import scala.collection.mutable.ArrayBuffer

class Competition(val name: String):
  var teams: ArrayBuffer[Team] = ArrayBuffer()
  var points: Map[Team, Int] = Map()
  var contests: ArrayBuffer[Contest] = ArrayBuffer()

  def add_team(t: Team) =
    points += (t -> 0)
    teams.addOne(t)

  override def toString() =
    s"Comp: ${name}\n ${teams}"