import week3._

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(106); 
//  new Rational(1, 2)
  
  def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(19); val res$0 = 
  
  error("test");System.out.println("""res0: Nothing = """ + $show(res$0));$skip(18); 
  
  val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(20); 
  val y: String = x;System.out.println("""y  : String = """ + $show(y ));$skip(25); val res$1 = 

	if (true) 1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1))}
}
