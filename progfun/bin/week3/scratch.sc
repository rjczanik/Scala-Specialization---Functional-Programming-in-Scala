import week3._

object scratch {
//  new Rational(1, 2)
  
  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
  
  error("test")                                   //> java.lang.Error: test
                                                  //| 	at scratch$.error$1(scratch.scala:6)
                                                  //| 	at scratch$.$anonfun$main$1(scratch.scala:8)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at scratch$.main(scratch.scala:3)
                                                  //| 	at scratch.main(scratch.scala)
  
  val x = null
  val y: String = x

	if (true) 1 else false
}