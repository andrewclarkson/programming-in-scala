val names = Set("James", "Kim", "John", "Hellen")
val newComers = Set("Joey", "Matt", "John")

var combined = names ++ newComers


if (args.length > 0) {
    combined = combined union args.toSet
}

combined.foreach(println)
