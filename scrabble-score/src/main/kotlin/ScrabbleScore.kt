object ScrabbleScore {
    private val letterValues: Map<Char, Int> = mapOf(
            *('A'..'Z').map {
                it to when {
                    "AEIOULNRST".contains(it) -> 1
                    "DG".contains(it) -> 2
                    "BCMP".contains(it) -> 3
                    "FHVWY".contains(it) -> 4
                    "K".contains(it) -> 5
                    "JX".contains(it) -> 8
                    "QZ".contains(it) -> 10
                    else -> 0
                }
            }.toTypedArray())

    private fun scoreLetter(c: Char): Int = letterValues.getValue(c)

    fun scoreWord(word: String): Int =
            word.sumBy { scoreLetter(it.toUpperCase()) }
}

