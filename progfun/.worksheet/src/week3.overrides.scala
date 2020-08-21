package week3

object overrides {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala woksheet")}
}

abstract class Base{
	def foo = 1
	def bar : Int
}

class Sub extends Base{
	override def foo = 2
	def bar = 3
}
