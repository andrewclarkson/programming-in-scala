def converter(t: Symbol, data: String): Any = t match {
  case 'string => data
  case 'int => Integer.parseInt(data)
  case 'char => data.charAt(0)
}

println(converter('string, "hello"))
println(converter('int, "5"))
println(converter('char, "☭"))
