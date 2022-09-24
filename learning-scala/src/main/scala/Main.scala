@main def hello: Unit =
  val t1 = Team("Clonmore")
  val t2 = Team("Kilbride")
  val t3 = Team("Eire Og")
  val t4 = Team("Pal")

  val c1 = Competition("League")
  c1.add_team(t1)
  c1.add_team(t2)
  c1.add_team(t3)
  c1.add_team(t4)

  print(c1)
  for t <- c1.teams do println(t)



