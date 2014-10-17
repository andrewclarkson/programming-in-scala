import ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]) {
    args.foreach(arg => println(arg + ": " + calculate(arg)))
  }
}
