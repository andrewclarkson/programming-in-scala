val greetings = "Hi" :: "Hello" :: "What's up?" :: Nil

val goodbyes = List("Goodbye", "Farewell", "See you later")

(greetings ::: goodbyes).foreach(println)

