var map = Map(1 -> "David", 2 -> "Elwood")
map = map + (3 -> "dang")
map = map ++ List((4 -> "444"), (5 -> "555"), (6 -> "666"))
map = map -- List(5, 6)

val name = map(3)
map - 3
val hava3 = map.contains(3)
val keys = map.keys

