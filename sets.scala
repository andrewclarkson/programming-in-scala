val names = Set("James", "Kim", "John", "Hellen")
val newComers = Set("Joey", "Matt", "John")

val combined = names ++ newComers

combined.foreach(println)

if (args.length == 1) {
    if(combined contains args(0)) {
        (combined - args(0)).foreach(println)
    }
}

