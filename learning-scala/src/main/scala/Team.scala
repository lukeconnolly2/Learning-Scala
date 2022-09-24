class Team(val name: String):
  var points: Int = 0
  var score_for: Int = 0
  var score_against: Int = 0

  def increment_points() =
    points += 1

  def increment_score_for() =
    score_for += 1

  def increment_score_against() =
    score_against += 1

  override def toString() =
    s"Points: ${points}, Score for: ${score_for}, Score Against: ${score_against} "