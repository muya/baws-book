package ch1

import rx.lang.scala.Observable

object ComplexRx extends App {
  Observable
    .just(1,2,3,4,5,6,7,8,9,10)
    .filter(x => x % 2 == 0)
    .take(2)
    .reduce(_ + _ )
    .subscribe(r => println(s"#1 $r"))

  val o1 = Observable
    .just(1,2,3,4,5,6,7,8,9,10)
    .filter(x => x % 2 == 0)
    .take(3)
    .map(n => n * n)

  val o2 = Observable
    .just(1,2,3,4,5,6,7,8,9,10)
    .filter(x => x % 2 != 0)
    .take(3)
    .map(n => n * n)

  val o3 = o1.merge(o2).subscribe(r => println(s"#2 $r"))
}
