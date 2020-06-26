object RomanNumerals {
    fun value(n: Int): String =
            romanDigit(n / 1000, "M", "_", "_") +
                    romanDigit((n / 100) % 10, "C", "D", "M") +
                    romanDigit((n / 10) % 10, "X", "L", "C") +
                    romanDigit(n % 10, "I", "V", "X")

    private fun romanDigit(digit: Int, one: String, five: String, ten: String): String =
            when (digit) {
                0 -> ""
                1, 2, 3 -> one.repeat(digit)
                4 -> one + five
                5 -> five
                6, 7, 8 -> five + one.repeat(digit - 5)
                9 -> one + ten
                else -> throw IllegalArgumentException()
            }
}