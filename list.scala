val greetings = "Hi" :: "Hello" :: "What's up?" :: Nil

val goodbyes = List("Goodbye", "Farewell", "See you later")

val combined = greetings ::: goodbyes

if (args.length == 1) {
    val index = args(0).toInt
    if(index < combined.length && index >= 0) {
        println(s"""Removing: "${combined(index)}"""")
        combined.patch(index, Nil, 1).foreach(println)
    }
}
