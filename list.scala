val greetings = "Hi" :: "Hello" :: "What's up?" :: Nil

val goodbyes = List("Goodbye", "Farewell", "See you later")

val combined = greetings ::: goodbyes

if (args.length == 1) combined.map(s => s + " " + args(0)).foreach(println)

