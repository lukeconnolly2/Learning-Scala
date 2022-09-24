@main def hello: Unit =
  val clonmore = Team("Clonmore")

  for i <- 0 until 10 do clonmore.increment_points()

  println(clonmore)



