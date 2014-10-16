val greetings = "Hi" :: "Hello" :: "What's up?" :: Nil

val goodbyes = List("Goodbye", "Farewell", "See you later")

val combined = greetings ::: goodbyes

combined.drop(2).dropRight(2).foreach(println)

