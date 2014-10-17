class ChecksumAccumulator {
    private var sum = 0
}

val acc = new ChecksumAccumulator
val csa = new ChecksumAccumulator

acc.sum = 1

println(csa.sum)
