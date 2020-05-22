class DiamondPrinter {
    fun printToList(c: Char): List<String>? {
        val indexOfChar = ('A'..'Z').indexOf(c)
        val upperPart = (0..indexOfChar).map { printLine(indexOfChar, it) }
        return upperPart.let { it + it.reversed().drop(1) }
    }

    private fun printLine(indexOfChar: Int, n: Int): String {
        val leftPart = " ".repeat(indexOfChar - n) + ('A'..'Z').elementAt(n) + " ".repeat(n)
        return leftPart.let { it + it.reversed().drop(1) }
    }
}
