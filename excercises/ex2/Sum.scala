object Sum {
    
    def checkSum(x: Int, y: Int) : Int = 
        {
            if ( x == y) (x + y) * 3 else x + y 
        }
    
    def main(args: Array[String]): Unit = {
        
        println("Result: " + checkSum(2, 3))
        println("Result: " + checkSum(3, 3))
    }
}