package ch1.commons

object MainApp extends App {
  show(s"PI is: $PI")

  show(constraintsHolder.getClass.toString)

  show(isOdd(5))
  show(isOdd(7))

  show(isEven(2))
  show(isEven(10))
}
