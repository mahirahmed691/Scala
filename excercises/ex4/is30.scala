object is30 {

    def isNums30(x: Int, y: Int): Boolean = {
        x + y == 30 || x == 30 || y == 30 
    } 

    def main(args: Array[String]): Unit = {
        println("Result: " + isNums30(1, 1))
        println("Result: " + isNums30(30, 1))
        println("Result: " + isNums30(29, 1))
    }
}