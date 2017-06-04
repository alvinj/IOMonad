
/**
  * contains the `getLine` and `putStrLn` functions
  * that use the IO Monad
  */
package object io_monad {

    def getLine: IO[String] = IO(scala.io.StdIn.readLine())
    def putStrLn(s: String): IO[Unit] = IO(println(s))

}
