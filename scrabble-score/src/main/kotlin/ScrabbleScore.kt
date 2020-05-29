object ScrabbleScore {
    private val letterValues: Map<Char, Int> = mapOf(
            "AEIOULNRST" to 1, "DG" to 2, "BCMP" to 3,
            "FHVWY" to 4, "K" to 5, "JX" to 8, "QZ" to 10
    ).flatMap { (letters, score) -> letters.map { it to score } }.toMap()

    private fun scoreLetter(c: Char): Int = letterValues.getValue(c)

    fun scoreWord(word: String): Int =
            word.sumBy { scoreLetter(it.toUpperCase()) }
}

