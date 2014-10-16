import scala.io.Source

def widthOfNumber(number: Integer) = number.toString.length

if (args.length == 1) {
    val lines = Source.fromFile(args(0)).getLines().toList
    val longest = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b
    )
    val maxWidth = widthOfNumber(longest.length)
    for (line <- lines) {
        val numberOfSpaces = maxWidth - widthOfNumber(line.length)
        val padding = " " * numberOfSpaces
        println(padding + line.length + " | " + line)
    }
}
