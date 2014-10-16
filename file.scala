import scala.io.Source

if(args.length == 1)
    for(line <- Source.fromFile(args(0)).getLines())
        println(line)
