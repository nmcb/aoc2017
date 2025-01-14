object Day01 extends App:

  val day: String =
    this.getClass.getName.drop(3).init

  val start1: Long = System.currentTimeMillis
  val answer1: Int = 666
  println(s"Answer day $day part 1: ${answer1} [${System.currentTimeMillis - start1}ms]")

  val start2: Long = System.currentTimeMillis
  val answer2: Int = 666
  println(s"Answer day $day part 2: ${answer2} [${System.currentTimeMillis - start2}ms]")
