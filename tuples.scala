val pointA = (2.4, 58.4, -3.0)
val pointB = (5.4, 58.4, -3.0)

type Point3D = (Double, Double, Double)

def distance(pointA: Point3D, pointB: Point3D): Double = {
    val (x1,y1,z1) = pointA
    val (x2,y2,z2) = pointB
    Math.sqrt(
        Math.pow((x2 - x1), 2) + 
        Math.pow((y2 - y1), 2) + 
        Math.pow((z2 - z1), 2)    
    )
}

println(distance(pointA, pointB))
