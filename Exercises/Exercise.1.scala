object Fibonacci
{
   def fib(aNum: Int): Int =
   {
      @annotation.tailrec
      def go(n: Int, aPrevious: Int, aCurrent: Int): Int =
      {
         if (n <= 0)
            aPrevious
         else
            go(n-1, aCurrent, aPrevious+aCurrent)
      }
      
      go(aNum, 0, 1)
   }
   
   def main(args: Array[String]): Unit =
      println("Fibonacci numbers (first 10):")
      println(fib(0))
      println(fib(1))
      println(fib(2))
      println(fib(3))
      println(fib(4))
      println(fib(5))
      println(fib(6))
      println(fib(7))
      println(fib(8))
      println(fib(9))
}
