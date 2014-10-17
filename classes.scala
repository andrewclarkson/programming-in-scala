class ChecksumAccumulator {
  private var sum = 0
  
  def add(byte: Byte): Unit = {
    sum += byte
  }
  
  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
}

val accumulator = new ChecksumAccumulator

for(char <- "Hello World".getBytes()) {
  accumulator.add(char)
}

println(accumulator.checksum())
