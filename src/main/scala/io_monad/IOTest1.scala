package io_monad

object IOTest1 extends App {

    for {
        _         <- putStrLn("First name?")
        firstName <- getLine
        _         <- putStrLn(s"Last name?")
        lastName  <- getLine
        _         <- putStrLn(s"First: $firstName, Last: $lastName")
    } yield ()

}
