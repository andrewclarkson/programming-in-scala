val five = 5
val hex_five = 0x5

val octal_five = Integer.parseInt("05", 8);
val binary_five = Integer.parseInt("101", 2);

println(five, hex_five, octal_five, binary_five)

val five_long = 5L
val five_float = 5f
val five_double = 5.0
val five_million = 5e6

println(five_long, five_float, five_double, five_million)

val a = 'a'

// deprecated
// val a_ascii = '\141'

val a_unicode = '\u0061'

val he\u0061rt = '\u2764'

val backslash = '\\'

val ❤ = "heart"

/*
 * If the heart doesn't show check 
 * > System.getProperty("file.encoding");
 * this can be set by:
 * $ export JAVA_OPTS="-Dfile.encoding=UTF-8"
 */
println(a, a_unicode, heart, backslash, ❤)
