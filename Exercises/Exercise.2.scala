object Exercise2
{
   def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean =
   {
      @annotation.tailrec
      def go(n: Int): Boolean =
      {
         if (n >= as.length-1)
            true
         else
            if (gt(as(n+1), as(n)))
               go(n+1)
            else
               false
      }
      
      if (as.length == 1)
         true
      else
         go(0)
   }
   
   def main(args: Array[String]): Unit =
      println("isSorted(Array(7, 9, 13), (x: Int, y: Int) => (x >= y))")
      println(isSorted(Array(7, 9, 13), (x: Int, y: Int) => (x >= y)))
      
      println("isSorted(Array(7), (x: Int, y: Int) => (x >= y))")
      println(isSorted(Array(7), (x: Int, y: Int) => (x >= y)))
      
      println("isSorted(Array(7, 19, 13), (x: Int, y: Int) => (x >= y))")
      println(isSorted(Array(7, 19, 13), (x: Int, y: Int) => (x >= y)))
      
      println("isSorted(Array(7.1, 9.5, 13.2), (x: Double, y: Double) => (x >= y))")
      println(isSorted(Array(7.1, 9.5, 13.2), (x: Double, y: Double) => (x >= y)))
      
      println("isSorted(Array(), (x: Int, y: Int) => (x >= y))")
      println(isSorted(Array(), (x: Int, y: Int) => (x >= y)))
}
