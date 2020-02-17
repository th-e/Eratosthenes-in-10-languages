# Eratosthenes-in-10-languages
'Sieve of Eratosthenes' in 10 languages

This is NOT a programming language battle. Learning a few of them makes you a better programmer ;-)

In the new era of AWS lambda and cloud computing resource consumption and startup times are becoming more and more important.

List of languages (tentative):

- Scala
- Python
- Swift
- F#
- C++
- Kotlin
- Java
- Clojure
- Haskell
- Rust

## Performance

The execution time is measured from outside, meaning that the JVM startup time and other stuff is included. The unix 'time' command is used and the values are the 'real time' in millis.

Currently the implementation style (functional, iterative etc.) has a big influence on the performance. There is some hope that this will change in the future.

Readable and maintainable code should always be the primary goal.

The eratosthenes sieve is searching for primes from 2 to N

Hardware: MacBook Pro 2,2 GHz Intel Core i7


Language / N | 5 | 6 | 7 | 8 | 9
------------ | - | - | - | - | -
ScalaNative mutable&iterative | 4 | 10 | 69 | 805 | 8460



## References
- https://rosettacode.org/wiki/Sieve_of_Eratosthenes
- https://medium.com/coding-with-clarity/functional-vs-iterative-prime-numbers-in-scala-7e22447146f0
- https://github.com/qrider71/PolyDev
