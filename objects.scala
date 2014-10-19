class Rational(numerator: Int, denominator: Int) {
  require(denominator != 0)
  override def toString = numerator + "/" + denominator
}

val three_fourths = new Rational(3, 4)
println(three_fourths)
