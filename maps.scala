var phonebook = Map(
    "James" -> "555-555-5555", 
    "Joseph" -> "333-333-3333",
    "Henry" -> "444-444-4444"
)

def isEven(number: Int): Boolean = number % 2 == 0

if (args.length > 0 && isEven(args.length)) {
    for(pair <- args grouped 2) {
        phonebook += (pair(0) -> pair(1))
    }
}

phonebook.foreach({ 
    case (name, number) => println(s"$name: $number")
})
