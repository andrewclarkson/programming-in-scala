import scala.io.Source

if(args.length == 1) 
    Source.fromFile(args(0)).getLines().foreach(println)
