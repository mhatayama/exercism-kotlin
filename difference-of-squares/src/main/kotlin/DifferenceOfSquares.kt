class Squares(private val num: Int) {
    fun sumOfSquares() = (1..num).sumBy { square(it) }
    fun squareOfSum() = square((1..num).sum())
    fun difference() = squareOfSum() - sumOfSquares()

    private fun square(num: Int) = num * num
}
