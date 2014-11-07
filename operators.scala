class Rotator(integer: Int, direction: Symbol) {
  def by(amount: Int): Int = direction match {
    case 'right => integer >> amount
    case 'left => integer << amount
  } 
}

class BitInteger(integer: Int) {
  def rotate(direction: Symbol): Rotator = new Rotator(integer, direction)
  def ⊕(other: Int): Int = integer ^ other
  def ∧(other: Int): Int = integer & other
  def ∨(other: Int): Int = integer | other
}

def ¬(integer: Int): Int = ~integer

implicit def intToInt(integer: Int) = new BitInteger(integer)

println(2 rotate 'right by 1 rotate 'left by 1)
println(3 ⊕ 1)
println(4 ∧ 3 ∨ 2)
println( ¬(-3) )
