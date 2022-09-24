import scala.collection.mutable.PriorityQueue

class Competition(val name: String):
  var teams: PriorityQueue[Team] = PriorityQueue()

  def add_team(t: Team) =
    teams.addOne(t)

  override def toString() =
    s"Comp: ${name}\n ${teams}"