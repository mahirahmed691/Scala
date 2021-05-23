object charReplacement {
    def replaceFirstLast(word: String): String ={
        val len = word.toLowerCase.length
        if (len <= 1) word 
        else word.charAt(len -1 ) + word.substring(1, len -1) + word.charAt(0)
    }

    def main(args: Array[String]): Unit = {
        println("Result: " + replaceFirstLast("Mahir"))
        println("Result: " + replaceFirstLast("Ahmed"))
        println("Result: " + replaceFirstLast("is"))
        println("Result: " + replaceFirstLast("Learning"))
        println("Result: " + replaceFirstLast("Scala"))
        println("Result: " + replaceFirstLast("."))
    }
}