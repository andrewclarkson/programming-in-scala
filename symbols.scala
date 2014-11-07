def converter(t: Symbol, data: String): Any = t match {
  case 'string => data
  case 'int => Integer.parseInt(data)
  case 'char => data.charAt(0)
}

println(converter('string, "hello"))
println(converter('int, "5"))
println(converter('char, "☭"))

case class Bank(balance: Int) {
  def apply(method: Symbol)(amount: Int): Bank = method match {
    case 'deposit => Bank(balance + amount)
    case 'withdraw => Bank(balance - amount)
    case 'print => {
      println(balance)
      Bank(balance)
    }
  }
}
Bank(10)('deposit)(10)('withdraw)(10)('print)(8888)
