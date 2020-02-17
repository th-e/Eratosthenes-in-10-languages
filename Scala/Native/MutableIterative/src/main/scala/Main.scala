import scala.math.sqrt
import scala.collection.mutable.MutableList
import scala.collection.mutable.ListBuffer

object Main {

  def findPrimes(n: Int): ListBuffer[Int] = {
    var sieve = new Array[Boolean](n)
    var primes =  new ListBuffer[Int]
    val sqrtN: Int = sqrt(n.toDouble).toInt

    primes = primes += 2
    for (i <- 3 until n by 2) {
      if (!sieve(i)) {
        primes = primes += i
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
