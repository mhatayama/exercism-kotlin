object ArmstrongNumber {
    fun check(input: Int): Boolean =
            "$input".sumBy { "$it".toInt().pow("$input".length) } == input

    private fun Int.pow(n: Int): Int = if (n == 1) this else this * pow(n - 1)
}
