object absDifference {
	def nDifference(n: Int): Int = {
		val abs_diff = Math.abs(n - 51) 
		if (n > 51) (abs_diff * 3) else abs_diff 
	}

	def main(args: Array[String]): Unit = {
	   println("Result: " + nDifference(53))
	   println("Result: " + nDifference(3))
	}
}
