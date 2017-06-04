package io_monad

/**
  * The code in this file is the “IO Monad”
  * I use in my IO Monad lessons.
  */
class IO[A] private (constructorCodeBlock: => A) {

    def run = constructorCodeBlock

    def flatMapOrig[B](f: A => IO[B]): IO[B] = IO(f(run).run)

    def flatMap[B](customAlgorithm: A => IO[B]): IO[B] = {
        val result1: IO[B] = customAlgorithm(run)
        val result2: B = result1.run
        IO(result2)
    }

    def map[B](f: A => B): IO[B] = flatMap(a => IO(f(a)))

}

object IO {
    def apply[A](a: => A): IO[A] = new IO(a)
}
