import scala.collection.mutable.Map

class ChecksumAccumulator {
  private var sum = 0
  
  def add(byte: Byte) { sum += byte }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  private val cache = Map[String, Int]()

  def calculate(string: String): Int = 
    if(cache.contains(string))
      cache(string)
    else {
      val accumulator = new ChecksumAccumulator
      for(byte <- string.getBytes()) {
        accumulator.add(byte)
      }
      val checksum = accumulator.checksum()
      cache += (string -> checksum)
      checksum
    }
}

println(ChecksumAccumulator.calculate("Hello World"))
