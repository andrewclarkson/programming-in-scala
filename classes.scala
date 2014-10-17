import scala.collection.mutable.Map

class ChecksumAccumulator {
  private var sum = 0
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  private val cache = Map[String, Int]()

  def calculate(string: String): Int = 
    cache get string match {
      case Some(checksum) => checksum
      case None => {
        val accumulator = new ChecksumAccumulator
        accumulator.sum = string.getBytes.sum
        val checksum = accumulator.checksum()
        cache put (string, checksum)
        checksum
      }
    }

}

println(ChecksumAccumulator.calculate("Hello World"))
