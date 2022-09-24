@main def hello: Unit =
  val t1 = Team("Clonmore")
  val t2 = Team("Kilbride")
  val t3 = Team("Eire Og")
  val t4 = Team("Pal")

  for i <- 0 until 10 do t1.increment_points()
  for i <- 0 until 20 do t2.increment_points()
  for i <- 0 until 3 do t3.increment_points()

  val c1 = Competition("League")
  c1.add_team(t1)
  c1.add_team(t2)
  c1.add_team(t3)
  c1.add_team(t4)

  print(c1)
  for t <- c1.teams do println(t)



