val greetings = "Hi" :: "Hello" :: "What's up?" :: Nil

val goodbyes = List("Goodbye", "Farewell", "See you later")

val combined = greetings ::: goodbyes

def parseInt(string: String): Option[Int] = {
    try {
        Some(string.toInt)
    } catch {
        case e:Exception => None
    }
}

if (args.length == 1) {
    parseInt(args(0)) match {
        case Some(index) => {
            if(index >= 0 && index < combined.length) {
                println(s"""Removing: "${combined(index)}"""")
                combined.patch(index, Nil, 1).foreach(println)
            }
        } 
        case _ => {}
    }
}
