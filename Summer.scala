import ChecksumAccumulator.calculate

object Summer extends App {
  args.foreach(arg => println(arg + ": " + calculate(arg)))
}
