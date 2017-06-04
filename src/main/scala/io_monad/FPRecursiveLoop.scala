package io_monad

object FPRecursiveLoop extends App {

    def loop: IO[Unit] = for {
        _     <- putStrLn("Type something: ")
        input <- getLine
        _     <- putStrLn(s"You said '$input'.")
        _     <- if (input == "quit") IO(Unit) else loop  //RECURSE
    } yield ()

    loop.run

}

