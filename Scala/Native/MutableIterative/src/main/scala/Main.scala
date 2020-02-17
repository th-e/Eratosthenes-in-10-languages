import scala.math.sqrt
import scala.collection.mutable.MutableList

object Main {

  def findPrimes(n: Int): MutableList[Int] = {
    var sieve = new Array[Boolean](n)
    var primes = MutableList.empty[Int]
    val sqrtN: Int = sqrt(n.toDouble).toInt

    primes = primes :+ 2
    for (i <- 3 until n by 2) {
      if (!sieve(i)) {
        primes += i
        if (i < sqrtN) {
          for (j <- i * i until n by 2 * i) {
            sieve.update(j, true)
          }
        }
      }
    }
    primes
  }

  def main(args: Array[String]): Unit = {
    if (args.length == 0) {
        println("please provide the upper limit as integer value")
    }
    val count = findPrimes(args(0).toInt).length
    //println(findPrimes(100).deep.mkString("\n"))	
    println(s"ScalaNative MutableIterative: Found $count primes")
  }

}
