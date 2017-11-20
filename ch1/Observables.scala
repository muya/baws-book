package ch1

import scala.concurrent.duration._

import rx.lang.scala.Observable

object SimpleRx extends App {
  val o = Observable.interval(100.millis).take(5)

  o.subscribe(x => println(s"Got it: $x"))

  Thread.sleep(1000)

  Observable
    .just(1, 2, 3, 4, 100, 200)
    .reduce(_ + _)
    .subscribe(r => println(s"Sum 1, 2, 3, 4 is $r found in a Rx way"))
}
